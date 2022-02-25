package service;

import java.time.OffsetDateTime;
import mapper.MuniLoginMapper;
import model.MuniLogin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtils;

public class MuniLoginService {

  SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

  public MuniLogin muniLogin(int userid, int muni_municode) {
    SqlSession session = sqlSessionFactory.openSession();
    MuniLoginMapper mapper = session.getMapper(MuniLoginMapper.class);
    MuniLogin muniLogin = mapper.selectByUserId(userid, muni_municode);
    if (validateUserMuniAuthPeriod(muniLogin)) {
      return muniLogin;
    }
    return null;
  }

  private boolean validateUserMuniAuthPeriod(MuniLogin muniLogin) {
    OffsetDateTime syncNow = OffsetDateTime.now();
    System.out.println( muniLogin.getStaffstartdate());
    System.out.println( muniLogin.getStaffstopdate());


    if (muniLogin.getRecorddeactivatedts() != null ||
        muniLogin.getStaffstartdate().isAfter(syncNow) ||
        muniLogin.getStaffstopdate().isBefore(syncNow)) {
      System.out.println("user is expired");
      return false;
    }
    return true;
  }

}

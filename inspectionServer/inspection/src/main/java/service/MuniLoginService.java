package service;

import java.time.OffsetDateTime;
import java.util.List;
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
    MuniLogin muniLogin = mapper.selectByUserIdAndMuniCode(userid, muni_municode);
    if (validateUserMuniAuthPeriod(muniLogin)) {
      return muniLogin;
    }
    return null;
  }

  public List<MuniLogin> getMuniLoginListByUserId(int userid) {
    SqlSession session = sqlSessionFactory.openSession();
    MuniLoginMapper mapper = session.getMapper(MuniLoginMapper.class);
    List<MuniLogin> muniLogins = mapper.selectByUserId(userid);
    return muniLogins;
  }

  private boolean validateUserMuniAuthPeriod(MuniLogin muniLogin) {
    OffsetDateTime syncNow = OffsetDateTime.now();
    if (muniLogin.getRecorddeactivatedts() != null ||
        muniLogin.getStaffstartdate().isAfter(syncNow) ||
        muniLogin.getStaffstopdate().isBefore(syncNow)) {
      System.out.println("user is expired");
      return false;
    }
    return true;
  }

}

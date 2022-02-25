package service;

import java.util.List;
import mapper.OccInspectionMapper;
import model.OccInspection;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtils;

public class OccInspectionService {
  SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

  public List<OccInspection> getInspections(int userid, int muni_municode) {
    SqlSession session = sqlSessionFactory.openSession();
    OccInspectionMapper mapper = session.getMapper(OccInspectionMapper.class);
    List<OccInspection> occInspections = mapper.selectAllByUserIdAndMuni(userid, muni_municode);
    return occInspections;
  }
}

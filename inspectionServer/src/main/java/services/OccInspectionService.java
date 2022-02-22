package services;

import com.google.gson.Gson;
import dao.IOccInspectionDAO;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import models.OccInspection;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class OccInspectionService {

  public static SqlSessionFactory sqlSessionFactory;
  public static SqlSession sqlSession;
  public static Reader reader;
  public static IOccInspectionDAO mapper;

  static {
    try {
      Reader reader = Resources.getResourceAsReader("mybatis_config.xml");
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      sqlSessionFactory.getConfiguration().addMapper(IOccInspectionDAO.class);
      sqlSession = sqlSessionFactory.openSession();
      mapper = sqlSession.getMapper(IOccInspectionDAO.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getAllInspections() {

    List<OccInspection> occInspections = mapper.queryAllInspections();
    return new Gson().toJson(occInspections);
  }

  public String getInspectionById(int inspectionID) {
    OccInspection occInspection = mapper.queryInspectionById(inspectionID);
    return new Gson().toJson(occInspection);
  }
}

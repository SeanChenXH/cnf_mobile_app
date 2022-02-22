package dao;

import java.util.List;
import models.OccInspection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IOccInspectionDAO {

  @Select("SELECT * FROM occinspection")
  List<OccInspection> queryAllInspections();

  @Select("SELECT * FROM occinspection WHERE inspectionID = #{inspectionID}")
  OccInspection queryInspectionById(int inspectionID);
}

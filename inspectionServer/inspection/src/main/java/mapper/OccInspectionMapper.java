package mapper;

import java.util.List;
import model.OccInspection;
import model.OccInspectionDispatch;
import org.apache.ibatis.annotations.Param;

public interface OccInspectionMapper {

  List<OccInspection> selectAll();

  OccInspection selectById(int inspectionId);

  List<OccInspection> selectByUserId(int userId);

  List<OccInspection> selectAllByUserIdAndMuni(@Param("userid") int userid, @Param("muni_municode") int muni_municode);

}

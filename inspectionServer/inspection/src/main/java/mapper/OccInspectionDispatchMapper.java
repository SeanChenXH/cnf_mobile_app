package mapper;

import java.util.List;
import model.OccInspectionDispatch;
import org.apache.ibatis.annotations.Param;

public interface OccInspectionDispatchMapper {

  List<OccInspectionDispatch> selectAllByUserIdAndMuni(@Param("userid") int userid, @Param("muni_municode") int muni_municode);
}

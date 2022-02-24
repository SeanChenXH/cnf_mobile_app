package mapper;

import java.util.List;
import model.OccInspection;

public interface OccInspectionMapper {

  List<OccInspection> selectAll();

  OccInspection selectById(int inspectionId);

  List<OccInspection> selectByUserId(int userId);


}

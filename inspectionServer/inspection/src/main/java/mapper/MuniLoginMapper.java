package mapper;

import java.util.List;
import model.MuniLogin;
import org.apache.ibatis.annotations.Param;

public interface MuniLoginMapper {

  List<MuniLogin> selectAll();

  MuniLogin selectByUserIdAndMuniCode(@Param("userid") int userid, @Param("muni_municode") int muni_municode);

  List<MuniLogin> selectByUserId(@Param("userid") int userid);
}

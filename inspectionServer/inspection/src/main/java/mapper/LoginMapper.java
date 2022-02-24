package mapper;

import java.util.List;
import model.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
  List<Login> selectAll();
  Login select(@Param("username") String username, @Param("password") String password);
}

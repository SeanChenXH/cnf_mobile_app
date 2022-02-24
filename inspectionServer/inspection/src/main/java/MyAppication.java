import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import web.LoginController;

@javax.ws.rs.ApplicationPath("/api")
public class MyAppication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> s = new HashSet<Class<?>>();
    s.add(LoginController.class);
    return s;
  }
}

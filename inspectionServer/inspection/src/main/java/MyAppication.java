import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import web.InspectionController;
import web.LoginController;
import web.MuniLoginController;

@javax.ws.rs.ApplicationPath("/api")
public class MyAppication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> s = new HashSet<Class<?>>();
    s.add(LoginController.class);
    s.add(MuniLoginController.class);
    s.add(InspectionController.class);
    return s;
  }
}

package web;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import model.Login;
import model.ResponseMsg;
import service.LoginService;

@Path("/user")
public class LoginController {

  @Context
  private HttpServletResponse response;

  @Context
  private HttpServletRequest request;

  private LoginService loginService = new LoginService();

  @POST
  @Path("/login")
  @Produces("application/json")
  public String login() throws IOException {
    StringBuilder sb = new StringBuilder();
    String s = null;
    while ((s = request.getReader().readLine()) != null) {
      sb.append(s);
    }
    Login login = new Gson().fromJson(sb.toString(), Login.class);
    login = loginService.login(login.getUsername(), login.getPassword());
    if (login != null) {
      request.getSession().setAttribute("userId", login.getUserid());
      response.setStatus(HttpServletResponse.SC_CREATED);
      return new Gson().toJson(new ResponseMsg("user login success"));
    }
    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    return new Gson().toJson(new ResponseMsg("user login fail"));
  }



}

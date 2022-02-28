package web;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import model.Login;
import model.MuniLogin;
import model.ResponseMsg;
import service.MuniLoginService;
import util.HttpServletRequestUtils;

@Path("/muni")
public class MuniLoginController {

  @Context
  private HttpServletResponse response;

  @Context
  private HttpServletRequest request;

  private MuniLoginService muniLoginService = new MuniLoginService();

  @POST
  @Path("/login")
  @Produces("application/json")
  public String muniLogin() throws IOException {
    String requestBody = HttpServletRequestUtils.getRequestBody(request);
    MuniLogin muniLogin = new Gson().fromJson(requestBody, MuniLogin.class);
    Integer userId = (Integer) request.getSession().getAttribute("userId");
    muniLogin = muniLoginService.muniLogin(userId, muniLogin.getMuni_municode());
    if (muniLogin != null) {
      request.getSession().setAttribute("muni_municode", muniLogin.getMuni_municode());
      response.setStatus(HttpServletResponse.SC_CREATED);
      return new Gson().toJson(new ResponseMsg("user muni auth success"));
    }
    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    return new Gson().toJson(new ResponseMsg("user muni auth fail"));
  }

  @GET
  @Path("/login/info")
  @Produces("application/json")
  public String muniInfo() {
    Integer userId = (Integer) request.getSession().getAttribute("userId");
    if (userId == null) {
      response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return new Gson().toJson(new ResponseMsg("login fail"));
    }
    List<MuniLogin> muniLoginList = muniLoginService.getMuniLoginListByUserId(userId);
    response.setStatus(HttpServletResponse.SC_OK);
    return new Gson().toJson(muniLoginList);
  }

}

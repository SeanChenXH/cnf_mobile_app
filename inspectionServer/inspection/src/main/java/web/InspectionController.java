package web;

import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import model.ResponseMsg;

@Path("/inspection")
public class InspectionController {
  @Context
  private HttpServletResponse response;

  @Context
  private HttpServletRequest request;

  @GET
  @Path(("/test"))
  @Produces("application/json")
  public String test() {
    System.out.println(request.getSession().getAttribute("userId"));
    System.out.println(request.getSession().getAttribute("muni_municode"));
    return new Gson().toJson(new ResponseMsg("GOOD"));
  }
}

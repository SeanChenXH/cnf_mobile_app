package web;

import com.google.gson.Gson;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import model.OccInspection;
import model.ResponseMsg;
import service.OccInspectionService;

@Path("/inspection")
public class InspectionController {
  @Context
  private HttpServletResponse response;

  @Context
  private HttpServletRequest request;

  private OccInspectionService occInspectionService = new OccInspectionService();

  @GET
  @Path(("/pull"))
  @Produces("application/json")
  public String test() {
    Integer userId = (Integer) request.getSession().getAttribute("userId");
    Integer muni_municode = (Integer) request.getSession().getAttribute("muni_municode");
    List<OccInspection> inspections = occInspectionService.getInspections(userId, muni_municode);
    System.out.println(inspections);
    return new Gson().toJson(inspections);
  }
}

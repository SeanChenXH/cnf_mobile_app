package controllers;

import javax.ws.rs.*;
import services.OccInspectionService;

@Path("/occ_inspection")
public class OccInspectionController {

  private OccInspectionService occInspectionService = new OccInspectionService();

  @GET
  @Produces("application/json")
  public String getInspections() {
    return occInspectionService.getAllInspections();
  }

  @GET
  @Path("/inspectionId/{inspectionId}")
  public String getInspectionByID(@PathParam("inspectionId")int id){
    return occInspectionService.getInspectionById(id);
  }

}
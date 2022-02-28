package model;

import java.time.OffsetDateTime;

public class OccInspectionDispatch {

  private Integer dispatchid;

  private Integer createdby_userid;
  private OffsetDateTime creationts;
  private String dispatchnotes;
  private Integer inspection_inspectionid;
  private OffsetDateTime retrievalts;
  private Integer retrievedby_userid;
  private OffsetDateTime synchronizationts;
  private String synchronizationnotes;
  private Integer municipality_municode;
  private String municipalityname;

  public Integer getDispatchid() {
    return dispatchid;
  }

  public void setDispatchid(Integer dispatchid) {
    this.dispatchid = dispatchid;
  }

  public Integer getCreatedby_userid() {
    return createdby_userid;
  }

  public void setCreatedby_userid(Integer createdby_userid) {
    this.createdby_userid = createdby_userid;
  }

  public OffsetDateTime getCreationts() {
    return creationts;
  }

  public void setCreationts(OffsetDateTime creationts) {
    this.creationts = creationts;
  }

  public String getDispatchnotes() {
    return dispatchnotes;
  }

  public void setDispatchnotes(String dispatchnotes) {
    this.dispatchnotes = dispatchnotes;
  }

  public Integer getInspection_inspectionid() {
    return inspection_inspectionid;
  }

  public void setInspection_inspectionid(Integer inspection_inspectionid) {
    this.inspection_inspectionid = inspection_inspectionid;
  }

  public OffsetDateTime getRetrievalts() {
    return retrievalts;
  }

  public void setRetrievalts(OffsetDateTime retrievalts) {
    this.retrievalts = retrievalts;
  }

  public Integer getRetrievedby_userid() {
    return retrievedby_userid;
  }

  public void setRetrievedby_userid(Integer retrievedby_userid) {
    this.retrievedby_userid = retrievedby_userid;
  }

  public OffsetDateTime getSynchronizationts() {
    return synchronizationts;
  }

  public void setSynchronizationts(OffsetDateTime synchronizationts) {
    this.synchronizationts = synchronizationts;
  }

  public String getSynchronizationnotes() {
    return synchronizationnotes;
  }

  public void setSynchronizationnotes(String synchronizationnotes) {
    this.synchronizationnotes = synchronizationnotes;
  }

  public Integer getMunicipality_municode() {
    return municipality_municode;
  }

  public void setMunicipality_municode(Integer municipality_municode) {
    this.municipality_municode = municipality_municode;
  }

  public String getMunicipalityname() {
    return municipalityname;
  }

  public void setMunicipalityname(String municipalityname) {
    this.municipalityname = municipalityname;
  }

  @Override
  public String toString() {
    return "OccInspectionDispatch{" +
        "dispatchid=" + dispatchid +
        ", createdby_userid=" + createdby_userid +
        ", creationts=" + creationts +
        ", dispatchnotes='" + dispatchnotes + '\'' +
        ", inspection_inspectionid=" + inspection_inspectionid +
        ", retrievalts=" + retrievalts +
        ", retrievedby_userid=" + retrievedby_userid +
        ", synchronizationts=" + synchronizationts +
        ", synchronizationnotes='" + synchronizationnotes + '\'' +
        ", municipality_municode=" + municipality_municode +
        ", municipalityname='" + municipalityname + '\'' +
        '}';
  }
}

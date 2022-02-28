package model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class OccInspection {

  private Integer inspectionId;
  private Integer occperiod_periodid;
  private Integer inspector_userid;
  private Integer publicaccesscc;
  private boolean enablepacc;
  private String notespreinspection;
  private Integer thirdpartyinspector_personid;
  private LocalDateTime thirdpartyinspectorapprovalts;
  private Integer thirdpartyinspectorapprovalby;
  private Integer maxoccupantsallowed;
  private Integer numbedrooms;
  private Integer numbathrooms;
  private Integer occchecklist_checklistlistid;
  private OffsetDateTime effectivedate;
  private OffsetDateTime createdts;
  private Integer followupto_inspectionid;
  private LocalDateTime timestart;
  private LocalDateTime timeend;
  private Integer determination_detid;
  private Integer determinationby_userid;
  private LocalDateTime determinationts;
  private String remarks;
  private String generalcomments;
  private LocalDateTime deactivatedts;
  private Integer deactivatedby_userid;
  private Integer createdby_userid;
  private LocalDateTime lastupdatedts;
  private Integer lastupdatedby_userid;
  private Integer cause_causeid;

  public Integer getInspectionId() {
    return inspectionId;
  }

  public void setInspectionId(Integer inspectionId) {
    this.inspectionId = inspectionId;
  }

  public Integer getOccperiod_periodid() {
    return occperiod_periodid;
  }

  public void setOccperiod_periodid(Integer occperiod_periodid) {
    this.occperiod_periodid = occperiod_periodid;
  }

  public Integer getInspector_userid() {
    return inspector_userid;
  }

  public void setInspector_userid(Integer inspector_userid) {
    this.inspector_userid = inspector_userid;
  }

  public Integer getPublicaccesscc() {
    return publicaccesscc;
  }

  public void setPublicaccesscc(Integer publicaccesscc) {
    this.publicaccesscc = publicaccesscc;
  }

  public boolean isEnablepacc() {
    return enablepacc;
  }

  public void setEnablepacc(boolean enablepacc) {
    this.enablepacc = enablepacc;
  }

  public String getNotespreinspection() {
    return notespreinspection;
  }

  public void setNotespreinspection(String notespreinspection) {
    this.notespreinspection = notespreinspection;
  }

  public Integer getThirdpartyinspector_personid() {
    return thirdpartyinspector_personid;
  }

  public void setThirdpartyinspector_personid(Integer thirdpartyinspector_personid) {
    this.thirdpartyinspector_personid = thirdpartyinspector_personid;
  }

  public LocalDateTime getThirdpartyinspectorapprovalts() {
    return thirdpartyinspectorapprovalts;
  }

  public void setThirdpartyinspectorapprovalts(LocalDateTime thirdpartyinspectorapprovalts) {
    this.thirdpartyinspectorapprovalts = thirdpartyinspectorapprovalts;
  }

  public Integer getThirdpartyinspectorapprovalby() {
    return thirdpartyinspectorapprovalby;
  }

  public void setThirdpartyinspectorapprovalby(Integer thirdpartyinspectorapprovalby) {
    this.thirdpartyinspectorapprovalby = thirdpartyinspectorapprovalby;
  }

  public Integer getMaxoccupantsallowed() {
    return maxoccupantsallowed;
  }

  public void setMaxoccupantsallowed(Integer maxoccupantsallowed) {
    this.maxoccupantsallowed = maxoccupantsallowed;
  }

  public Integer getNumbedrooms() {
    return numbedrooms;
  }

  public void setNumbedrooms(Integer numbedrooms) {
    this.numbedrooms = numbedrooms;
  }

  public Integer getNumbathrooms() {
    return numbathrooms;
  }

  public void setNumbathrooms(Integer numbathrooms) {
    this.numbathrooms = numbathrooms;
  }

  public Integer getOccchecklist_checklistlistid() {
    return occchecklist_checklistlistid;
  }

  public void setOccchecklist_checklistlistid(Integer occchecklist_checklistlistid) {
    this.occchecklist_checklistlistid = occchecklist_checklistlistid;
  }

  public OffsetDateTime getEffectivedate() {
    return effectivedate;
  }

  public void setEffectivedate(OffsetDateTime effectivedate) {
    this.effectivedate = effectivedate;
  }

  public OffsetDateTime getCreatedts() {
    return createdts;
  }

  public void setCreatedts(OffsetDateTime createdts) {
    this.createdts = createdts;
  }

  public Integer getFollowupto_inspectionid() {
    return followupto_inspectionid;
  }

  public void setFollowupto_inspectionid(Integer followupto_inspectionid) {
    this.followupto_inspectionid = followupto_inspectionid;
  }

  public LocalDateTime getTimestart() {
    return timestart;
  }

  public void setTimestart(LocalDateTime timestart) {
    this.timestart = timestart;
  }

  public LocalDateTime getTimeend() {
    return timeend;
  }

  public void setTimeend(LocalDateTime timeend) {
    this.timeend = timeend;
  }

  public Integer getDetermination_detid() {
    return determination_detid;
  }

  public void setDetermination_detid(Integer determination_detid) {
    this.determination_detid = determination_detid;
  }

  public Integer getDeterminationby_userid() {
    return determinationby_userid;
  }

  public void setDeterminationby_userid(Integer determinationby_userid) {
    this.determinationby_userid = determinationby_userid;
  }

  public LocalDateTime getDeterminationts() {
    return determinationts;
  }

  public void setDeterminationts(LocalDateTime determinationts) {
    this.determinationts = determinationts;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getGeneralcomments() {
    return generalcomments;
  }

  public void setGeneralcomments(String generalcomments) {
    this.generalcomments = generalcomments;
  }

  public LocalDateTime getDeactivatedts() {
    return deactivatedts;
  }

  public void setDeactivatedts(LocalDateTime deactivatedts) {
    this.deactivatedts = deactivatedts;
  }

  public Integer getDeactivatedby_userid() {
    return deactivatedby_userid;
  }

  public void setDeactivatedby_userid(Integer deactivatedby_userid) {
    this.deactivatedby_userid = deactivatedby_userid;
  }

  public Integer getCreatedby_userid() {
    return createdby_userid;
  }

  public void setCreatedby_userid(Integer createdby_userid) {
    this.createdby_userid = createdby_userid;
  }

  public LocalDateTime getLastupdatedts() {
    return lastupdatedts;
  }

  public void setLastupdatedts(LocalDateTime lastupdatedts) {
    this.lastupdatedts = lastupdatedts;
  }

  public Integer getLastupdatedby_userid() {
    return lastupdatedby_userid;
  }

  public void setLastupdatedby_userid(Integer lastupdatedby_userid) {
    this.lastupdatedby_userid = lastupdatedby_userid;
  }

  public Integer getCause_causeid() {
    return cause_causeid;
  }

  public void setCause_causeid(Integer cause_causeid) {
    this.cause_causeid = cause_causeid;
  }

  @Override
  public String toString() {
    return "models.OccInspection{" +
        "inspectionId=" + inspectionId +
        ", occperiod_periodid=" + occperiod_periodid +
        ", inspector_userid=" + inspector_userid +
        ", publicaccesscc=" + publicaccesscc +
        ", enablepacc=" + enablepacc +
        ", notespreinspection='" + notespreinspection + '\'' +
        ", thirdpartyinspector_personid=" + thirdpartyinspector_personid +
        ", thirdpartyinspectorapprovalts=" + thirdpartyinspectorapprovalts +
        ", thirdpartyinspectorapprovalby=" + thirdpartyinspectorapprovalby +
        ", maxoccupantsallowed=" + maxoccupantsallowed +
        ", numbedrooms=" + numbedrooms +
        ", numbathrooms=" + numbathrooms +
        ", occchecklist_checklistlistid=" + occchecklist_checklistlistid +
        ", effectivedate=" + effectivedate +
        ", createdts=" + createdts +
        ", followupto_inspectionid=" + followupto_inspectionid +
        ", timestart=" + timestart +
        ", timeend=" + timeend +
        ", determination_detid=" + determination_detid +
        ", determinationby_userid=" + determinationby_userid +
        ", determinationts=" + determinationts +
        ", remarks='" + remarks + '\'' +
        ", generalcomments='" + generalcomments + '\'' +
        ", deactivatedts=" + deactivatedts +
        ", deactivatedby_userid=" + deactivatedby_userid +
        ", createdby_userid=" + createdby_userid +
        ", lastupdatedts=" + lastupdatedts +
        ", lastupdatedby_userid=" + lastupdatedby_userid +
        ", cause_causeid=" + cause_causeid +
        '}';
  }
}

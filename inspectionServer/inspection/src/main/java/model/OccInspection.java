package model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class OccInspection {

  private int inspectionId;
  private int occperiod_periodid;
  private int inspector_userid;
  private int publicaccesscc;
  private boolean enablepacc;
  private String notespreinspection;
  private int thirdpartyinspector_personid;
  private LocalDateTime thirdpartyinspectorapprovalts;
  private int thirdpartyinspectorapprovalby;
  private int maxoccupantsallowed;
  private int numbedrooms;
  private int numbathrooms;
  private int occchecklist_checklistlistid;
  private OffsetDateTime effectivedate;
  private OffsetDateTime createdts;
  private int followupto_inspectionid;
  private LocalDateTime timestart;
  private LocalDateTime timeend;
  private int determination_detid;
  private int determinationby_userid;
  private LocalDateTime determinationts;
  private String remarks;
  private String generalcomments;
  private LocalDateTime deactivatedts;
  private int deactivatedby_userid;
  private int createdby_userid;
  private LocalDateTime lastupdatedts;
  private int lastupdatedby_userid;
  private int cause_causeid;

  public int getInspectionId() {
    return inspectionId;
  }

  public void setInspectionId(int inspectionId) {
    this.inspectionId = inspectionId;
  }

  public int getOccperiod_periodid() {
    return occperiod_periodid;
  }

  public void setOccperiod_periodid(int occperiod_periodid) {
    this.occperiod_periodid = occperiod_periodid;
  }

  public int getInspector_userid() {
    return inspector_userid;
  }

  public void setInspector_userid(int inspector_userid) {
    this.inspector_userid = inspector_userid;
  }

  public int getPublicaccesscc() {
    return publicaccesscc;
  }

  public void setPublicaccesscc(int publicaccesscc) {
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

  public int getThirdpartyinspector_personid() {
    return thirdpartyinspector_personid;
  }

  public void setThirdpartyinspector_personid(int thirdpartyinspector_personid) {
    this.thirdpartyinspector_personid = thirdpartyinspector_personid;
  }

  public LocalDateTime getThirdpartyinspectorapprovalts() {
    return thirdpartyinspectorapprovalts;
  }

  public void setThirdpartyinspectorapprovalts(LocalDateTime thirdpartyinspectorapprovalts) {
    this.thirdpartyinspectorapprovalts = thirdpartyinspectorapprovalts;
  }

  public int getThirdpartyinspectorapprovalby() {
    return thirdpartyinspectorapprovalby;
  }

  public void setThirdpartyinspectorapprovalby(int thirdpartyinspectorapprovalby) {
    this.thirdpartyinspectorapprovalby = thirdpartyinspectorapprovalby;
  }

  public int getMaxoccupantsallowed() {
    return maxoccupantsallowed;
  }

  public void setMaxoccupantsallowed(int maxoccupantsallowed) {
    this.maxoccupantsallowed = maxoccupantsallowed;
  }

  public int getNumbedrooms() {
    return numbedrooms;
  }

  public void setNumbedrooms(int numbedrooms) {
    this.numbedrooms = numbedrooms;
  }

  public int getNumbathrooms() {
    return numbathrooms;
  }

  public void setNumbathrooms(int numbathrooms) {
    this.numbathrooms = numbathrooms;
  }

  public int getOccchecklist_checklistlistid() {
    return occchecklist_checklistlistid;
  }

  public void setOccchecklist_checklistlistid(int occchecklist_checklistlistid) {
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

  public int getFollowupto_inspectionid() {
    return followupto_inspectionid;
  }

  public void setFollowupto_inspectionid(int followupto_inspectionid) {
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

  public int getDetermination_detid() {
    return determination_detid;
  }

  public void setDetermination_detid(int determination_detid) {
    this.determination_detid = determination_detid;
  }

  public int getDeterminationby_userid() {
    return determinationby_userid;
  }

  public void setDeterminationby_userid(int determinationby_userid) {
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

  public int getDeactivatedby_userid() {
    return deactivatedby_userid;
  }

  public void setDeactivatedby_userid(int deactivatedby_userid) {
    this.deactivatedby_userid = deactivatedby_userid;
  }

  public int getCreatedby_userid() {
    return createdby_userid;
  }

  public void setCreatedby_userid(int createdby_userid) {
    this.createdby_userid = createdby_userid;
  }

  public LocalDateTime getLastupdatedts() {
    return lastupdatedts;
  }

  public void setLastupdatedts(LocalDateTime lastupdatedts) {
    this.lastupdatedts = lastupdatedts;
  }

  public int getLastupdatedby_userid() {
    return lastupdatedby_userid;
  }

  public void setLastupdatedby_userid(int lastupdatedby_userid) {
    this.lastupdatedby_userid = lastupdatedby_userid;
  }

  public int getCause_causeid() {
    return cause_causeid;
  }

  public void setCause_causeid(int cause_causeid) {
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

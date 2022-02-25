package model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class MuniLogin {

  private int muni_municode;
  private int userid;
  private boolean defaultmuni;
  private OffsetDateTime accessgranteddatestart;
  private OffsetDateTime accessgranteddatestop;
  private OffsetDateTime codeofficerstartdate;
  private OffsetDateTime codeofficerstopdate;
  private OffsetDateTime staffstartdate;
  private OffsetDateTime staffstopdate;
  private OffsetDateTime sysadminstartdate;
  private OffsetDateTime sysadminstopdate;
  private OffsetDateTime supportstartdate;
  private OffsetDateTime supportstopdate;
  private int codeofficerassignmentorder;
  private int staffassignmentorder;
  private int sysadminassignmentorder;
  private int supportassignmentorder;
  private int bypasscodeofficerassignmentorder;
  private int bypassstaffassignmentorder;
  private int bypasssysadminassignmentorder;
  private int bypasssupportassignmentorder;
  private OffsetDateTime recorddeactivatedts;
  private String userrole;
  private int muniloginrecordid;
  private OffsetDateTime recordcreatedts;
  private String badgenumber;
  private String orinumber;
  private int defaultcecase_caseid;

  public int getMuni_municode() {
    return muni_municode;
  }

  public void setMuni_municode(int muni_municode) {
    this.muni_municode = muni_municode;
  }

  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }

  public boolean isDefaultmuni() {
    return defaultmuni;
  }

  public void setDefaultmuni(boolean defaultmuni) {
    this.defaultmuni = defaultmuni;
  }

  public OffsetDateTime getAccessgranteddatestart() {
    return accessgranteddatestart;
  }

  public void setAccessgranteddatestart(OffsetDateTime accessgranteddatestart) {
    this.accessgranteddatestart = accessgranteddatestart;
  }

  public OffsetDateTime getAccessgranteddatestop() {
    return accessgranteddatestop;
  }

  public void setAccessgranteddatestop(OffsetDateTime accessgranteddatestop) {
    this.accessgranteddatestop = accessgranteddatestop;
  }

  public OffsetDateTime getCodeofficerstartdate() {
    return codeofficerstartdate;
  }

  public void setCodeofficerstartdate(OffsetDateTime codeofficerstartdate) {
    this.codeofficerstartdate = codeofficerstartdate;
  }

  public OffsetDateTime getCodeofficerstopdate() {
    return codeofficerstopdate;
  }

  public void setCodeofficerstopdate(OffsetDateTime codeofficerstopdate) {
    this.codeofficerstopdate = codeofficerstopdate;
  }

  public OffsetDateTime getStaffstartdate() {
    return staffstartdate;
  }

  public void setStaffstartdate(OffsetDateTime staffstartdate) {
    this.staffstartdate = staffstartdate;
  }

  public OffsetDateTime getStaffstopdate() {
    return staffstopdate;
  }

  public void setStaffstopdate(OffsetDateTime staffstopdate) {
    this.staffstopdate = staffstopdate;
  }

  public OffsetDateTime getSysadminstartdate() {
    return sysadminstartdate;
  }

  public void setSysadminstartdate(OffsetDateTime sysadminstartdate) {
    this.sysadminstartdate = sysadminstartdate;
  }

  public OffsetDateTime getSysadminstopdate() {
    return sysadminstopdate;
  }

  public void setSysadminstopdate(OffsetDateTime sysadminstopdate) {
    this.sysadminstopdate = sysadminstopdate;
  }

  public OffsetDateTime getSupportstartdate() {
    return supportstartdate;
  }

  public void setSupportstartdate(OffsetDateTime supportstartdate) {
    this.supportstartdate = supportstartdate;
  }

  public OffsetDateTime getSupportstopdate() {
    return supportstopdate;
  }

  public void setSupportstopdate(OffsetDateTime supportstopdate) {
    this.supportstopdate = supportstopdate;
  }

  public int getCodeofficerassignmentorder() {
    return codeofficerassignmentorder;
  }

  public void setCodeofficerassignmentorder(int codeofficerassignmentorder) {
    this.codeofficerassignmentorder = codeofficerassignmentorder;
  }

  public int getStaffassignmentorder() {
    return staffassignmentorder;
  }

  public void setStaffassignmentorder(int staffassignmentorder) {
    this.staffassignmentorder = staffassignmentorder;
  }

  public int getSysadminassignmentorder() {
    return sysadminassignmentorder;
  }

  public void setSysadminassignmentorder(int sysadminassignmentorder) {
    this.sysadminassignmentorder = sysadminassignmentorder;
  }

  public int getSupportassignmentorder() {
    return supportassignmentorder;
  }

  public void setSupportassignmentorder(int supportassignmentorder) {
    this.supportassignmentorder = supportassignmentorder;
  }

  public int getBypasscodeofficerassignmentorder() {
    return bypasscodeofficerassignmentorder;
  }

  public void setBypasscodeofficerassignmentorder(int bypasscodeofficerassignmentorder) {
    this.bypasscodeofficerassignmentorder = bypasscodeofficerassignmentorder;
  }

  public int getBypassstaffassignmentorder() {
    return bypassstaffassignmentorder;
  }

  public void setBypassstaffassignmentorder(int bypassstaffassignmentorder) {
    this.bypassstaffassignmentorder = bypassstaffassignmentorder;
  }

  public int getBypasssysadminassignmentorder() {
    return bypasssysadminassignmentorder;
  }

  public void setBypasssysadminassignmentorder(int bypasssysadminassignmentorder) {
    this.bypasssysadminassignmentorder = bypasssysadminassignmentorder;
  }

  public int getBypasssupportassignmentorder() {
    return bypasssupportassignmentorder;
  }

  public void setBypasssupportassignmentorder(int bypasssupportassignmentorder) {
    this.bypasssupportassignmentorder = bypasssupportassignmentorder;
  }

  public OffsetDateTime getRecorddeactivatedts() {
    return recorddeactivatedts;
  }

  public void setRecorddeactivatedts(OffsetDateTime recorddeactivatedts) {
    this.recorddeactivatedts = recorddeactivatedts;
  }

  public String getUserrole() {
    return userrole;
  }

  public void setUserrole(String userrole) {
    this.userrole = userrole;
  }

  public int getMuniloginrecordid() {
    return muniloginrecordid;
  }

  public void setMuniloginrecordid(int muniloginrecordid) {
    this.muniloginrecordid = muniloginrecordid;
  }

  public OffsetDateTime getRecordcreatedts() {
    return recordcreatedts;
  }

  public void setRecordcreatedts(OffsetDateTime recordcreatedts) {
    this.recordcreatedts = recordcreatedts;
  }

  public String getBadgenumber() {
    return badgenumber;
  }

  public void setBadgenumber(String badgenumber) {
    this.badgenumber = badgenumber;
  }

  public String getOrinumber() {
    return orinumber;
  }

  public void setOrinumber(String orinumber) {
    this.orinumber = orinumber;
  }

  public int getDefaultcecase_caseid() {
    return defaultcecase_caseid;
  }

  public void setDefaultcecase_caseid(int defaultcecase_caseid) {
    this.defaultcecase_caseid = defaultcecase_caseid;
  }

  @Override
  public String toString() {
    return "MuniLogin{" +
        "muni_municode=" + muni_municode +
        ", userid=" + userid +
        ", defaultmuni=" + defaultmuni +
        ", accessgranteddatestart=" + accessgranteddatestart +
        ", accessgranteddatestop=" + accessgranteddatestop +
        ", codeofficerstartdate=" + codeofficerstartdate +
        ", codeofficerstopdate=" + codeofficerstopdate +
        ", staffstartdate=" + staffstartdate +
        ", staffstopdate=" + staffstopdate +
        ", sysadminstartdate=" + sysadminstartdate +
        ", sysadminstopdate=" + sysadminstopdate +
        ", supportstartdate=" + supportstartdate +
        ", supportstopdate=" + supportstopdate +
        ", codeofficerassignmentorder=" + codeofficerassignmentorder +
        ", staffassignmentorder=" + staffassignmentorder +
        ", sysadminassignmentorder=" + sysadminassignmentorder +
        ", supportassignmentorder=" + supportassignmentorder +
        ", bypasscodeofficerassignmentorder=" + bypasscodeofficerassignmentorder +
        ", bypassstaffassignmentorder=" + bypassstaffassignmentorder +
        ", bypasssysadminassignmentorder=" + bypasssysadminassignmentorder +
        ", bypasssupportassignmentorder=" + bypasssupportassignmentorder +
        ", recorddeactivatedts=" + recorddeactivatedts +
        ", userrole='" + userrole + '\'' +
        ", muniloginrecordid=" + muniloginrecordid +
        ", recordcreatedts=" + recordcreatedts +
        ", badgenumber='" + badgenumber + '\'' +
        ", orinumber='" + orinumber + '\'' +
        ", defaultcecase_caseid=" + defaultcecase_caseid +
        '}';
  }
}

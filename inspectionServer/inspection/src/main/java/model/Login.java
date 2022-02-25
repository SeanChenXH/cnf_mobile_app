package model;

import java.time.OffsetDateTime;

public class Login {

  private Integer userid;
  private String username;
  private String password;
  private String notes;
  private Integer personlink;
  private OffsetDateTime pswdlastupdated;
  private OffsetDateTime forcepasswordreset;
  private Integer createdby;
  private OffsetDateTime createdts;
  private boolean nologinvirtualonly;
  private OffsetDateTime deactivatedts;
  private Integer deactivated_userid;
  private OffsetDateTime lastupdatedts;
  private String userrole;
  private Integer homemuni;

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Integer getPersonlink() {
    return personlink;
  }

  public void setPersonlink(Integer personlink) {
    this.personlink = personlink;
  }

  public OffsetDateTime getPswdlastupdated() {
    return pswdlastupdated;
  }

  public void setPswdlastupdated(OffsetDateTime pswdlastupdated) {
    this.pswdlastupdated = pswdlastupdated;
  }

  public OffsetDateTime getForcepasswordreset() {
    return forcepasswordreset;
  }

  public void setForcepasswordreset(OffsetDateTime forcepasswordreset) {
    this.forcepasswordreset = forcepasswordreset;
  }

  public Integer getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Integer createdby) {
    this.createdby = createdby;
  }

  public OffsetDateTime getCreatedts() {
    return createdts;
  }

  public void setCreatedts(OffsetDateTime createdts) {
    this.createdts = createdts;
  }

  public boolean isNologinvirtualonly() {
    return nologinvirtualonly;
  }

  public void setNologinvirtualonly(boolean nologinvirtualonly) {
    this.nologinvirtualonly = nologinvirtualonly;
  }

  public OffsetDateTime getDeactivatedts() {
    return deactivatedts;
  }

  public void setDeactivatedts(OffsetDateTime deactivatedts) {
    this.deactivatedts = deactivatedts;
  }

  public Integer getDeactivated_userid() {
    return deactivated_userid;
  }

  public void setDeactivated_userid(Integer deactivated_userid) {
    this.deactivated_userid = deactivated_userid;
  }

  public OffsetDateTime getLastupdatedts() {
    return lastupdatedts;
  }

  public void setLastupdatedts(OffsetDateTime lastupdatedts) {
    this.lastupdatedts = lastupdatedts;
  }

  public String getUserrole() {
    return userrole;
  }

  public void setUserrole(String userrole) {
    this.userrole = userrole;
  }

  public Integer getHomemuni() {
    return homemuni;
  }

  public void setHomemuni(Integer homemuni) {
    this.homemuni = homemuni;
  }

  @Override
  public String toString() {
    return "Login{" +
        "userid=" + userid +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", notes='" + notes + '\'' +
        ", personlink=" + personlink +
        ", pswdlastupdated=" + pswdlastupdated +
        ", forcepasswordreset=" + forcepasswordreset +
        ", createdby=" + createdby +
        ", createdts=" + createdts +
        ", nologinvirtualonly=" + nologinvirtualonly +
        ", deactivatedts=" + deactivatedts +
        ", deactivated_userid=" + deactivated_userid +
        ", lastupdatedts=" + lastupdatedts +
        ", userrole='" + userrole + '\'' +
        ", homemuni=" + homemuni +
        '}';
  }
}

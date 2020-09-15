/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-09-09 08:12:59<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.23.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Request model for updating an Active Directory configuration
 */
@Schema(description = "Request model for updating an Active Directory configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class UpdateActiveDirectoryConfigRequest {
  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("serverIp")
  private String serverIp = null;

  @JsonProperty("serverPort")
  private Integer serverPort = null;

  @JsonProperty("serverAdminName")
  private String serverAdminName = null;

  @JsonProperty("serverAdminPassword")
  private String serverAdminPassword = null;

  @JsonProperty("ldapUsersDomain")
  private String ldapUsersDomain = null;

  @JsonProperty("userFilter")
  private String userFilter = null;

  @JsonProperty("userImport")
  private Boolean userImport = null;

  @JsonProperty("adExportGroup")
  private String adExportGroup = null;

  @JsonProperty("sdsImportGroup")
  private Long sdsImportGroup = null;

  @JsonProperty("createHomeFolder")
  private Boolean createHomeFolder = false;

  @JsonProperty("homeFolderParent")
  private Long homeFolderParent = null;

  @JsonProperty("useLdaps")
  private Boolean useLdaps = null;

  @JsonProperty("sslFingerPrint")
  private String sslFingerPrint = null;

  public UpdateActiveDirectoryConfigRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Unique name for an Active Directory configuration
   * @return alias
  **/
  @Schema(description = "Unique name for an Active Directory configuration")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public UpdateActiveDirectoryConfigRequest serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }

   /**
   * IPv4 or IPv6 address or host name
   * @return serverIp
  **/
  @Schema(description = "IPv4 or IPv6 address or host name")
  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }

  public UpdateActiveDirectoryConfigRequest serverPort(Integer serverPort) {
    this.serverPort = serverPort;
    return this;
  }

   /**
   * Port
   * @return serverPort
  **/
  @Schema(description = "Port")
  public Integer getServerPort() {
    return serverPort;
  }

  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }

  public UpdateActiveDirectoryConfigRequest serverAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
    return this;
  }

   /**
   * Distinguished Name (DN) of Active Directory administrative account
   * @return serverAdminName
  **/
  @Schema(description = "Distinguished Name (DN) of Active Directory administrative account")
  public String getServerAdminName() {
    return serverAdminName;
  }

  public void setServerAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
  }

  public UpdateActiveDirectoryConfigRequest serverAdminPassword(String serverAdminPassword) {
    this.serverAdminPassword = serverAdminPassword;
    return this;
  }

   /**
   * Password of Active Directory administrative account
   * @return serverAdminPassword
  **/
  @Schema(description = "Password of Active Directory administrative account")
  public String getServerAdminPassword() {
    return serverAdminPassword;
  }

  public void setServerAdminPassword(String serverAdminPassword) {
    this.serverAdminPassword = serverAdminPassword;
  }

  public UpdateActiveDirectoryConfigRequest ldapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
    return this;
  }

   /**
   * Search scope of Active Directory; only users below this node can log on.
   * @return ldapUsersDomain
  **/
  @Schema(description = "Search scope of Active Directory; only users below this node can log on.")
  public String getLdapUsersDomain() {
    return ldapUsersDomain;
  }

  public void setLdapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
  }

  public UpdateActiveDirectoryConfigRequest userFilter(String userFilter) {
    this.userFilter = userFilter;
    return this;
  }

   /**
   * Name of Active Directory attribute that is used as login name.
   * @return userFilter
  **/
  @Schema(description = "Name of Active Directory attribute that is used as login name.")
  public String getUserFilter() {
    return userFilter;
  }

  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }

  public UpdateActiveDirectoryConfigRequest userImport(Boolean userImport) {
    this.userImport = userImport;
    return this;
  }

   /**
   * Determines if a DRACOON account is automatically created for a new user  who successfully logs on with his / her AD / IDP account.
   * @return userImport
  **/
  @Schema(description = "Determines if a DRACOON account is automatically created for a new user  who successfully logs on with his / her AD / IDP account.")
  public Boolean isUserImport() {
    return userImport;
  }

  public void setUserImport(Boolean userImport) {
    this.userImport = userImport;
  }

  public UpdateActiveDirectoryConfigRequest adExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
    return this;
  }

   /**
   * If &#x60;userImport&#x60; is set to &#x60;true&#x60;,  the user must be member of this Active Directory group to receive a newly created DRACOON account.
   * @return adExportGroup
  **/
  @Schema(description = "If `userImport` is set to `true`,  the user must be member of this Active Directory group to receive a newly created DRACOON account.")
  public String getAdExportGroup() {
    return adExportGroup;
  }

  public void setAdExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
  }

  public UpdateActiveDirectoryConfigRequest sdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
    return this;
  }

   /**
   * User group that is assigned to users who are created by automatic import.  Reset with &#x60;0&#x60;
   * @return sdsImportGroup
  **/
  @Schema(description = "User group that is assigned to users who are created by automatic import.  Reset with `0`")
  public Long getSdsImportGroup() {
    return sdsImportGroup;
  }

  public void setSdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
  }

  public UpdateActiveDirectoryConfigRequest createHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
    return this;
  }

   /**
   * DEPRECATED, will be ignored  Determines whether a room is created for each user that is created by automatic import (like a home folder).  Room&#x27;s name will equal the user&#x27;s login name.
   * @return createHomeFolder
  **/
  @Schema(description = "DEPRECATED, will be ignored  Determines whether a room is created for each user that is created by automatic import (like a home folder).  Room's name will equal the user's login name.")
  public Boolean isCreateHomeFolder() {
    return createHomeFolder;
  }

  public void setCreateHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
  }

  public UpdateActiveDirectoryConfigRequest homeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
    return this;
  }

   /**
   * DEPRECATED, will be ignored  ID of the room in which the individual rooms for users will be created.
   * @return homeFolderParent
  **/
  @Schema(description = "DEPRECATED, will be ignored  ID of the room in which the individual rooms for users will be created.")
  public Long getHomeFolderParent() {
    return homeFolderParent;
  }

  public void setHomeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
  }

  public UpdateActiveDirectoryConfigRequest useLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
    return this;
  }

   /**
   * Determines whether LDAPS should be used instead of plain LDAP.
   * @return useLdaps
  **/
  @Schema(description = "Determines whether LDAPS should be used instead of plain LDAP.")
  public Boolean isUseLdaps() {
    return useLdaps;
  }

  public void setUseLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
  }

  public UpdateActiveDirectoryConfigRequest sslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
    return this;
  }

   /**
   * SSL finger print of Active Directory server.  Mandatory for LDAPS connections.  Format: &#x60;Algorithm/Fingerprint&#x60;
   * @return sslFingerPrint
  **/
  @Schema(description = "SSL finger print of Active Directory server.  Mandatory for LDAPS connections.  Format: `Algorithm/Fingerprint`")
  public String getSslFingerPrint() {
    return sslFingerPrint;
  }

  public void setSslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateActiveDirectoryConfigRequest updateActiveDirectoryConfigRequest = (UpdateActiveDirectoryConfigRequest) o;
    return Objects.equals(this.alias, updateActiveDirectoryConfigRequest.alias) &&
        Objects.equals(this.serverIp, updateActiveDirectoryConfigRequest.serverIp) &&
        Objects.equals(this.serverPort, updateActiveDirectoryConfigRequest.serverPort) &&
        Objects.equals(this.serverAdminName, updateActiveDirectoryConfigRequest.serverAdminName) &&
        Objects.equals(this.serverAdminPassword, updateActiveDirectoryConfigRequest.serverAdminPassword) &&
        Objects.equals(this.ldapUsersDomain, updateActiveDirectoryConfigRequest.ldapUsersDomain) &&
        Objects.equals(this.userFilter, updateActiveDirectoryConfigRequest.userFilter) &&
        Objects.equals(this.userImport, updateActiveDirectoryConfigRequest.userImport) &&
        Objects.equals(this.adExportGroup, updateActiveDirectoryConfigRequest.adExportGroup) &&
        Objects.equals(this.sdsImportGroup, updateActiveDirectoryConfigRequest.sdsImportGroup) &&
        Objects.equals(this.createHomeFolder, updateActiveDirectoryConfigRequest.createHomeFolder) &&
        Objects.equals(this.homeFolderParent, updateActiveDirectoryConfigRequest.homeFolderParent) &&
        Objects.equals(this.useLdaps, updateActiveDirectoryConfigRequest.useLdaps) &&
        Objects.equals(this.sslFingerPrint, updateActiveDirectoryConfigRequest.sslFingerPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, serverIp, serverPort, serverAdminName, serverAdminPassword, ldapUsersDomain, userFilter, userImport, adExportGroup, sdsImportGroup, createHomeFolder, homeFolderParent, useLdaps, sslFingerPrint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActiveDirectoryConfigRequest {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    serverAdminName: ").append(toIndentedString(serverAdminName)).append("\n");
    sb.append("    serverAdminPassword: ").append(toIndentedString(serverAdminPassword)).append("\n");
    sb.append("    ldapUsersDomain: ").append(toIndentedString(ldapUsersDomain)).append("\n");
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    userImport: ").append(toIndentedString(userImport)).append("\n");
    sb.append("    adExportGroup: ").append(toIndentedString(adExportGroup)).append("\n");
    sb.append("    sdsImportGroup: ").append(toIndentedString(sdsImportGroup)).append("\n");
    sb.append("    createHomeFolder: ").append(toIndentedString(createHomeFolder)).append("\n");
    sb.append("    homeFolderParent: ").append(toIndentedString(homeFolderParent)).append("\n");
    sb.append("    useLdaps: ").append(toIndentedString(useLdaps)).append("\n");
    sb.append("    sslFingerPrint: ").append(toIndentedString(sslFingerPrint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

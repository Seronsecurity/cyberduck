/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.8.0-LTS  - built at: 2018-05-03 15:44:37<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.8.0-LTS
 * Contact: develop@dracoon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * AuditUserPermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class AuditUserPermission {
  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("userLogin")
  private String userLogin = null;

  @JsonProperty("userFirstName")
  private String userFirstName = null;

  @JsonProperty("userLastName")
  private String userLastName = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  public AuditUserPermission userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique identifier for the user
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the user")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AuditUserPermission userLogin(String userLogin) {
    this.userLogin = userLogin;
    return this;
  }

   /**
   * User login name
   * @return userLogin
  **/
  @ApiModelProperty(required = true, value = "User login name")
  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public AuditUserPermission userFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
    return this;
  }

   /**
   * User first name
   * @return userFirstName
  **/
  @ApiModelProperty(required = true, value = "User first name")
  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public AuditUserPermission userLastName(String userLastName) {
    this.userLastName = userLastName;
    return this;
  }

   /**
   * User last name
   * @return userLastName
  **/
  @ApiModelProperty(required = true, value = "User last name")
  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public AuditUserPermission permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Available permissions for this node
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "Available permissions for this node")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditUserPermission auditUserPermission = (AuditUserPermission) o;
    return Objects.equals(this.userId, auditUserPermission.userId) &&
        Objects.equals(this.userLogin, auditUserPermission.userLogin) &&
        Objects.equals(this.userFirstName, auditUserPermission.userFirstName) &&
        Objects.equals(this.userLastName, auditUserPermission.userLastName) &&
        Objects.equals(this.permissions, auditUserPermission.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userLogin, userFirstName, userLastName, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditUserPermission {\n");

    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userLogin: ").append(toIndentedString(userLogin)).append("\n");
    sb.append("    userFirstName: ").append(toIndentedString(userFirstName)).append("\n");
    sb.append("    userLastName: ").append(toIndentedString(userLastName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


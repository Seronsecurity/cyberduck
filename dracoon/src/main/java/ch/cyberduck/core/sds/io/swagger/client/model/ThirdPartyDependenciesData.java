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
import java.util.ArrayList;
import java.util.List;
/**
 * Third-party dependency information
 */
@Schema(description = "Third-party dependency information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class ThirdPartyDependenciesData {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("artifactId")
  private String artifactId = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("licenses")
  private List<String> licenses = new ArrayList<>();

  public ThirdPartyDependenciesData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Third party dependencies id
   * @return id
  **/
  @Schema(required = true, description = "Third party dependencies id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ThirdPartyDependenciesData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Third party dependencies name
   * @return name
  **/
  @Schema(required = true, description = "Third party dependencies name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThirdPartyDependenciesData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Third party dependencies url
   * @return url
  **/
  @Schema(required = true, description = "Third party dependencies url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ThirdPartyDependenciesData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Third party dependencies description
   * @return description
  **/
  @Schema(required = true, description = "Third party dependencies description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThirdPartyDependenciesData groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Third party dependencies groupId
   * @return groupId
  **/
  @Schema(required = true, description = "Third party dependencies groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ThirdPartyDependenciesData artifactId(String artifactId) {
    this.artifactId = artifactId;
    return this;
  }

   /**
   * Third party dependencies artifactId
   * @return artifactId
  **/
  @Schema(required = true, description = "Third party dependencies artifactId")
  public String getArtifactId() {
    return artifactId;
  }

  public void setArtifactId(String artifactId) {
    this.artifactId = artifactId;
  }

  public ThirdPartyDependenciesData version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Third party dependencies version
   * @return version
  **/
  @Schema(required = true, description = "Third party dependencies version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ThirdPartyDependenciesData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Third party dependencies type
   * @return type
  **/
  @Schema(required = true, description = "Third party dependencies type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ThirdPartyDependenciesData licenses(List<String> licenses) {
    this.licenses = licenses;
    return this;
  }

  public ThirdPartyDependenciesData addLicensesItem(String licensesItem) {
    this.licenses.add(licensesItem);
    return this;
  }

   /**
   * Third party dependencies licenses type
   * @return licenses
  **/
  @Schema(required = true, description = "Third party dependencies licenses type")
  public List<String> getLicenses() {
    return licenses;
  }

  public void setLicenses(List<String> licenses) {
    this.licenses = licenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyDependenciesData thirdPartyDependenciesData = (ThirdPartyDependenciesData) o;
    return Objects.equals(this.id, thirdPartyDependenciesData.id) &&
        Objects.equals(this.name, thirdPartyDependenciesData.name) &&
        Objects.equals(this.url, thirdPartyDependenciesData.url) &&
        Objects.equals(this.description, thirdPartyDependenciesData.description) &&
        Objects.equals(this.groupId, thirdPartyDependenciesData.groupId) &&
        Objects.equals(this.artifactId, thirdPartyDependenciesData.artifactId) &&
        Objects.equals(this.version, thirdPartyDependenciesData.version) &&
        Objects.equals(this.type, thirdPartyDependenciesData.type) &&
        Objects.equals(this.licenses, thirdPartyDependenciesData.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, description, groupId, artifactId, version, type, licenses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyDependenciesData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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

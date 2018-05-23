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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * PendingAssignmentList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class PendingAssignmentList {
  @JsonProperty("items")
  private List<PendingAssignmentData> items = new ArrayList<PendingAssignmentData>();

  @JsonProperty("range")
  private Range range = null;

  public PendingAssignmentList items(List<PendingAssignmentData> items) {
    this.items = items;
    return this;
  }

  public PendingAssignmentList addItemsItem(PendingAssignmentData itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of pending assignment information
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of pending assignment information")
  public List<PendingAssignmentData> getItems() {
    return items;
  }

  public void setItems(List<PendingAssignmentData> items) {
    this.items = items;
  }

  public PendingAssignmentList range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Range
   * @return range
  **/
  @ApiModelProperty(value = "Range")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingAssignmentList pendingAssignmentList = (PendingAssignmentList) o;
    return Objects.equals(this.items, pendingAssignmentList.items) &&
        Objects.equals(this.range, pendingAssignmentList.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, range);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingAssignmentList {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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


/*
 * Hotelspro Api Client
 * Hotelspro Api Client
 *
 * OpenAPI spec version: 2.0.0
 * Contact: clientintegration@hotelspro.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package hotelspro_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import hotelspro_client.model.BookResponseRooms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BookResponseConfirmationNumbers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T16:34:00.424+03:00")
public class BookResponseConfirmationNumbers {
  @SerializedName("confirmation_number")
  private String confirmationNumber = null;

  @SerializedName("names")
  private List<String> names = null;

  @SerializedName("rooms")
  private List<BookResponseRooms> rooms = null;

  public BookResponseConfirmationNumbers confirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
    return this;
  }

   /**
   * Get confirmationNumber
   * @return confirmationNumber
  **/
  @ApiModelProperty(value = "")
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  public BookResponseConfirmationNumbers names(List<String> names) {
    this.names = names;
    return this;
  }

  public BookResponseConfirmationNumbers addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public BookResponseConfirmationNumbers rooms(List<BookResponseRooms> rooms) {
    this.rooms = rooms;
    return this;
  }

  public BookResponseConfirmationNumbers addRoomsItem(BookResponseRooms roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<BookResponseRooms>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Get rooms
   * @return rooms
  **/
  @ApiModelProperty(value = "")
  public List<BookResponseRooms> getRooms() {
    return rooms;
  }

  public void setRooms(List<BookResponseRooms> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookResponseConfirmationNumbers bookResponseConfirmationNumbers = (BookResponseConfirmationNumbers) o;
    return Objects.equals(this.confirmationNumber, bookResponseConfirmationNumbers.confirmationNumber) &&
        Objects.equals(this.names, bookResponseConfirmationNumbers.names) &&
        Objects.equals(this.rooms, bookResponseConfirmationNumbers.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationNumber, names, rooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookResponseConfirmationNumbers {\n");
    
    sb.append("    confirmationNumber: ").append(toIndentedString(confirmationNumber)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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


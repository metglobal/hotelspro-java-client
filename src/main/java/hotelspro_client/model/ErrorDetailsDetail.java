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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ErrorDetailsDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T16:34:00.424+03:00")
public class ErrorDetailsDetail {
  @SerializedName("client_ip")
  private String clientIp = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("name")
  private List<String> name = null;

  @SerializedName("card_type")
  private String cardType = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  @SerializedName("destination_code")
  private String destinationCode = null;

  @SerializedName("checkin")
  private List<String> checkin = null;

  @SerializedName("checkout")
  private List<String> checkout = null;

  @SerializedName("non_field_errors")
  private List<String> nonFieldErrors = null;

  public ErrorDetailsDetail clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  @ApiModelProperty(value = "")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public ErrorDetailsDetail channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public ErrorDetailsDetail name(List<String> name) {
    this.name = name;
    return this;
  }

  public ErrorDetailsDetail addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public ErrorDetailsDetail cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public ErrorDetailsDetail cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public ErrorDetailsDetail destinationCode(String destinationCode) {
    this.destinationCode = destinationCode;
    return this;
  }

   /**
   * Get destinationCode
   * @return destinationCode
  **/
  @ApiModelProperty(value = "")
  public String getDestinationCode() {
    return destinationCode;
  }

  public void setDestinationCode(String destinationCode) {
    this.destinationCode = destinationCode;
  }

  public ErrorDetailsDetail checkin(List<String> checkin) {
    this.checkin = checkin;
    return this;
  }

  public ErrorDetailsDetail addCheckinItem(String checkinItem) {
    if (this.checkin == null) {
      this.checkin = new ArrayList<String>();
    }
    this.checkin.add(checkinItem);
    return this;
  }

   /**
   * Get checkin
   * @return checkin
  **/
  @ApiModelProperty(value = "")
  public List<String> getCheckin() {
    return checkin;
  }

  public void setCheckin(List<String> checkin) {
    this.checkin = checkin;
  }

  public ErrorDetailsDetail checkout(List<String> checkout) {
    this.checkout = checkout;
    return this;
  }

  public ErrorDetailsDetail addCheckoutItem(String checkoutItem) {
    if (this.checkout == null) {
      this.checkout = new ArrayList<String>();
    }
    this.checkout.add(checkoutItem);
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @ApiModelProperty(value = "")
  public List<String> getCheckout() {
    return checkout;
  }

  public void setCheckout(List<String> checkout) {
    this.checkout = checkout;
  }

  public ErrorDetailsDetail nonFieldErrors(List<String> nonFieldErrors) {
    this.nonFieldErrors = nonFieldErrors;
    return this;
  }

  public ErrorDetailsDetail addNonFieldErrorsItem(String nonFieldErrorsItem) {
    if (this.nonFieldErrors == null) {
      this.nonFieldErrors = new ArrayList<String>();
    }
    this.nonFieldErrors.add(nonFieldErrorsItem);
    return this;
  }

   /**
   * Get nonFieldErrors
   * @return nonFieldErrors
  **/
  @ApiModelProperty(value = "")
  public List<String> getNonFieldErrors() {
    return nonFieldErrors;
  }

  public void setNonFieldErrors(List<String> nonFieldErrors) {
    this.nonFieldErrors = nonFieldErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetailsDetail errorDetailsDetail = (ErrorDetailsDetail) o;
    return Objects.equals(this.clientIp, errorDetailsDetail.clientIp) &&
        Objects.equals(this.channel, errorDetailsDetail.channel) &&
        Objects.equals(this.name, errorDetailsDetail.name) &&
        Objects.equals(this.cardType, errorDetailsDetail.cardType) &&
        Objects.equals(this.cardNumber, errorDetailsDetail.cardNumber) &&
        Objects.equals(this.destinationCode, errorDetailsDetail.destinationCode) &&
        Objects.equals(this.checkin, errorDetailsDetail.checkin) &&
        Objects.equals(this.checkout, errorDetailsDetail.checkout) &&
        Objects.equals(this.nonFieldErrors, errorDetailsDetail.nonFieldErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, channel, name, cardType, cardNumber, destinationCode, checkin, checkout, nonFieldErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetailsDetail {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    destinationCode: ").append(toIndentedString(destinationCode)).append("\n");
    sb.append("    checkin: ").append(toIndentedString(checkin)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    nonFieldErrors: ").append(toIndentedString(nonFieldErrors)).append("\n");
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

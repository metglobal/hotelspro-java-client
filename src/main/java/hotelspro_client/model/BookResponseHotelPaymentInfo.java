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

/**
 * BookResponseHotelPaymentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T16:34:00.424+03:00")
public class BookResponseHotelPaymentInfo {
  @SerializedName("hotel_currency")
  private String hotelCurrency = null;

  @SerializedName("hotel_price")
  private String hotelPrice = null;

  public BookResponseHotelPaymentInfo hotelCurrency(String hotelCurrency) {
    this.hotelCurrency = hotelCurrency;
    return this;
  }

   /**
   * Get hotelCurrency
   * @return hotelCurrency
  **/
  @ApiModelProperty(value = "")
  public String getHotelCurrency() {
    return hotelCurrency;
  }

  public void setHotelCurrency(String hotelCurrency) {
    this.hotelCurrency = hotelCurrency;
  }

  public BookResponseHotelPaymentInfo hotelPrice(String hotelPrice) {
    this.hotelPrice = hotelPrice;
    return this;
  }

   /**
   * Get hotelPrice
   * @return hotelPrice
  **/
  @ApiModelProperty(value = "")
  public String getHotelPrice() {
    return hotelPrice;
  }

  public void setHotelPrice(String hotelPrice) {
    this.hotelPrice = hotelPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookResponseHotelPaymentInfo bookResponseHotelPaymentInfo = (BookResponseHotelPaymentInfo) o;
    return Objects.equals(this.hotelCurrency, bookResponseHotelPaymentInfo.hotelCurrency) &&
        Objects.equals(this.hotelPrice, bookResponseHotelPaymentInfo.hotelPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelCurrency, hotelPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookResponseHotelPaymentInfo {\n");
    
    sb.append("    hotelCurrency: ").append(toIndentedString(hotelCurrency)).append("\n");
    sb.append("    hotelPrice: ").append(toIndentedString(hotelPrice)).append("\n");
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

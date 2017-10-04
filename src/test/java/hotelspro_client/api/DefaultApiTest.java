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


package hotelspro_client.api;

import hotelspro_client.ApiException;
import hotelspro_client.model.AvailabilityResponse;
import hotelspro_client.model.BookResponse;
import hotelspro_client.model.BookingListResponse;
import hotelspro_client.model.CancelResponse;
import hotelspro_client.model.Error;
import hotelspro_client.model.HotelAvailabilityResponse;
import hotelspro_client.model.ProvisionResponse;
import hotelspro_client.model.SearchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Availability with Product Code
     *
     * Check Availability of Selected Product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void availabilityProductCodeGetTest() throws ApiException {
        String productCode = null;
        AvailabilityResponse response = api.availabilityProductCodeGet(productCode);

        // TODO: test validations
    }
    
    /**
     * Book with Provision Code
     *
     * Returns Book Response
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookProvisionCodePostTest() throws ApiException {
        List<String> name = null;
        String provisionCode = null;
        BookResponse response = api.bookProvisionCodePost(name, provisionCode);

        // TODO: test validations
    }
    
    /**
     * Get Booking Detail
     *
     * Returns past booking(s) data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookingsBookingCodeGetTest() throws ApiException {
        String bookingCode = null;
        BookResponse response = api.bookingsBookingCodeGet(bookingCode);

        // TODO: test validations
    }
    
    /**
     * Get Booking List
     *
     * Returns past booking(s) data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookingsGetTest() throws ApiException {
        String fromDate = null;
        String toDate = null;
        String format = null;
        BookingListResponse response = api.bookingsGet(fromDate, toDate, format);

        // TODO: test validations
    }
    
    /**
     * Cancel Booking with Booking Code
     *
     * Cancel the Booking
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelBookingCodePostTest() throws ApiException {
        String bookingCode = null;
        CancelResponse response = api.cancelBookingCodePost(bookingCode);

        // TODO: test validations
    }
    
    /**
     * Hotel Availability with Hotel Code and Search Code
     *
     * Check Availability of Selected Hotel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotelAvailabilityGetTest() throws ApiException {
        String searchCode = null;
        String hotelCode = null;
        HotelAvailabilityResponse response = api.hotelAvailabilityGet(searchCode, hotelCode);

        // TODO: test validations
    }
    
    /**
     * Provision with Product Code
     *
     * Provision of Selected Product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionProductCodePostTest() throws ApiException {
        String productCode = null;
        ProvisionResponse response = api.provisionProductCodePost(productCode);

        // TODO: test validations
    }
    
    /**
     * Search with Hotel Code(Hotel Code List) or Destination Code or Geolocation
     *
     * Returns list of products
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchPostTest() throws ApiException {
        List<String> pax = null;
        String checkin = null;
        String checkout = null;
        String clientNationality = null;
        String currency = null;
        String hotelCode = null;
        String destinationCode = null;
        String lat = null;
        String lon = null;
        String radius = null;
        Integer maxProduct = null;
        SearchResponse response = api.searchPost(pax, checkin, checkout, clientNationality, currency, hotelCode, destinationCode, lat, lon, radius, maxProduct);

        // TODO: test validations
    }
    
}
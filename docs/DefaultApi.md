# DefaultApi

All URIs are relative to *https://localhost/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availabilityProductCodeGet**](DefaultApi.md#availabilityProductCodeGet) | **GET** /availability/{product_code} | Availability with Product Code
[**bookProvisionCodePost**](DefaultApi.md#bookProvisionCodePost) | **POST** /book/{provision_code} | Book with Provision Code
[**bookingsBookingCodeGet**](DefaultApi.md#bookingsBookingCodeGet) | **GET** /bookings/{booking_code} | Get Booking Detail
[**bookingsGet**](DefaultApi.md#bookingsGet) | **GET** /bookings/ | Get Booking List
[**cancelBookingCodePost**](DefaultApi.md#cancelBookingCodePost) | **POST** /cancel/{booking_code} | Cancel Booking with Booking Code
[**hotelAvailabilityGet**](DefaultApi.md#hotelAvailabilityGet) | **GET** /hotel-availability/ | Hotel Availability with Hotel Code and Search Code
[**provisionProductCodePost**](DefaultApi.md#provisionProductCodePost) | **POST** /provision/{product_code} | Provision with Product Code
[**searchPost**](DefaultApi.md#searchPost) | **POST** /search/ | Search with Hotel Code(Hotel Code List) or Destination Code or Geolocation


<a name="availabilityProductCodeGet"></a>
# **availabilityProductCodeGet**
> AvailabilityResponse availabilityProductCodeGet(productCode)

Availability with Product Code

Check Availability of Selected Product

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String productCode = "productCode_example"; // String | product code that returned in Search(or Hotel Availability) Response
try {
    AvailabilityResponse result = apiInstance.availabilityProductCodeGet(productCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#availabilityProductCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **String**| product code that returned in Search(or Hotel Availability) Response |

### Return type

[**AvailabilityResponse**](AvailabilityResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bookProvisionCodePost"></a>
# **bookProvisionCodePost**
> BookResponse bookProvisionCodePost(name, provisionCode)

Book with Provision Code

Returns Book Response

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
List<String> name = Arrays.asList("name_example"); // List<String> | A person's name.
String provisionCode = "provisionCode_example"; // String | 
try {
    BookResponse result = apiInstance.bookProvisionCodePost(name, provisionCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#bookProvisionCodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**List&lt;String&gt;**](String.md)| A person&#39;s name. |
 **provisionCode** | **String**|  |

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="bookingsBookingCodeGet"></a>
# **bookingsBookingCodeGet**
> BookResponse bookingsBookingCodeGet(bookingCode)

Get Booking Detail

Returns past booking(s) data.

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String bookingCode = "bookingCode_example"; // String | This is the code that taken from the response of bookings request
try {
    BookResponse result = apiInstance.bookingsBookingCodeGet(bookingCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#bookingsBookingCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingCode** | **String**| This is the code that taken from the response of bookings request |

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bookingsGet"></a>
# **bookingsGet**
> BookingListResponse bookingsGet(fromDate, toDate, format)

Get Booking List

Returns past booking(s) data.

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String fromDate = "fromDate_example"; // String | This is the booking date for filtering the bookings from the from_date(YYYY-MM-DD).
String toDate = "toDate_example"; // String | This is the booking date for filtering the bookings until the to_date(YYYY-MM-DD).
String format = "format_example"; // String | Only JSON supported
try {
    BookingListResponse result = apiInstance.bookingsGet(fromDate, toDate, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#bookingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **String**| This is the booking date for filtering the bookings from the from_date(YYYY-MM-DD). | [optional]
 **toDate** | **String**| This is the booking date for filtering the bookings until the to_date(YYYY-MM-DD). | [optional]
 **format** | **String**| Only JSON supported | [optional]

### Return type

[**BookingListResponse**](BookingListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelBookingCodePost"></a>
# **cancelBookingCodePost**
> CancelResponse cancelBookingCodePost(bookingCode)

Cancel Booking with Booking Code

Cancel the Booking

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String bookingCode = "bookingCode_example"; // String | Booking Code that returned in Book Response
try {
    CancelResponse result = apiInstance.cancelBookingCodePost(bookingCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelBookingCodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingCode** | **String**| Booking Code that returned in Book Response |

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="hotelAvailabilityGet"></a>
# **hotelAvailabilityGet**
> HotelAvailabilityResponse hotelAvailabilityGet(searchCode, hotelCode)

Hotel Availability with Hotel Code and Search Code

Check Availability of Selected Hotel

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String searchCode = "searchCode_example"; // String | search code that returned in search response
String hotelCode = "hotelCode_example"; // String | requested hotel code
try {
    HotelAvailabilityResponse result = apiInstance.hotelAvailabilityGet(searchCode, hotelCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hotelAvailabilityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCode** | **String**| search code that returned in search response |
 **hotelCode** | **String**| requested hotel code |

### Return type

[**HotelAvailabilityResponse**](HotelAvailabilityResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="provisionProductCodePost"></a>
# **provisionProductCodePost**
> ProvisionResponse provisionProductCodePost(productCode)

Provision with Product Code

Provision of Selected Product

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String productCode = "productCode_example"; // String | product code that returned in Search(or Hotel Availability) Response
try {
    ProvisionResponse result = apiInstance.provisionProductCodePost(productCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#provisionProductCodePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **String**| product code that returned in Search(or Hotel Availability) Response |

### Return type

[**ProvisionResponse**](ProvisionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="searchPost"></a>
# **searchPost**
> SearchResponse searchPost(pax, checkin, checkout, clientNationality, currency, hotelCode, destinationCode, lat, lon, radius, maxProduct)

Search with Hotel Code(Hotel Code List) or Destination Code or Geolocation

Returns list of products

### Example
```java
// Import classes:
//import hotelspro_client.ApiClient;
//import hotelspro_client.ApiException;
//import hotelspro_client.Configuration;
//import hotelspro_client.auth.*;
//import hotelspro_client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
List<String> pax = Arrays.asList("pax_example"); // List<String> | Number of pax
String checkin = "checkin_example"; // String | Checkin
String checkout = "checkout_example"; // String | Checkout
String clientNationality = "clientNationality_example"; // String | Client Nationality
String currency = "currency_example"; // String | Currency (Supported Currencies USD, EUR, GBP, TRY)
String hotelCode = "hotelCode_example"; // String | Requested Hotel Code
String destinationCode = "destinationCode_example"; // String | Requested Destination Code
String lat = "lat_example"; // String | Requested Latitude Code(lat, lon and radius should be given together)
String lon = "lon_example"; // String | Requested Longitude Code(lat, lon and radius should be given together)
String radius = "radius_example"; // String | Requested Radius Code(lat, lon and radius should be given together)
Integer maxProduct = 56; // Integer | Max Product
try {
    SearchResponse result = apiInstance.searchPost(pax, checkin, checkout, clientNationality, currency, hotelCode, destinationCode, lat, lon, radius, maxProduct);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#searchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pax** | [**List&lt;String&gt;**](String.md)| Number of pax |
 **checkin** | **String**| Checkin |
 **checkout** | **String**| Checkout |
 **clientNationality** | **String**| Client Nationality |
 **currency** | **String**| Currency (Supported Currencies USD, EUR, GBP, TRY) | [enum: USD, EUR, GBP, TRY, AED]
 **hotelCode** | **String**| Requested Hotel Code | [optional]
 **destinationCode** | **String**| Requested Destination Code | [optional]
 **lat** | **String**| Requested Latitude Code(lat, lon and radius should be given together) | [optional]
 **lon** | **String**| Requested Longitude Code(lat, lon and radius should be given together) | [optional]
 **radius** | **String**| Requested Radius Code(lat, lon and radius should be given together) | [optional]
 **maxProduct** | **Integer**| Max Product | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


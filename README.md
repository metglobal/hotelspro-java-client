# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import hotelspro_client.*;
import hotelspro_client.auth.*;
import hotelspro_client.model.*;
import hotelspro_client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**availabilityProductCodeGet**](docs/DefaultApi.md#availabilityProductCodeGet) | **GET** /availability/{product_code} | Availability with Product Code
*DefaultApi* | [**bookProvisionCodePost**](docs/DefaultApi.md#bookProvisionCodePost) | **POST** /book/{provision_code} | Book with Provision Code
*DefaultApi* | [**bookingsBookingCodeGet**](docs/DefaultApi.md#bookingsBookingCodeGet) | **GET** /bookings/{booking_code} | Get Booking Detail
*DefaultApi* | [**bookingsGet**](docs/DefaultApi.md#bookingsGet) | **GET** /bookings/ | Get Booking List
*DefaultApi* | [**cancelBookingCodePost**](docs/DefaultApi.md#cancelBookingCodePost) | **POST** /cancel/{booking_code} | Cancel Booking with Booking Code
*DefaultApi* | [**hotelAvailabilityGet**](docs/DefaultApi.md#hotelAvailabilityGet) | **GET** /hotel-availability/ | Hotel Availability with Hotel Code and Search Code
*DefaultApi* | [**provisionProductCodePost**](docs/DefaultApi.md#provisionProductCodePost) | **POST** /provision/{product_code} | Provision with Product Code
*DefaultApi* | [**searchPost**](docs/DefaultApi.md#searchPost) | **POST** /search/ | Search with Hotel Code(Hotel Code List) or Destination Code or Geolocation


## Documentation for Models

 - [AvailabilityResponse](docs/AvailabilityResponse.md)
 - [BookResponse](docs/BookResponse.md)
 - [BookResponseConfirmationNumbers](docs/BookResponseConfirmationNumbers.md)
 - [BookResponseHotelPaymentInfo](docs/BookResponseHotelPaymentInfo.md)
 - [BookResponseRooms](docs/BookResponseRooms.md)
 - [BookingListResponse](docs/BookingListResponse.md)
 - [CancelResponse](docs/CancelResponse.md)
 - [Error](docs/Error.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorDetailsDetail](docs/ErrorDetailsDetail.md)
 - [HotelAvailabilityResponse](docs/HotelAvailabilityResponse.md)
 - [Pax](docs/Pax.md)
 - [Policy](docs/Policy.md)
 - [Product](docs/Product.md)
 - [ProvisionResponse](docs/ProvisionResponse.md)
 - [Results](docs/Results.md)
 - [Room](docs/Room.md)
 - [SearchResponse](docs/SearchResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

clientintegration@hotelspro.com


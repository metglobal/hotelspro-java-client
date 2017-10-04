
# BookResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | 
**createdAt** | **String** |  | 
**checkin** | **String** |  | 
**checkout** | **String** |  | 
**hotelCode** | **String** |  | 
**destinationCode** | **String** |  | 
**clientNationality** | **String** |  | 
**payAtHotel** | **Boolean** |  | 
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  | 
**mealtypeCode** | **String** |  | 
**nonrefundable** | **String** |  | 
**view** | **Boolean** |  |  [optional]
**price** | **String** |  | 
**policies** | [**List&lt;Policy&gt;**](Policy.md) |  | 
**rooms** | [**List&lt;Room&gt;**](Room.md) |  | 
**status** | **String** |  | 
**confirmationNumbers** | [**List&lt;BookResponseConfirmationNumbers&gt;**](BookResponseConfirmationNumbers.md) |  | 
**hotelPaymentInfo** | [**List&lt;BookResponseHotelPaymentInfo&gt;**](BookResponseHotelPaymentInfo.md) |  | 
**minimumSellingPrice** | **String** |  |  [optional]
**specialRequest** | **String** |  |  [optional]


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
USD | &quot;USD&quot;
EUR | &quot;EUR&quot;
GBP | &quot;GBP&quot;
TRY | &quot;TRY&quot;
AED | &quot;AED&quot;




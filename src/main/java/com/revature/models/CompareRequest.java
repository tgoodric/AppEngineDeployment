package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name = "compare_requests")
public class CompareRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private int requestId;
    @Column(name = "merchant_id")
    private String merchantId;
    @Column(name = "ssn", unique = true)
    private String ssn;
    @Column(name = "dob")
    private String dob;
    @Column(name = "street_address")
    private String streetAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "card_number")
    private String cardNumber;

    //constructors

    public CompareRequest(int requestId, String merchantId, String ssn, String dob, String streetAddress,
                          String city, String state, String zipCode, String cardNumber) {
        this.requestId = requestId;
        this.merchantId = merchantId;
        this.ssn = ssn;
        this.dob = dob;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cardNumber = cardNumber;
    }

    public CompareRequest(String merchantId, String ssn, String dob, String streetAddress, String city,
                          String state, String zipCode, String cardNumber) {
        this.merchantId = merchantId;
        this.ssn = ssn;
        this.dob = dob;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cardNumber = cardNumber;
    }

    public CompareRequest() {
        //not used
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CompareRequest{" +
                "requestId=" + requestId +
                ", merchantId='" + merchantId + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob='" + dob + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompareRequest request = (CompareRequest) o;

        if (requestId != request.requestId) return false;
        if (merchantId != null ? !merchantId.equals(request.merchantId) : request.merchantId != null) return false;
        if (ssn != null ? !ssn.equals(request.ssn) : request.ssn != null) return false;
        if (dob != null ? !dob.equals(request.dob) : request.dob != null) return false;
        if (streetAddress != null ? !streetAddress.equals(request.streetAddress) : request.streetAddress != null)
            return false;
        if (city != null ? !city.equals(request.city) : request.city != null) return false;
        if (state != null ? !state.equals(request.state) : request.state != null) return false;
        if (zipCode != null ? !zipCode.equals(request.zipCode) : request.zipCode != null) return false;
        return cardNumber != null ? cardNumber.equals(request.cardNumber) : request.cardNumber == null;
    }

    @Override
    public int hashCode() {
        int result = requestId;
        result = 31 * result + (merchantId != null ? merchantId.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        return result;
    }
}
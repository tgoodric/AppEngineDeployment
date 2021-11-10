package com.revature.models;

public class CompareRequest {
    private String merchantId;
    private Identity identity;
    private Address address;
    private String cardNumber;

    //constructors and boilerplate
    public CompareRequest(String merchantId, Identity identity, Address address, String cardNumber) {
        this.merchantId = merchantId;
        this.identity = identity;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public CompareRequest() {
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

package org.chintanu.service_rest_customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "customers")
public class Customer {

    public Customer() {
    }

    @Id
    @Column(name = "CUST_ID")
    private Integer customerId;

    @Column(name = "CUST_FIRST_NAME")
    private String customerFirstNm;

    @Column(name = "CUST_LAST_NAME")
    private String customerLastNm;

    @Column(name = "CUST_GENDER", columnDefinition = "CHAR(1 BYTE)")
    private String customerGender;

    @Column(name = "CUST_YEAR_OF_BIRTH")
    private Integer customerYOB;

    @Column(name = "CUST_MARITAL_STATUS")
    private String customerMaritalStatus;

    @Column(name = "CUST_STREET_ADDRESS")
    private String customerStreetAddress;

    @Column(name = "CUST_POSTAL_CODE")
    private String customerPostalCode;

    @Column(name = "CUST_CITY")
    private String customerCity;

    @Column(name = "CUST_CITY_ID")
    private Integer customerCityId;

    @Column(name = "CUST_STATE_PROVINCE")
    private String customerStateProvince;

    @Column(name = "CUST_STATE_PROVINCE_ID")
    private Integer customerStateProvinceId;

    @Column(name = "COUNTRY_ID")
    private Integer countryId;

    @Column(name = "CUST_MAIN_PHONE_NUMBER")
    private String customerMainPhNum;

    @Column(name = "CUST_INCOME_LEVEL")
    private String customerIncomeLvl;

    @Column(name = "CUST_CREDIT_LIMIT")
    private Integer customerCreditLimit;

    @Column(name = "CUST_EMAIL")
    private String customerEmail;

    @Column(name = "CUST_TOTAL")
    private String customerTotal;

    @Column(name = "CUST_TOTAL_ID")
    private Integer customerTotalId;

    @Column(name = "CUST_SRC_ID")
    private Integer customerSrcId;

    @Column(name = "CUST_EFF_FROM")
    private LocalDate customerEffFrom;

    @Column(name = "CUST_EFF_TO")
    private LocalDate customerEffTo;

    @Column(name = "CUST_VALID")
    private String customerValid;

    @Column(name = "LAST_UPDATED_TIMESTAMP")
    private LocalDateTime lastUpdateTimestamp;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstNm() {
        return customerFirstNm;
    }

    public void setCustomerFirstNm(String customerFirstNm) {
        this.customerFirstNm = customerFirstNm;
    }

    public String getCustomerLastNm() {
        return customerLastNm;
    }

    public void setCustomerLastNm(String customerLastNm) {
        this.customerLastNm = customerLastNm;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Integer getCustomerYOB() {
        return customerYOB;
    }

    public void setCustomerYOB(Integer customerYOB) {
        this.customerYOB = customerYOB;
    }

    public String getCustomerMaritalStatus() {
        return customerMaritalStatus;
    }

    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        this.customerMaritalStatus = customerMaritalStatus;
    }

    public String getCustomerStreetAddress() {
        return customerStreetAddress;
    }

    public void setCustomerStreetAddress(String customerStreetAddress) {
        this.customerStreetAddress = customerStreetAddress;
    }

    public String getCustomerPostalCode() {
        return customerPostalCode;
    }

    public void setCustomerPostalCode(String customerPostalCode) {
        this.customerPostalCode = customerPostalCode;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public Integer getCustomerCityId() {
        return customerCityId;
    }

    public void setCustomerCityId(Integer customerCityId) {
        this.customerCityId = customerCityId;
    }

    public String getCustomerStateProvince() {
        return customerStateProvince;
    }

    public void setCustomerStateProvince(String customerStateProvince) {
        this.customerStateProvince = customerStateProvince;
    }

    public Integer getCustomerStateProvinceId() {
        return customerStateProvinceId;
    }

    public void setCustomerStateProvinceId(Integer customerStateProvinceId) {
        this.customerStateProvinceId = customerStateProvinceId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCustomerMainPhNum() {
        return customerMainPhNum;
    }

    public void setCustomerMainPhNum(String customerMainPhNum) {
        this.customerMainPhNum = customerMainPhNum;
    }

    public String getCustomerIncomeLvl() {
        return customerIncomeLvl;
    }

    public void setCustomerIncomeLvl(String customerIncomeLvl) {
        this.customerIncomeLvl = customerIncomeLvl;
    }

    public Integer getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public void setCustomerCreditLimit(Integer customerCreditLimit) {
        this.customerCreditLimit = customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerTotal() {
        return customerTotal;
    }

    public void setCustomerTotal(String customerTotal) {
        this.customerTotal = customerTotal;
    }

    public Integer getCustomerTotalId() {
        return customerTotalId;
    }

    public void setCustomerTotalId(Integer customerTotalId) {
        this.customerTotalId = customerTotalId;
    }

    public Integer getCustomerSrcId() {
        return customerSrcId;
    }

    public void setCustomerSrcId(Integer customerSrcId) {
        this.customerSrcId = customerSrcId;
    }

    public LocalDate getCustomerEffFrom() {
        return customerEffFrom;
    }

    public void setCustomerEffFrom(LocalDate customerEffFrom) {
        this.customerEffFrom = customerEffFrom;
    }

    public LocalDate getCustomerEffTo() {
        return customerEffTo;
    }

    public void setCustomerEffTo(LocalDate customerEffTo) {
        this.customerEffTo = customerEffTo;
    }

    public String getCustomerValid() {
        return customerValid;
    }

    public void setCustomerValid(String customerValid) {
        this.customerValid = customerValid;
    }

    public LocalDateTime getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(LocalDateTime lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }
}

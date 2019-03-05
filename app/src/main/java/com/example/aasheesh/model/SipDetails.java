package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SipDetails {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("FundId_id")
@Expose
private Integer fundIdId;
@SerializedName("AmcCode")
@Expose
private String amcCode;
@SerializedName("AmcName")
@Expose
private String amcName;
@SerializedName("SchemeCode")
@Expose
private String schemeCode;
@SerializedName("SchemeName")
@Expose
private String schemeName;
@SerializedName("SipTransactionMode")
@Expose
private String sipTransactionMode;
@SerializedName("SipFrequency")
@Expose
private String sipFrequency;
@SerializedName("SipDates")
@Expose
private String sipDates;
@SerializedName("SipMinGap")
@Expose
private String sipMinGap;
@SerializedName("SipMaxGap")
@Expose
private String sipMaxGap;
@SerializedName("SipInstallmentGap")
@Expose
private String sipInstallmentGap;
@SerializedName("SipStatus")
@Expose
private String sipStatus;
@SerializedName("SipMinInstallmentAmount")
@Expose
private Integer sipMinInstallmentAmount;
@SerializedName("SipMaxInstallmentAmount")
@Expose
private Integer sipMaxInstallmentAmount;
@SerializedName("SipMultiplierAmount")
@Expose
private Integer sipMultiplierAmount;
@SerializedName("SipMinInstallmentNumbers")
@Expose
private Integer sipMinInstallmentNumbers;
@SerializedName("SipMaxInstallmentNumbers")
@Expose
private Integer sipMaxInstallmentNumbers;
@SerializedName("Isin")
@Expose
private String isin;
@SerializedName("SchemeType")
@Expose
private String schemeType;
@SerializedName("Active")
@Expose
private Integer active;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getFundIdId() {
return fundIdId;
}

public void setFundIdId(Integer fundIdId) {
this.fundIdId = fundIdId;
}

public String getAmcCode() {
return amcCode;
}

public void setAmcCode(String amcCode) {
this.amcCode = amcCode;
}

public String getAmcName() {
return amcName;
}

public void setAmcName(String amcName) {
this.amcName = amcName;
}

public String getSchemeCode() {
return schemeCode;
}

public void setSchemeCode(String schemeCode) {
this.schemeCode = schemeCode;
}

public String getSchemeName() {
return schemeName;
}

public void setSchemeName(String schemeName) {
this.schemeName = schemeName;
}

public String getSipTransactionMode() {
return sipTransactionMode;
}

public void setSipTransactionMode(String sipTransactionMode) {
this.sipTransactionMode = sipTransactionMode;
}

public String getSipFrequency() {
return sipFrequency;
}

public void setSipFrequency(String sipFrequency) {
this.sipFrequency = sipFrequency;
}

public String getSipDates() {
return sipDates;
}

public void setSipDates(String sipDates) {
this.sipDates = sipDates;
}

public String getSipMinGap() {
return sipMinGap;
}

public void setSipMinGap(String sipMinGap) {
this.sipMinGap = sipMinGap;
}

public String getSipMaxGap() {
return sipMaxGap;
}

public void setSipMaxGap(String sipMaxGap) {
this.sipMaxGap = sipMaxGap;
}

public String getSipInstallmentGap() {
return sipInstallmentGap;
}

public void setSipInstallmentGap(String sipInstallmentGap) {
this.sipInstallmentGap = sipInstallmentGap;
}

public String getSipStatus() {
return sipStatus;
}

public void setSipStatus(String sipStatus) {
this.sipStatus = sipStatus;
}

public Integer getSipMinInstallmentAmount() {
return sipMinInstallmentAmount;
}

public void setSipMinInstallmentAmount(Integer sipMinInstallmentAmount) {
this.sipMinInstallmentAmount = sipMinInstallmentAmount;
}

public Integer getSipMaxInstallmentAmount() {
return sipMaxInstallmentAmount;
}

public void setSipMaxInstallmentAmount(Integer sipMaxInstallmentAmount) {
this.sipMaxInstallmentAmount = sipMaxInstallmentAmount;
}

public Integer getSipMultiplierAmount() {
return sipMultiplierAmount;
}

public void setSipMultiplierAmount(Integer sipMultiplierAmount) {
this.sipMultiplierAmount = sipMultiplierAmount;
}

public Integer getSipMinInstallmentNumbers() {
return sipMinInstallmentNumbers;
}

public void setSipMinInstallmentNumbers(Integer sipMinInstallmentNumbers) {
this.sipMinInstallmentNumbers = sipMinInstallmentNumbers;
}

public Integer getSipMaxInstallmentNumbers() {
return sipMaxInstallmentNumbers;
}

public void setSipMaxInstallmentNumbers(Integer sipMaxInstallmentNumbers) {
this.sipMaxInstallmentNumbers = sipMaxInstallmentNumbers;
}

public String getIsin() {
return isin;
}

public void setIsin(String isin) {
this.isin = isin;
}

public String getSchemeType() {
return schemeType;
}

public void setSchemeType(String schemeType) {
this.schemeType = schemeType;
}

public Integer getActive() {
return active;
}

public void setActive(Integer active) {
this.active = active;
}

}
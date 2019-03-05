package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InvestNow {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("FundId_id")
@Expose
private Integer fundIdId;
@SerializedName("UniqueNo")
@Expose
private String uniqueNo;
@SerializedName("SchemeCode")
@Expose
private String schemeCode;
@SerializedName("RTASchemeCode")
@Expose
private String rTASchemeCode;
@SerializedName("AmcSchemeCode")
@Expose
private String amcSchemeCode;
@SerializedName("Isin")
@Expose
private String isin;
@SerializedName("AmcCode")
@Expose
private String amcCode;
@SerializedName("SchemeType")
@Expose
private String schemeType;
@SerializedName("SchemePlan")
@Expose
private String schemePlan;
@SerializedName("SchemeName")
@Expose
private String schemeName;
@SerializedName("PurchaseAllowed")
@Expose
private String purchaseAllowed;
@SerializedName("PurchaseTransactionMode")
@Expose
private String purchaseTransactionMode;
@SerializedName("MinimumPurchaseAmount")
@Expose
private Integer minimumPurchaseAmount;
@SerializedName("AdditionalPurchaseAmount")
@Expose
private Integer additionalPurchaseAmount;
@SerializedName("MaximumPurchaseAmount")
@Expose
private Integer maximumPurchaseAmount;
@SerializedName("PurchaseAmountMultiplier")
@Expose
private Integer purchaseAmountMultiplier;
@SerializedName("PurchaseCutoffTime")
@Expose
private String purchaseCutoffTime;
@SerializedName("RedemptionAllowed")
@Expose
private String redemptionAllowed;
@SerializedName("RedemptionTransactionMode")
@Expose
private String redemptionTransactionMode;
@SerializedName("MinimumRedemptionQty")
@Expose
private Integer minimumRedemptionQty;
@SerializedName("RedemptionQtyMultiplier")
@Expose
private Double redemptionQtyMultiplier;
@SerializedName("MaximumRedemptionQty")
@Expose
private Integer maximumRedemptionQty;
@SerializedName("RedemptionAmountMinimum")
@Expose
private Integer redemptionAmountMinimum;
@SerializedName("RedemptionAmountMaximum")
@Expose
private Integer redemptionAmountMaximum;
@SerializedName("RedemptionAmountMultiple")
@Expose
private Double redemptionAmountMultiple;
@SerializedName("RedemptionCutoffTime")
@Expose
private String redemptionCutoffTime;
@SerializedName("RTAAgentCode")
@Expose
private String rTAAgentCode;
@SerializedName("AmcActiveFlag")
@Expose
private String amcActiveFlag;
@SerializedName("DividendReinvestmentFlag")
@Expose
private String dividendReinvestmentFlag;
@SerializedName("SipFlag")
@Expose
private String sipFlag;
@SerializedName("StpFlag")
@Expose
private String stpFlag;
@SerializedName("SwpFlag")
@Expose
private String swpFlag;
@SerializedName("SwitchFlag")
@Expose
private String switchFlag;
@SerializedName("SettlementType")
@Expose
private String settlementType;
@SerializedName("FaceValue")
@Expose
private String faceValue;
@SerializedName("StartDate")
@Expose
private String startDate;
@SerializedName("EndDate")
@Expose
private String endDate;
@SerializedName("ExitLoadFlag")
@Expose
private String exitLoadFlag;
@SerializedName("ExitLoad")
@Expose
private String exitLoad;
@SerializedName("LockinPeriodFlag")
@Expose
private String lockinPeriodFlag;
@SerializedName("LockinPeriod")
@Expose
private String lockinPeriod;
@SerializedName("ChannelPartnerCode")
@Expose
private String channelPartnerCode;
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

public String getUniqueNo() {
return uniqueNo;
}

public void setUniqueNo(String uniqueNo) {
this.uniqueNo = uniqueNo;
}

public String getSchemeCode() {
return schemeCode;
}

public void setSchemeCode(String schemeCode) {
this.schemeCode = schemeCode;
}

public String getRTASchemeCode() {
return rTASchemeCode;
}

public void setRTASchemeCode(String rTASchemeCode) {
this.rTASchemeCode = rTASchemeCode;
}

public String getAmcSchemeCode() {
return amcSchemeCode;
}

public void setAmcSchemeCode(String amcSchemeCode) {
this.amcSchemeCode = amcSchemeCode;
}

public String getIsin() {
return isin;
}

public void setIsin(String isin) {
this.isin = isin;
}

public String getAmcCode() {
return amcCode;
}

public void setAmcCode(String amcCode) {
this.amcCode = amcCode;
}

public String getSchemeType() {
return schemeType;
}

public void setSchemeType(String schemeType) {
this.schemeType = schemeType;
}

public String getSchemePlan() {
return schemePlan;
}

public void setSchemePlan(String schemePlan) {
this.schemePlan = schemePlan;
}

public String getSchemeName() {
return schemeName;
}

public void setSchemeName(String schemeName) {
this.schemeName = schemeName;
}

public String getPurchaseAllowed() {
return purchaseAllowed;
}

public void setPurchaseAllowed(String purchaseAllowed) {
this.purchaseAllowed = purchaseAllowed;
}

public String getPurchaseTransactionMode() {
return purchaseTransactionMode;
}

public void setPurchaseTransactionMode(String purchaseTransactionMode) {
this.purchaseTransactionMode = purchaseTransactionMode;
}

public Integer getMinimumPurchaseAmount() {
return minimumPurchaseAmount;
}

public void setMinimumPurchaseAmount(Integer minimumPurchaseAmount) {
this.minimumPurchaseAmount = minimumPurchaseAmount;
}

public Integer getAdditionalPurchaseAmount() {
return additionalPurchaseAmount;
}

public void setAdditionalPurchaseAmount(Integer additionalPurchaseAmount) {
this.additionalPurchaseAmount = additionalPurchaseAmount;
}

public Integer getMaximumPurchaseAmount() {
return maximumPurchaseAmount;
}

public void setMaximumPurchaseAmount(Integer maximumPurchaseAmount) {
this.maximumPurchaseAmount = maximumPurchaseAmount;
}

public Integer getPurchaseAmountMultiplier() {
return purchaseAmountMultiplier;
}

public void setPurchaseAmountMultiplier(Integer purchaseAmountMultiplier) {
this.purchaseAmountMultiplier = purchaseAmountMultiplier;
}

public String getPurchaseCutoffTime() {
return purchaseCutoffTime;
}

public void setPurchaseCutoffTime(String purchaseCutoffTime) {
this.purchaseCutoffTime = purchaseCutoffTime;
}

public String getRedemptionAllowed() {
return redemptionAllowed;
}

public void setRedemptionAllowed(String redemptionAllowed) {
this.redemptionAllowed = redemptionAllowed;
}

public String getRedemptionTransactionMode() {
return redemptionTransactionMode;
}

public void setRedemptionTransactionMode(String redemptionTransactionMode) {
this.redemptionTransactionMode = redemptionTransactionMode;
}

public Integer getMinimumRedemptionQty() {
return minimumRedemptionQty;
}

public void setMinimumRedemptionQty(Integer minimumRedemptionQty) {
this.minimumRedemptionQty = minimumRedemptionQty;
}

public Double getRedemptionQtyMultiplier() {
return redemptionQtyMultiplier;
}

public void setRedemptionQtyMultiplier(Double redemptionQtyMultiplier) {
this.redemptionQtyMultiplier = redemptionQtyMultiplier;
}

public Integer getMaximumRedemptionQty() {
return maximumRedemptionQty;
}

public void setMaximumRedemptionQty(Integer maximumRedemptionQty) {
this.maximumRedemptionQty = maximumRedemptionQty;
}

public Integer getRedemptionAmountMinimum() {
return redemptionAmountMinimum;
}

public void setRedemptionAmountMinimum(Integer redemptionAmountMinimum) {
this.redemptionAmountMinimum = redemptionAmountMinimum;
}

public Integer getRedemptionAmountMaximum() {
return redemptionAmountMaximum;
}

public void setRedemptionAmountMaximum(Integer redemptionAmountMaximum) {
this.redemptionAmountMaximum = redemptionAmountMaximum;
}

public Double getRedemptionAmountMultiple() {
return redemptionAmountMultiple;
}

public void setRedemptionAmountMultiple(Double redemptionAmountMultiple) {
this.redemptionAmountMultiple = redemptionAmountMultiple;
}

public String getRedemptionCutoffTime() {
return redemptionCutoffTime;
}

public void setRedemptionCutoffTime(String redemptionCutoffTime) {
this.redemptionCutoffTime = redemptionCutoffTime;
}

public String getRTAAgentCode() {
return rTAAgentCode;
}

public void setRTAAgentCode(String rTAAgentCode) {
this.rTAAgentCode = rTAAgentCode;
}

public String getAmcActiveFlag() {
return amcActiveFlag;
}

public void setAmcActiveFlag(String amcActiveFlag) {
this.amcActiveFlag = amcActiveFlag;
}

public String getDividendReinvestmentFlag() {
return dividendReinvestmentFlag;
}

public void setDividendReinvestmentFlag(String dividendReinvestmentFlag) {
this.dividendReinvestmentFlag = dividendReinvestmentFlag;
}

public String getSipFlag() {
return sipFlag;
}

public void setSipFlag(String sipFlag) {
this.sipFlag = sipFlag;
}

public String getStpFlag() {
return stpFlag;
}

public void setStpFlag(String stpFlag) {
this.stpFlag = stpFlag;
}

public String getSwpFlag() {
return swpFlag;
}

public void setSwpFlag(String swpFlag) {
this.swpFlag = swpFlag;
}

public String getSwitchFlag() {
return switchFlag;
}

public void setSwitchFlag(String switchFlag) {
this.switchFlag = switchFlag;
}

public String getSettlementType() {
return settlementType;
}

public void setSettlementType(String settlementType) {
this.settlementType = settlementType;
}

public String getFaceValue() {
return faceValue;
}

public void setFaceValue(String faceValue) {
this.faceValue = faceValue;
}

public String getStartDate() {
return startDate;
}

public void setStartDate(String startDate) {
this.startDate = startDate;
}

public String getEndDate() {
return endDate;
}

public void setEndDate(String endDate) {
this.endDate = endDate;
}

public String getExitLoadFlag() {
return exitLoadFlag;
}

public void setExitLoadFlag(String exitLoadFlag) {
this.exitLoadFlag = exitLoadFlag;
}

public String getExitLoad() {
return exitLoad;
}

public void setExitLoad(String exitLoad) {
this.exitLoad = exitLoad;
}

public String getLockinPeriodFlag() {
return lockinPeriodFlag;
}

public void setLockinPeriodFlag(String lockinPeriodFlag) {
this.lockinPeriodFlag = lockinPeriodFlag;
}

public String getLockinPeriod() {
return lockinPeriod;
}

public void setLockinPeriod(String lockinPeriod) {
this.lockinPeriod = lockinPeriod;
}

public String getChannelPartnerCode() {
return channelPartnerCode;
}

public void setChannelPartnerCode(String channelPartnerCode) {
this.channelPartnerCode = channelPartnerCode;
}

public Integer getActive() {
return active;
}

public void setActive(Integer active) {
this.active = active;
}

}
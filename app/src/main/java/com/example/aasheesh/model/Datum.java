package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

//@SerializedName("InvestNow")
//@Expose
//private InvestNow investNow;
@SerializedName("SipDetails")
@Expose
private SipDetails sipDetails;
@SerializedName("aum")
@Expose
private Integer aum;
@SerializedName("bearishReturns")
@Expose
private BearishReturns bearishReturns;
@SerializedName("category")
@Expose
private String category;
@SerializedName("categoryId")
@Expose
private Integer categoryId;
@SerializedName("expenseRatio")
@Expose
private Double expenseRatio;
@SerializedName("fundType")
@Expose
private String fundType;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("inceptionDate")
@Expose
private String inceptionDate;
@SerializedName("isDividend")
@Expose
private Boolean isDividend;
@SerializedName("isFmp")
@Expose
private Boolean isFmp;
@SerializedName("isFmpOpen")
@Expose
private Boolean isFmpOpen;
@SerializedName("lumpsumAllowed")
@Expose
private Boolean lumpsumAllowed;
@SerializedName("lumpsumMinimum")
@Expose
private Integer lumpsumMinimum;
//@SerializedName("lumpsumMultiplier")
//@Expose
//private Integer lumpsumMultiplier;
@SerializedName("mstarId")
@Expose
private String mstarId;
@SerializedName("name")
@Expose
private String name;
@SerializedName("nav")
@Expose
private Double nav;
@SerializedName("planType")
@Expose
private String planType;
@SerializedName("projectedReturns")
@Expose
private ProjectedReturns projectedReturns;
@SerializedName("rating")
@Expose
private Integer rating;
@SerializedName("returns")
@Expose
private Returns returns;
@SerializedName("risk")
@Expose
private String risk;
@SerializedName("scores")
@Expose
private Scores scores;
@SerializedName("sipAllowed")
@Expose
private Boolean sipAllowed;
@SerializedName("sipMinimum")
@Expose
private Integer sipMinimum;
@SerializedName("sipMultiplier")
@Expose
private Integer sipMultiplier;
@SerializedName("tagIRSensitivity")
@Expose
private String tagIRSensitivity;
@SerializedName("takeCheque")
@Expose
private Boolean takeCheque;
@SerializedName("tenure")
@Expose
private Object tenure;

//public InvestNow getInvestNow() {
//return investNow;
//}
//
//public void setInvestNow(InvestNow investNow) {
//this.investNow = investNow;
//}

public SipDetails getSipDetails() {
return sipDetails;
}

public void setSipDetails(SipDetails sipDetails) {
this.sipDetails = sipDetails;
}

public Integer getAum() {
return aum;
}

public void setAum(Integer aum) {
this.aum = aum;
}

public BearishReturns getBearishReturns() {
return bearishReturns;
}

public void setBearishReturns(BearishReturns bearishReturns) {
this.bearishReturns = bearishReturns;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public Integer getCategoryId() {
return categoryId;
}

public void setCategoryId(Integer categoryId) {
this.categoryId = categoryId;
}

public Double getExpenseRatio() {
return expenseRatio;
}

public void setExpenseRatio(Double expenseRatio) {
this.expenseRatio = expenseRatio;
}

public String getFundType() {
return fundType;
}

public void setFundType(String fundType) {
this.fundType = fundType;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getInceptionDate() {
return inceptionDate;
}

public void setInceptionDate(String inceptionDate) {
this.inceptionDate = inceptionDate;
}

public Boolean getIsDividend() {
return isDividend;
}

public void setIsDividend(Boolean isDividend) {
this.isDividend = isDividend;
}

public Boolean getIsFmp() {
return isFmp;
}

public void setIsFmp(Boolean isFmp) {
this.isFmp = isFmp;
}

public Boolean getIsFmpOpen() {
return isFmpOpen;
}

public void setIsFmpOpen(Boolean isFmpOpen) {
this.isFmpOpen = isFmpOpen;
}

public Boolean getLumpsumAllowed() {
return lumpsumAllowed;
}

public void setLumpsumAllowed(Boolean lumpsumAllowed) {
this.lumpsumAllowed = lumpsumAllowed;
}

public Integer getLumpsumMinimum() {
return lumpsumMinimum;
}

public void setLumpsumMinimum(Integer lumpsumMinimum) {
this.lumpsumMinimum = lumpsumMinimum;
}

//public Integer getLumpsumMultiplier() {
//return lumpsumMultiplier;
//}
//
//public void setLumpsumMultiplier(Integer lumpsumMultiplier) {
//this.lumpsumMultiplier = lumpsumMultiplier;
//}

public String getMstarId() {
return mstarId;
}

public void setMstarId(String mstarId) {
this.mstarId = mstarId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Double getNav() {
return nav;
}

public void setNav(Double nav) {
this.nav = nav;
}

public String getPlanType() {
return planType;
}

public void setPlanType(String planType) {
this.planType = planType;
}

public ProjectedReturns getProjectedReturns() {
return projectedReturns;
}

public void setProjectedReturns(ProjectedReturns projectedReturns) {
this.projectedReturns = projectedReturns;
}

public Integer getRating() {
return rating;
}

public void setRating(Integer rating) {
this.rating = rating;
}

public Returns getReturns() {
return returns;
}

public void setReturns(Returns returns) {
this.returns = returns;
}

public String getRisk() {
return risk;
}

public void setRisk(String risk) {
this.risk = risk;
}

public Scores getScores() {
return scores;
}

public void setScores(Scores scores) {
this.scores = scores;
}

public Boolean getSipAllowed() {
return sipAllowed;
}

public void setSipAllowed(Boolean sipAllowed) {
this.sipAllowed = sipAllowed;
}

public Integer getSipMinimum() {
return sipMinimum;
}

public void setSipMinimum(Integer sipMinimum) {
this.sipMinimum = sipMinimum;
}

public Integer getSipMultiplier() {
return sipMultiplier;
}

public void setSipMultiplier(Integer sipMultiplier) {
this.sipMultiplier = sipMultiplier;
}

public String getTagIRSensitivity() {
return tagIRSensitivity;
}

public void setTagIRSensitivity(String tagIRSensitivity) {
this.tagIRSensitivity = tagIRSensitivity;
}

public Boolean getTakeCheque() {
return takeCheque;
}

public void setTakeCheque(Boolean takeCheque) {
this.takeCheque = takeCheque;
}

public Object getTenure() {
return tenure;
}

public void setTenure(Object tenure) {
this.tenure = tenure;
}

}
package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scores {

@SerializedName("score")
@Expose
private Integer score;
@SerializedName("returnScore")
@Expose
private Double returnScore;
@SerializedName("riskScore")
@Expose
private Double riskScore;
//@SerializedName("fmScore")
//@Expose
//private Integer fmScore;
@SerializedName("tagReturn")
@Expose
private String tagReturn;
@SerializedName("tagRisk")
@Expose
private String tagRisk;
@SerializedName("rrScore")
@Expose
private Integer rrScore;

public Integer getScore() {
return score;
}

public void setScore(Integer score) {
this.score = score;
}

public Double getReturnScore() {
return returnScore;
}

public void setReturnScore(Double returnScore) {
this.returnScore = returnScore;
}

public Double getRiskScore() {
return riskScore;
}

public void setRiskScore(Double riskScore) {
this.riskScore = riskScore;
}

//public Integer getFmScore() {
//return fmScore;
//}
//
//public void setFmScore(Integer fmScore) {
//this.fmScore = fmScore;
//}

public String getTagReturn() {
return tagReturn;
}

public void setTagReturn(String tagReturn) {
this.tagReturn = tagReturn;
}

public String getTagRisk() {
return tagRisk;
}

public void setTagRisk(String tagRisk) {
this.tagRisk = tagRisk;
}

public Integer getRrScore() {
return rrScore;
}

public void setRrScore(Integer rrScore) {
this.rrScore = rrScore;
}

}
package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BearishReturns {

@SerializedName("fiveYear")
@Expose
private Double fiveYear;
@SerializedName("threeYear")
@Expose
private Double threeYear;
@SerializedName("oneYear")
@Expose
private Double oneYear;

public Double getFiveYear() {
return fiveYear;
}

public void setFiveYear(Double fiveYear) {
this.fiveYear = fiveYear;
}

public Double getThreeYear() {
return threeYear;
}

public void setThreeYear(Double threeYear) {
this.threeYear = threeYear;
}

public Double getOneYear() {
return oneYear;
}

public void setOneYear(Double oneYear) {
this.oneYear = oneYear;
}

}
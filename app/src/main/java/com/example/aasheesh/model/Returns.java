package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Returns {

@SerializedName("oneYear")
@Expose
private Double oneYear;
@SerializedName("threeYear")
@Expose
private Double threeYear;
@SerializedName("fiveYear")
@Expose
private Double fiveYear;

public Double getOneYear() {
return oneYear;
}

public void setOneYear(Double oneYear) {
this.oneYear = oneYear;
}

public Double getThreeYear() {
return threeYear;
}

public void setThreeYear(Double threeYear) {
this.threeYear = threeYear;
}

public Double getFiveYear() {
return fiveYear;
}

public void setFiveYear(Double fiveYear) {
this.fiveYear = fiveYear;
}

}
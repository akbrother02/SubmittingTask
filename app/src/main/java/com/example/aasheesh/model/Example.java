package com.example.aasheesh.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

@SerializedName("count")
@Expose
private Integer count;
@SerializedName("data")
@Expose
private List<Datum> data = null;

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public List<Datum> getData() {
return data;
}

public void setData(List<Datum> data) {
this.data = data;
}

}
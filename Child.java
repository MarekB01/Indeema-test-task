package com.example.redditapp.api.model.top;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("data")
    @Expose
    private com.slava.reddittop.model.top.Post data;

    public com.slava.reddittop.model.top.Post getData() {
        return data;
    }

    public void setData(com.slava.reddittop.model.top.Post data) {
        this.data = data;
    }

}

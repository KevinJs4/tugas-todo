package com.example.todo;

import  com.google.gson.annotations.SerializedName;

public class todoItem {
    @SerializedName("id")
    private int id;

    @SerializedName("what")
    private String what;

    @SerializedName("time")
    private String time;

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

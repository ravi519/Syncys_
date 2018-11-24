package com.example.ravikumar.syncys_task.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class User {

    @SerializedName("users")
    private  ArrayList<users>list;

    public ArrayList<users> getList() {
        return list;
    }

    public void setList(ArrayList<users> list) {
        this.list = list;
    }



}

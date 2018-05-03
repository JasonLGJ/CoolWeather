package com.example14.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;//舒适
    public class Comfort{
        @SerializedName("type")
        public String type;
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("sport")
    public Sport sport;//运动
    public class Sport{
        @SerializedName("type")
        public String type;
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public Cw cw;//有雨
    public class Cw{
        @SerializedName("type")
        public String type;
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
}

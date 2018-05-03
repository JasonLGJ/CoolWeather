package com.example14.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {

    @SerializedName("city")
    public AQICITY city;
    public class AQICITY{
        @SerializedName("aqi")
        public String aqi;//空气质量指数
        @SerializedName("pm25")
        public String pm25;//PM2.5指数
        @SerializedName("qlty")
        public String qlty;//空气质量（优/良/轻度污染/中度污染/重度污染/严重污染）
    }

}

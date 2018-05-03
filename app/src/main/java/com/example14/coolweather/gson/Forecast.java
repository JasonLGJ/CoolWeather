package com.example14.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt_d")
        public String info;//白天天气状况描述
    }

    @SerializedName("date")
    public String date;//预报日期

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        @SerializedName("max")
        public String max;//最高温度
        @SerializedName("min")
        public String min;//最低温度
    }

}

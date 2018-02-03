package com.coolweaher.android.gson;

/**
 * Created by baicai on 2018/2/3.
 */

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
package com.coolweaher.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by baicai on 2018/2/2.
 */

public class County extends DataSupport {

    private int id; // 每个实体类都应有的字段

    private String countyName; // 县名称

    private String weatherId; // 天气id

    private int cityId; // 所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}

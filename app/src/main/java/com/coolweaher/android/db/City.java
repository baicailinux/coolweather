package com.coolweaher.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by baicai on 2018/2/1.
 */

public class City extends DataSupport {

    private int id; // 每个实体类都应有的字段

    private String cityName; // 市名称

    private int cityCode; // 市代号

    private int procinceId; // 当前市所属省的id

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProcinceId() {
        return procinceId;
    }

    public void setProcinceId(int procinceId) {
        this.procinceId = procinceId;
    }
}

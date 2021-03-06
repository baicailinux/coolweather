package com.coolweaher.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by baicai on 2018/2/1.
 */

public class Province extends DataSupport {

    private int id;  // 每个实体类都应有的字段

    private String provinceName; // 省名称

    private int provinceCode; // 省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

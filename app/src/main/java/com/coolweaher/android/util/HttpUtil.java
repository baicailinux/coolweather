package com.coolweaher.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by baicai on 2018/2/2.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build(); // 创建一个Request对象
        client.newCall(request).enqueue(callback); // 通过client发送请求，Callback回调结果
    }
}

package com.example.asus.threemodel.application;

import android.app.Application;

import com.vise.xsnow.http.ViseHttp;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ViseHttp.init(this);
        ViseHttp.CONFIG()
                //配置请求主机地址
                .baseUrl("http://api.svipmovie.com/")
                .callAdapterFactory(RxJava2CallAdapterFactory.create());
    }
}

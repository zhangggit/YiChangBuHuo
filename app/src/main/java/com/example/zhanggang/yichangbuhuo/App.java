package com.example.zhanggang.yichangbuhuo;

import android.app.Application;

/**
 * 类作用：
 * 时  间：2017/9/14 - 15:52.
 * 创建人：张刚
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}

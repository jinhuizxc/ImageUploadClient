package com.kevin.imageuploadclient;

import android.app.Application;
import android.content.Context;

import com.kevin.imageuploadclient.activity.basic.ActivityStack;

public class KevinApplication extends Application {

    protected static KevinApplication kevinApplication = null;
    /**
     * 上下文
     */
    protected Context mContext = null;
    /**
     * Activity 栈
     */
    public ActivityStack mActivityStack = null;

    @Override
    public void onCreate() {
        super.onCreate();
        // 由于Application类本身已经单例，所以直接按以下处理即可
        kevinApplication = this;
        mContext = getApplicationContext();     // 获取上下文
        mActivityStack = new ActivityStack();   // 初始化Activity 栈

    }

    /**
     * 获取当前类实例对象
     *
     * @return
     */
    public static KevinApplication getInstance() {
        return kevinApplication;
    }

}

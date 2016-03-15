package com.hywel.mytest.app;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
	private static Context mAppContext;

	@Override
	public void onCreate() {
		super.onCreate();
		mAppContext = this;
	}

	public static Context getAppContext() {
		if (null == mAppContext) {
			mAppContext = getAppContext();
		}
		return mAppContext;
	}
}

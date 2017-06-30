package xunqaing.bwie.com.exeception_demo;

import android.app.Application;

/**
 * Created by : Xunqiang
 * 2017/6/14 17:58
 */

public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);

    }
}

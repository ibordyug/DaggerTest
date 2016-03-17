package com.example.ivanbordiuh.daggertest;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.example.ivanbordiuh.daggertest.dagger.component.ApplicationComponent;
import com.example.ivanbordiuh.daggertest.dagger.component.DaggerApplicationComponent;
import com.example.ivanbordiuh.daggertest.dagger.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Ivan.Bordiuh on 14.03.2016.
 */
public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;
    @Inject
    public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}

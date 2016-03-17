package com.example.ivanbordiuh.daggertest.dagger.module;

import android.content.Context;

import com.example.ivanbordiuh.daggertest.MyApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
@Module
public class ApplicationModule {
    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    public Context provideApplicationContext() {
        return application.getApplicationContext();
    }
}

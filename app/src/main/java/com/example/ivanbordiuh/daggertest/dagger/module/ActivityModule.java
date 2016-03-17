package com.example.ivanbordiuh.daggertest.dagger.module;

import android.app.Activity;
import android.support.v4.content.LocalBroadcastManager;

import com.example.ivanbordiuh.daggertest.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
@Module
public class ActivityModule {
    Activity activity;

    public ActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    public LocalBroadcastManager getLocalBroadcastManager() {
        return LocalBroadcastManager.getInstance(activity);
    }
}

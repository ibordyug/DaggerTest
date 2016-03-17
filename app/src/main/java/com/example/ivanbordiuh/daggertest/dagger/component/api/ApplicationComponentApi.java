package com.example.ivanbordiuh.daggertest.dagger.component.api;

import android.content.Context;

import com.example.ivanbordiuh.daggertest.dagger.scope.ApplicationContext;

import dagger.Provides;

/**
 * Created by Ivan.Bordiuh on 16.03.2016.
 */
public interface ApplicationComponentApi {
    Context getApplicationContext();
}

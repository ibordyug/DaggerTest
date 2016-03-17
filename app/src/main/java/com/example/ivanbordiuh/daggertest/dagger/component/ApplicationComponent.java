package com.example.ivanbordiuh.daggertest.dagger.component;

import android.content.Context;

import com.example.ivanbordiuh.daggertest.MyApplication;
import com.example.ivanbordiuh.daggertest.dagger.component.api.ApplicationComponentApi;
import com.example.ivanbordiuh.daggertest.dagger.module.ApplicationModule;
import com.example.ivanbordiuh.daggertest.dagger.scope.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent extends ApplicationComponentApi{
    void inject(MyApplication application);
}

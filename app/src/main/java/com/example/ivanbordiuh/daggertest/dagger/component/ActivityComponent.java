package com.example.ivanbordiuh.daggertest.dagger.component;

import com.example.ivanbordiuh.daggertest.MainActivity;
import com.example.ivanbordiuh.daggertest.dagger.component.api.ActivityComponentApi;
import com.example.ivanbordiuh.daggertest.dagger.component.api.ApplicationComponentApi;
import com.example.ivanbordiuh.daggertest.dagger.module.ActivityModule;

import dagger.Component;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent extends ActivityComponentApi{
    void inject(MainActivity mainActivity);
}

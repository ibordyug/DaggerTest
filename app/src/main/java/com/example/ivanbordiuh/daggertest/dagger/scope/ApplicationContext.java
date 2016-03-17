package com.example.ivanbordiuh.daggertest.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}

package com.example.administrator.dagger.dagger.module;

import android.app.Application;
import android.content.Context;

import com.example.administrator.dagger.SpfManager;
import com.example.administrator.dagger.http.ApiService;
import com.example.administrator.dagger.http.RetrofitManager;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/9/16.
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext(){
        return application;
    }

    @Provides
    @Singleton
    ApiService provideApiService(RetrofitManager manager){
        return manager.getApiService();
    }

    @Provides
    @Singleton
    SpfManager provideSpfManager(){
        return SpfManager.newInstance(application);
    }
}

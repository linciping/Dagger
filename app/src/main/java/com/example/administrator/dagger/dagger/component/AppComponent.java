package com.example.administrator.dagger.dagger.component;

import android.content.Context;

import com.example.administrator.dagger.SpfManager;
import com.example.administrator.dagger.dagger.module.AppModule;
import com.example.administrator.dagger.http.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2016/9/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();
    ApiService apiService();
    SpfManager spfManager();
}

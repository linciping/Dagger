package com.example.administrator.dagger.dagger.component;

import android.app.Activity;

import com.example.administrator.dagger.dagger.module.ActivityModule;
import com.example.administrator.dagger.dagger.scope.ActivityScope;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Administrator on 2016/9/17.
 */
@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();

    void inject(Activity activity);
}

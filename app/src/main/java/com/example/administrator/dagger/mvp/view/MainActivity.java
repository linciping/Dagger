package com.example.administrator.dagger.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.dagger.R;
import com.example.administrator.dagger.http.ApiService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

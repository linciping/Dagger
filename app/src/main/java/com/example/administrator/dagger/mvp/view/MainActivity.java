package com.example.administrator.dagger.mvp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.administrator.dagger.BaseActivity;
import com.example.administrator.dagger.R;
import com.example.administrator.dagger.SpfManager;
import com.example.administrator.dagger.dagger.component.AppComponent;
import com.example.administrator.dagger.dagger.component.DaggerAppComponent;
import com.example.administrator.dagger.dagger.component.DaggerUserComponent;
import com.example.administrator.dagger.dagger.component.UserComponent;
import com.example.administrator.dagger.dagger.module.ActivityModule;
import com.example.administrator.dagger.dagger.module.AppModule;
import com.example.administrator.dagger.dagger.module.UserModule;
import com.example.administrator.dagger.http.ApiService;
import com.example.administrator.dagger.mvp.model.User;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    User user;
    @Inject
    SpfManager manager;
    @Inject
    ApiService apiService;

    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userComponent().inject(this);
        btnSend= (Button) findViewById(R.id.btn_send);
        user.setName("林赐平");
        Log.d("MainActivity", user.getName());
        manager.putString("MainActivity", "test");
        Log.d("MainActivity", manager.getString("MainActivity"));
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CardIdInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    private UserComponent userComponent() {
        return DaggerUserComponent.builder()
                .activityModule(activityModule())
                .appComponent(appComponent())
                .userModule(new UserModule(this))
                .build();
    }
}

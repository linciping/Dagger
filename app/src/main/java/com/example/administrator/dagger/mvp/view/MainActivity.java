package com.example.administrator.dagger.mvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.dagger.BaseActivity;
import com.example.administrator.dagger.R;
import com.example.administrator.dagger.SpfManager;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Inject
    SpfManager spfManager;

    @BindView(R.id.btn_cache)
    Button btnCache;
    @BindView(R.id.ext_ipaddress)
    EditText extIpAddress;
    @BindView(R.id.btn_send)
    Button btnSend;
    @BindView(R.id.txt_county)
    TextView txtCounty;
    @BindView(R.id.txt_city)
    TextView txtCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        btnCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spfManager.put("cache","cache");
            }
        });
    }
}

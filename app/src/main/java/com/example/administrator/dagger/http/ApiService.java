package com.example.administrator.dagger.http;

import com.example.administrator.dagger.Constant;
import com.example.administrator.dagger.mvp.model.CardIdInfo;
import com.example.administrator.dagger.mvp.model.IpInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/16.
 */
public interface ApiService {

    @GET(Constant.CARD_ID_INFO_API)
    Observable<CardIdInfo> getCardIdInfo(@Query("id")String cardId);
}

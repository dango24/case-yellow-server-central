package com.caseyellow.server.central.services.infrastrucre;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

public class RetrofitBuilder {


    public static Retrofit.Builder Retrofit(String url) {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                                                          .readTimeout(130, TimeUnit.SECONDS)
                                                          .writeTimeout(130, TimeUnit.SECONDS)
                                                          .connectTimeout(130, TimeUnit.SECONDS)
                                                          .build();

        Retrofit.Builder retrofit = new Retrofit.Builder()
                                                .client(okHttpClient)
                                                .baseUrl(url);

        retrofit.addConverterFactory(JacksonConverterFactory.create());

        return retrofit;
    }

}

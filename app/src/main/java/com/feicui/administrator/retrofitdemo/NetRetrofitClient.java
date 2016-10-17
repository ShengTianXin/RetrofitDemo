package com.feicui.administrator.retrofitdemo;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class NetRetrofitClient implements RetrofitUserApi {
    private final RetrofitUserApi userApi;
    private static NetRetrofitClient netRetrofitClint;
    private String BASE_URL = "http://admin.syfeicuiedu.com";

    private NetRetrofitClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                /**给Retrofit添加GSON转换器*/
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        userApi = retrofit.create(RetrofitUserApi.class);
    }

    public static NetRetrofitClient getInstance() {
        if (netRetrofitClint == null) {
            netRetrofitClint = new NetRetrofitClient();
        }
        return netRetrofitClint;
    }

    @Override
    public Call<ResponseBody> getData() {
        return userApi.getData();
    }

    @Override
    public Call<UserResult> useRegister(@Body User user) {
        return userApi.useRegister(user);
    }
}

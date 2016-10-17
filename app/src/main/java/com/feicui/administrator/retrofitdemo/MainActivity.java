package com.feicui.administrator.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_Username)
    EditText etUsername;
    @BindView(R.id.et_Passrword)
    EditText etPassrword;
    @BindView(R.id.btn_Register)
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_Register)
    public void onClick() {
        User user = new User(etUsername.getText().toString(), etPassrword.getText().toString());
        NetRetrofitClient.getInstance().useRegister(user).enqueue(new Callback<UserResult>() {
            @Override
            public void onResponse(Call<UserResult> call, Response<UserResult> response) {
                UserResult result = response.body();
                Toast.makeText(MainActivity.this, "响应成功", Toast.LENGTH_SHORT).show();
                Log.i("TAG-------------->","响应成功");
            }

            @Override
            public void onFailure(Call<UserResult> call, Throwable t) {
                Toast.makeText(MainActivity.this, "响应失败", Toast.LENGTH_SHORT).show();

            }
        });
//        NetRetrofitClient.getInstance().getData().enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
//                Toast.makeText(MainActivity.this, "Response defeat", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Response succeed", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}

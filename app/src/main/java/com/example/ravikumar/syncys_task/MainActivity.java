package com.example.ravikumar.syncys_task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.ravikumar.syncys_task.pojos.User;
import com.example.ravikumar.syncys_task.pojos.UserAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView lview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lview=findViewById(R.id.lview);
    }
    public void user(View view)
    {
        Retrofit r=new Retrofit.Builder().
                baseUrl("https://api.github.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        UserAPI user=r.create(UserAPI.class);
        Call<User>call= user.getusers();

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user_=response.body();
                lview.setAdapter(new MyAdapter(MainActivity.this,user_));
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

    }
}

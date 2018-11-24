package com.example.ravikumar.syncys_task;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.ravikumar.syncys_task.pojos.User;

public class MyAdapter extends BaseAdapter {

    MainActivity mainActivity;
    User user_;
    public MyAdapter(MainActivity mainActivity, User user_) {

        this.mainActivity=mainActivity;
        this.user_=user_;
    }

    @Override
    public int getCount() {
        return user_.getList().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mainActivity);
        View v=inflater.inflate(R.layout.indi_view,null);
        TextView tv1=v.findViewById(R.id.tv1);
        Button btn1=v.findViewById(R.id.btn1);
        TextView tv2=v.findViewById(R.id.tv2);
        tv1.setText(user_.getList().get(position).getLogin());
        tv2.setText(user_.getList().get(position).getUrl());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainActivity , SecondActivity.class);

                i.putExtra("name",
                        user_.getList().get(position).getLogin());
                i.putExtra("login",
                        user_.getList().get(position).getId());
                i.putExtra("type",
                        user_.getList().get(position).getType());
                i.putExtra("url",
                        user_.getList().get(position).getUrl());

                mainActivity.startActivity(i);
            }
        });




        return v;
    }
}

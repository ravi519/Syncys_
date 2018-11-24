package com.example.ravikumar.firebase_login;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Iterator;

public class LoginActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    EditText name,phone,gender,dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        dob=findViewById(R.id.dob);
        gender=findViewById(R.id.gender);
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }


    public void insert(View view)
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myref=database.getReference("users");
      //  DatabaseReference child_ref=myref.child(FirebaseAuth.getInstance().getUid());///for getting userid
        DatabaseReference child_ref=myref.child(FirebaseAuth.getInstance().getUid());
        String Userid=child_ref;
        child_ref.child("Email").setValue(FirebaseAuth.getInstance().getCurrentUser().getEmail());
        child_ref.child("name").setValue(name.getText().toString());
        child_ref.child("phone").setValue(phone.getText().toString());
        child_ref.child("gender").setValue(gender.getText().toString());
        child_ref.child("dob").setValue(dob.getText().toString());
        Toast.makeText(LoginActivity.this,"inserted",Toast.LENGTH_LONG).show();

    }
    public void read(View view)
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myref=database.getRefer
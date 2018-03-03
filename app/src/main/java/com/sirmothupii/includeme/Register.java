package com.sirmothupii.includeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    //Link to take user to register screen
    public void onClickRegister(View view)
    {
        Intent intent1 = new Intent(this, SignIn.class);
        startActivity(intent1);
    }
}

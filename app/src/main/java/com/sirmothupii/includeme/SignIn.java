package com.sirmothupii.includeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    //Link to take user to dashboard screen
    public void onClickSignIn(View view)
    {
        Intent intent1 = new Intent(this, Register.class);
        startActivity(intent1);
    }

    //Link to take user to register screen
    public void onClickRegister(View view)
    {
        Intent intent1 = new Intent(this, SignIn.class);
        startActivity(intent1);
    }

    //Link to take user to navigation screen
    public void onClickIncludMe(View view)
    {
        Intent intent1 = new Intent(this, IncludeMe.class);
        startActivity(intent1);
    }
}

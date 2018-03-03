package com.sirmothupii.includeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SuggestSpending extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest_spending);
    }

    //onClick toast for up vote image button
    public void onItemClickBtnSend(View view)
    {
        //String selectedAnimal=animalsNameList.get(position);
        Toast.makeText(getApplicationContext(), " Feedback has been successfully sent: ",   Toast.LENGTH_LONG).show();
    }

}

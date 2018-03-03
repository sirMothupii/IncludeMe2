package com.sirmothupii.includeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sirmothupii.includeme.model.Spending;

import java.io.IOException;
import java.util.ArrayList;

public class Votes extends AppCompatActivity
{
    private SpendingHelper spendHelper;
    private Spending spending[];
    private static int Count;


    ArrayList<String> animalsNameList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Count = 0;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votes);

        spendHelper = new SpendingHelper();

        try
        {
            spendHelper.loadSpendingFromFile();
        }
        catch (IOException e)
        {

        }

        spending = spendHelper.getSpending();

        // Get the reference of ListViewAnimals
        ListView animalList=(ListView)findViewById(R.id.lstSpending);


        animalsNameList = new ArrayList<String>();
        getAnimalNames();
        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, animalsNameList);
        // Set The Adapter
        animalList.setAdapter(arrayAdapter);

        // register onClickListener to handle click events on each item
        animalList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3)
            {

                String selectedAnimal=animalsNameList.get(position);
                Toast.makeText(getApplicationContext(), "Animal Selected : "+selectedAnimal,   Toast.LENGTH_LONG).show();
            }

        });


    }

    //onClick toast for up vote image button
    public void onItemClickBtnUpVote(View v)
    {
        String selectedAnimal=animalsNameList.get(position);
        Toast.makeText(getApplicationContext(), " Up vote is successful: "+selectedAnimal,   Toast.LENGTH_LONG).show();
    }

    //onClick toast for up vote image button
    public void onItemClickBtnDownVote(View view)
    {
        String selectedAnimal=animalsNameList.get(position);
        Toast.makeText(getApplicationContext(), " User has down voted successfully: "+selectedAnimal,   Toast.LENGTH_LONG).show();
    }


    void getAnimalNames()
    {




        animalsNameList.add("Department : ");
        animalsNameList.add("Program Number: ");
        animalsNameList.add("Program:   ");
        animalsNameList.add("Budget Phase :    ");
        animalsNameList.add("Economic Class:    ");
        animalsNameList.add("Government:     ");
        animalsNameList.add("Value:     ");

    }



}

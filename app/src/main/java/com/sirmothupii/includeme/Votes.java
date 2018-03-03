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
    private static int countZonke;


    //Arrays for mocks
    private String mockDept[] = {"Education", "Health",  "Social Development", "Office of the Premier", "Provincial Legislature"};
    private String mockProgNum[] = {"1", "1", "1", "1", "1"};
    private String mockProgram[] = {"Administration", "Administration", "Administration", "Administration", "Administration"};
    private String mockBudgetPhase  = "Outcome Current Payments";
    private String mockEconomicClass[] = {"Goods and services", "Compensation of employees", "Compensation of employees", "Compensation of employees", "Compensation of employees" };
    private String mockGovernment = "Eastern Cape";
    private String mockValue[] = {"R895 0244 000", "R145 233 000", "R51 271 000", "R33 319 000", "R26 500 000" };


    private boolean voteStat[] = new boolean[10];

    ArrayList<String> animalsNameList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        countZonke = 0;


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
        //String selectedAnimal=animalsNameList.get(position);
        Toast.makeText(getApplicationContext(), " You Have Up voted!: " ,Toast.LENGTH_LONG).show();
    }

    //onClick toast for up vote image button
    public void onItemClickBtnDownVote(View view)
    {
        //String selectedAnimal=animalsNameList.get(position);
        Toast.makeText(getApplicationContext(), " You have down voted!: ",   Toast.LENGTH_LONG).show();
    }

    void getAnimalNames()
    {
        animalsNameList.add("Department : " + mockDept[countZonke] );
        animalsNameList.add("Program Number: " + mockProgNum[countZonke]);
        animalsNameList.add("Program:   " + mockProgram[countZonke]);
        animalsNameList.add("Budget Phase :    " + mockBudgetPhase);
        animalsNameList.add("Economic Class:    " + mockEconomicClass[countZonke]);
        animalsNameList.add("Government:     " + mockGovernment);
        animalsNameList.add("Value:     " + mockValue[countZonke]);
    }



    public void onClickNextButton(View view){
        if (countZonke >= 1){
            countZonke += 1;
        }

    }

    public void onClickPrevButton(View view){
        if (countZonke >= 1){
            countZonke -= 1;
        }
    }
}

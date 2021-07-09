package com.example.langu.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.langu.Adapters.NumbersArrayAdapter;
import com.example.langu.Models.NumbersModel;
import com.example.langu.R;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        //Creating a Family List
        ArrayList<NumbersModel> familyList=new ArrayList<>();

        NumbersModel word1=new NumbersModel("father","epa",R.drawable.family_father);
        NumbersModel word2=new NumbersModel("mother","eta",R.drawable.family_mother);
        NumbersModel word3=new NumbersModel("son","angsi",R.drawable.family_son);
        NumbersModel word4=new NumbersModel("daughter","tune",R.drawable.family_daughter);
        NumbersModel word5=new NumbersModel("old brother","taachi",R.drawable.family_older_brother);
        NumbersModel word6=new NumbersModel("younger brother","chalitti",R.drawable.family_younger_brother);
        NumbersModel word7=new NumbersModel("older sister","tete",R.drawable.family_older_sister);
        NumbersModel word8=new NumbersModel("younger sister","kolliti",R.drawable.family_younger_sister);
        NumbersModel word9=new NumbersModel("grandmother","ama",R.drawable.family_grandmother);
        NumbersModel word10=new NumbersModel("grandfather","paapa",R.drawable.family_grandfather);


        familyList.add(word1);
        familyList.add(word2);
        familyList.add(word3);
        familyList.add(word4);
        familyList.add(word5);
        familyList.add(word6);
        familyList.add(word7);
        familyList.add(word8);
        familyList.add(word9);
        familyList.add(word10);

        RecyclerView recyclerView=findViewById(R.id.recyclerView); //refering the recycler view

        LinearLayoutManager layoutManager=new LinearLayoutManager(this); //Linear OR hrizontal recycler view
        recyclerView.setLayoutManager(layoutManager);

        NumbersArrayAdapter arrayAdapter=new NumbersArrayAdapter(familyList);
        //recycler view sends the index to the arrayadapter
        //Arrayadapter converts the data ie familyList into views and gives it to the recycler view
        recyclerView.setAdapter(arrayAdapter);




    }
}
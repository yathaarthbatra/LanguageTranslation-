package com.example.langu.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.langu.Adapters.NumbersArrayAdapter;
import com.example.langu.Models.NumbersModel;
import com.example.langu.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<NumbersModel> phrasesList=new ArrayList<>();

        NumbersModel word1=new NumbersModel("Where are you going?","minto wuksus",0);
        NumbersModel word2=new NumbersModel("Where is your name?","tinna oyasse",0);
        NumbersModel word3=new NumbersModel("My name is..?","ayaaset",0);
        NumbersModel word4=new NumbersModel("How are you feeling?","michakas",0);
        NumbersModel word5=new NumbersModel("I am feeling good","kuchi achit",0);
        NumbersModel word6=new NumbersModel("Are you coming?","anessa",0);
        NumbersModel word7=new NumbersModel("Yes i am coming","ha eenam",0);
        NumbersModel word8=new NumbersModel("I am coming","aenum",0);
        NumbersModel word9=new NumbersModel("Lets go","yoowutis",0);
        NumbersModel word10=new NumbersModel("Come here","anninem",0);


        phrasesList.add(word1);
        phrasesList.add(word2);
        phrasesList.add(word3);
        phrasesList.add(word4);
        phrasesList.add(word5);
        phrasesList.add(word6);
        phrasesList.add(word7);
        phrasesList.add(word8);
        phrasesList.add(word9);
        phrasesList.add(word10);



        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this); //style of the recycler view
        recyclerView.setLayoutManager(layoutManager);

        NumbersArrayAdapter arrayAdapter=new NumbersArrayAdapter(phrasesList); //setting the adapter
        recyclerView.setAdapter(arrayAdapter);



    }
}
 package com.example.langu.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.langu.Adapters.NumbersArrayAdapter;
import com.example.langu.Models.NumbersModel;
import com.example.langu.R;

import java.util.ArrayList;

 public class NumbersActivity extends AppCompatActivity {

     NumbersModel word1=new NumbersModel("one","ek",R.drawable.number_one);
     NumbersModel word2=new NumbersModel("two","do",R.drawable.number_two);
     NumbersModel word3=new NumbersModel("three","tin",R.drawable.number_three);
     NumbersModel word4=new NumbersModel("four","char",R.drawable.number_four);
     NumbersModel word5=new NumbersModel("five","panch",R.drawable.number_five);
     NumbersModel word6=new NumbersModel("six","che",R.drawable.number_six);
     NumbersModel word7=new NumbersModel("seven","saat",R.drawable.number_seven);
     NumbersModel word8=new NumbersModel("eight","ath",R.drawable.number_eight);
     NumbersModel word9=new NumbersModel("nine","no",R.drawable.number_nine);
     NumbersModel word10=new NumbersModel("ten","das",R.drawable.number_ten);

     ArrayList<NumbersModel> words=new ArrayList<NumbersModel>();


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


         words.add(word1);
         words.add(word2);
         words.add(word3);
         words.add(word4);
         words.add(word5);
         words.add(word6);
         words.add(word7);
         words.add(word8);
         words.add(word9);
         words.add(word10);


        //refering the recycler View
         RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

         LinearLayoutManager layoutManager=new LinearLayoutManager(this);
         recyclerView.setLayoutManager(layoutManager);

         NumbersArrayAdapter arrayAdapter=new NumbersArrayAdapter(words);

         recyclerView.setAdapter(arrayAdapter);



     }
}
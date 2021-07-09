package com.example.langu.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.langu.R;

public class MainActivity extends AppCompatActivity {

    private TextView numbersTextView;
    private TextView familyTextView;
    private TextView colorsTextView;
    private TextView phrasesTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referring the objects of the Views to the ViewObjects
        numbersTextView=(TextView) findViewById(R.id.numbersCategory);
        familyTextView=(TextView) findViewById(R.id.familyMembersCategory);
        colorsTextView=(TextView) findViewById(R.id.colorsCategory);
        phrasesTextView=(TextView) findViewById(R.id.phrasesCategory);


        //setting the onClick Listeners
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });

        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intent);

            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);

            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);

            }
        });





    }




}
package com.example.langu.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.langu.Models.NumbersModel;
import com.example.langu.R;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);



        //colors data
        ArrayList<NumbersModel> colorsList=new ArrayList<>();
        //creating NumbdersModel objects
        NumbersModel color1=new NumbersModel("red","wetetti",R.drawable.color_red);
        NumbersModel color2=new NumbersModel("green","wetetti",R.drawable.color_green);
        NumbersModel color3=new NumbersModel("brwon","wetetti",R.drawable.color_brown);
        NumbersModel color4=new NumbersModel("gray","wetetti",R.drawable.color_gray);
        NumbersModel color5=new NumbersModel("black","wetetti",R.drawable.color_black);
        NumbersModel color6=new NumbersModel("white","wetetti",R.drawable.color_white);
        NumbersModel color7=new NumbersModel("dusty yellow","wetetti",R.drawable.color_dusty_yellow);
        NumbersModel color8=new NumbersModel("mustard yelloew","wetetti",R.drawable.color_mustard_yellow);


        //refering the recyclerView
        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        //setting the style of the Recycler View
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        //setting the adapter
        

    }
}
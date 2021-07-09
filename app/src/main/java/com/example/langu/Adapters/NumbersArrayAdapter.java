package com.example.langu.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.langu.Models.NumbersModel;
import com.example.langu.R;

import java.util.ArrayList;

public class NumbersArrayAdapter extends RecyclerView.Adapter<NumbersArrayAdapter.ViewHolder> {


    private ArrayList<NumbersModel> list;

    public NumbersArrayAdapter(ArrayList<NumbersModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //in this we inflate the singleList Item View

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View singleListItemView=inflater.inflate(R.layout.numbers_single_list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(singleListItemView);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //in this we fetch and set the values to views which we referred in the vIewHolder Class
        //holder contains the referred views which we referred in ViewHolder constructor
        NumbersModel obj=list.get(position);
        String hindi=obj.getHindiWord();
        String english=obj.getEnglishWord();
        int imageResource=obj.getImage(); //abstraction applies here
        holder.englishWord.setText(english);
        holder.hindiWord.setText(hindi);
        if(obj.getImage()==0){
            //it means that image is  not associated and we have to invisible the imageView
            //which we have already referred and put inside the holder
            //We have different options for the Visibility of thw View
            //View.setVisibility(View.VISIBLE);
            //View.INVISIBLE ==> View is invisible
            //View.VISIBLE ==> Default mode
            //View.GONE ==> View is removed
            holder.imageView.setVisibility(View.GONE);
        }
        else {
            holder.imageView.setImageResource(imageResource);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView englishWord;
        TextView hindiWord;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            //itemView refers to the singleList Item View which has been inflated in OnCreateViewHolder Function
            super(itemView);
            //reffering the Views in the itemView
            englishWord=(TextView)itemView.findViewById(R.id.englishWordSingleItem);
            hindiWord=(TextView)itemView.findViewById(R.id.hindiWordSingleItem);
            imageView=(ImageView)itemView.findViewById(R.id.imageSingleListItem);

        }
    }
}

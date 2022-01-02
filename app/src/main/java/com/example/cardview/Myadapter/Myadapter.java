package com.example.cardview.Myadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.CustomClass.News;
import com.example.cardview.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {

    Context context;

    ArrayList<News>NewsarrayList;

    public Myadapter(Context context, ArrayList<News> arrayList) {
        this.context = context;
        this.NewsarrayList = arrayList;
    }

    @NonNull
    @Override
    public Myadapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        News news = NewsarrayList.get(position);

        holder.textViewOne.setText(news.heading);
        holder.textViewTwo.setText(news.details);
        holder.shapeableImageView.setImageResource(news.titleImage);

    }

    @Override
    public int getItemCount() {
        return NewsarrayList.size();
    }

    public static  class Myviewholder extends  RecyclerView.ViewHolder{

        TextView textViewOne,textViewTwo ;
        ShapeableImageView shapeableImageView;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);


            textViewOne = itemView.findViewById(R.id.tvheading);

            textViewTwo = itemView.findViewById(R.id.tvheading2);

            shapeableImageView = itemView.findViewById(R.id.TitleImage);

        }


    }



}

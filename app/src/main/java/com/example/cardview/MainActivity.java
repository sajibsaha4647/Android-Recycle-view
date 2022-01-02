package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.CustomClass.News;
import com.example.cardview.Myadapter.Myadapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView ;
    public ArrayList<News> newsArrayList ;
    public Myadapter myadapter ;
    public String [] newsHeading;
    public int [] imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.newRecycleview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        newsArrayList = new ArrayList<News>();

        myadapter = new Myadapter(this,newsArrayList);

        recyclerView.setAdapter(myadapter);

        newsHeading = new String[]{
                "Black dashed rectangle: Represents the whole canvas.",
                "Red dashed rectangle: Marks the bounds of the blue shape.",
                "It has the same width and height as the canvas,",
                "except that you subtract the avatar radius from its height.",
                "Blue shape: A rectangle with a half circle, an arc of a circle,",
                "as a negative space at the bottom center.",
                "This arc should have a radius equal to the radius of the avatar.",
        };


        imageResourceId = new int[]{
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
                R.drawable.maxresdefault,
        };


    }
}
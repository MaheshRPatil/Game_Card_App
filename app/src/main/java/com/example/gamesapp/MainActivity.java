package com.example.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1. Data
    ArrayList<GameModel> gamesList;
    //2.Adapter View
    RecyclerView recyclerView;
    //3. Adapter
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        gamesList=new ArrayList<>();
        gamesList.add(new GameModel("Car Game",R.drawable.car));
        gamesList.add(new GameModel("PUBG Game",R.drawable.pubg));
        gamesList.add(new GameModel("Tack Flight Game",R.drawable.tank));
        gamesList.add(new GameModel("Cricket Game",R.drawable.cricket));
        gamesList.add(new GameModel("GTA Game",R.drawable.vc));
        gamesList.add(new GameModel("Super Mario Game",R.drawable.super_mario));

        adapter=new MyAdapter(this,gamesList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
package com.example.bitmlabtest01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView movierecyclerView;
    private MovieAdapter adapter;
    private List<Movie>movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initRecyclerView();
        getMovieItem();
    }

    private void getMovieItem() {
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
        movieList.add(new Movie("Avengers EndGame","Robert Gilshanh",R.drawable.war));
        movieList.add(new Movie(" Aladdin","Kamrujjaman joy",R.drawable.aladdin));
        movieList.add(new Movie("Spider Man home Comming","Adam Smith John",R.drawable.spider));
    }

    private void initRecyclerView() {
        movierecyclerView = findViewById(R.id.movierecyclerView);
        movierecyclerView.setLayoutManager(new LinearLayoutManager(this));
        movierecyclerView.setAdapter(adapter);

    }

    private void init() {
        movieList = new ArrayList<>();

        adapter = new MovieAdapter(movieList,this);

    }
}

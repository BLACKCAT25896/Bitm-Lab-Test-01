package com.example.bitmlabtest01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView mmName, mdirector;
    private ImageView mposter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mmName = findViewById(R.id.name);
        mdirector = findViewById(R.id.directorName);
        mposter = findViewById(R.id.poster);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String director = intent.getStringExtra("director");



        mmName.setText(name);
        mdirector.setText(director);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            int resId = bundle.getInt("poster");
            mposter.setImageResource(resId);
        }













    }
}

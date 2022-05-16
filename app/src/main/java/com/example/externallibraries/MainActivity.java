package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Everest_kalapatthar_crop.jpg/256px-Everest_kalapatthar_crop.jpg").into(imageView);
    }
}

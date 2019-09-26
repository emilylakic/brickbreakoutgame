package com.example.myapplication.brickbreakoutgame;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SnakeEngine snakeEngine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

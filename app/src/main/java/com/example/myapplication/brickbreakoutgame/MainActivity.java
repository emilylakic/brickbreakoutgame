package com.example.myapplication.brickbreakoutgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView NewText = (TextView)findViewById(R.id.dis);
        //NewText.setText(score);
    }
}
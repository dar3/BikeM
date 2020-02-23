package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonDelay;
    private Button buttonSchedule;
    private Button buttonPositions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDelay = (Button) findViewById(R.id.buttonDelay);
        buttonDelay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDelays();
            }
        });

        buttonSchedule = (Button) findViewById(R.id.buttonSchedule);
        buttonSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySchedule();
            }
        });

        buttonPositions = (Button) findViewById(R.id.buttonPositions);
        buttonPositions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPositions();
            }
        });
    }

    public void openActivityDelays() {
        Intent intent = new Intent(this, Delays.class);
        startActivity(intent);
    }

    public void openActivitySchedule() {
        Intent intent = new Intent(this, Timetable.class);
        startActivity(intent);
    }
    public void openActivityPositions(){
        Intent intent = new Intent (this, BusPositions.class);
        startActivity(intent);
    }
}
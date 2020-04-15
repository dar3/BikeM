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
    private Button buttonBikes;
    private Button buttonConditioning;
    private Button buttonNumbers;
    private Button buttonTickets;
    private Button buttonLow;

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

        buttonBikes = (Button) findViewById(R.id.buttonBikes);
        buttonBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBikes();
            }
        });

        buttonConditioning = (Button) findViewById(R.id.buttonConditioning);
        buttonConditioning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityConditioning();
            }
        });

        buttonNumbers = (Button) findViewById(R.id.buttonNumbers);
        buttonNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNumbers();
            }
        });

        buttonTickets = (Button) findViewById(R.id.buttonTickets);
        buttonTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTickets();
            }
        });

        buttonLow = (Button) findViewById(R.id.buttonLow);
        buttonLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLow();
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
        Intent intent = new Intent (this, Map.class);
        startActivity(intent);
    }
    public void openActivityBikes(){
        Intent intent = new Intent (this, BikesInStation.class);
        startActivity(intent);
    }
    public void openActivityConditioning(){
        Intent intent = new Intent (this, AirConditioning.class);
        startActivity(intent);
    }
    public void openActivityNumbers(){
        Intent intent = new Intent (this, SideNumbers.class);
        startActivity(intent);
    }
    public void openActivityTickets(){
        Intent intent = new Intent (this, Tickets.class);
        startActivity(intent);
    }
    public void openActivityLow(){
        Intent intent = new Intent (this, LowFloor.class);
        startActivity(intent);
    }
}
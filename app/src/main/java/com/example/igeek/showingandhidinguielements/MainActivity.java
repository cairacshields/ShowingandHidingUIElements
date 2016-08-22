package com.example.igeek.showingandhidinguielements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    //Below is a very simple application that uses the VIEW class to show and hide UI elements
    //Before I started the project I googled a simple image that I wold use as the element to show/hide

    Button show, hide;
    ImageView baby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show =( Button)findViewById(R.id.show);
        hide = (Button)findViewById(R.id.hide);
        baby =(ImageView)findViewById(R.id.baby);

        baby.setVisibility(View.INVISIBLE);
    }

    //These are te simple custom methods that we will call whenever a particular button is clicked
    //Be sure to set the onClick methods in the XML file appropriately
    public void showUI(View view){
        baby.setVisibility(View.VISIBLE);
    }

    public void hideUI(View view){
        baby.setVisibility(View.INVISIBLE);
    }
}

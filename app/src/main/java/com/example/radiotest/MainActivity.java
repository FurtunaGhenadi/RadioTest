package com.example.radiotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton1, toggleButton2;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListinerOnButtonClick();
    }
    public void addListinerOnButtonClick(){
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        buttonSubmit = (Button) findViewById(R.id.button);
        buttonSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                StringBuilder result = new StringBuilder();
                result.append(" 1: ").append(toggleButton1.getText());
                result.append(" \n2: ").append(toggleButton2.getText());
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
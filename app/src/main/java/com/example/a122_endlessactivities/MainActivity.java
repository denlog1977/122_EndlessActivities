package com.example.a122_endlessactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewImageName = (TextView) findViewById(R.id.textViewImageName);
        final String imageName = "";

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewImageName.setText("Имя картинки " + imageName);
            }
        });

        Button buttonForward = (Button) findViewById(R.id.buttonForward);
        buttonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewImageName.setText("Имя картинки " + imageName);
            }
        });

    }

}

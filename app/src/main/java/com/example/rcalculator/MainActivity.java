package com.example.rcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a,b,c;
    Button add,sub,multy,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.enterFirstno);
        b = findViewById(R.id.enterSecondno);
        c = findViewById(R.id.result);
        add = findViewById(R.id.addButton);
        sub = findViewById(R.id.subButton);
        multy = findViewById(R.id.multiButton);
        div = findViewById(R.id.divButton);
        clear = findViewById(R.id.clearButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double firstno = Double.parseDouble(a.getText().toString());
                double secondno = Double.parseDouble(b.getText().toString());
                double add = firstno + secondno;
                c.setText(Double.toString(add));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstno = Double.parseDouble(a.getText().toString());
                double secondno = Double.parseDouble(b.getText().toString());
                double sub = firstno - secondno;
                c.setText(Double.toString(sub));
            }
        });
        multy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstno = Double.parseDouble(a.getText().toString());
                double secondno = Double.parseDouble(b.getText().toString());
                double multy = firstno * secondno;
                c.setText(Double.toString(multy));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstno = Double.parseDouble(a.getText().toString());
                double secondno = Double.parseDouble(b.getText().toString());
                double div = firstno / secondno;
                c.setText(Double.toString(div));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.getText().clear();
                b.getText().clear();
                c.getText().clear();
            }
        });
    }
}
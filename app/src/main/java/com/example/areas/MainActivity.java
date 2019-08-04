package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void procesar (View vista) {
        EditText p1 = (EditText) findViewById(R.id.editText1);
        EditText p2 = (EditText) findViewById(R.id.editText2);
        EditText p3 = (EditText) findViewById(R.id.editText3);

        int base = Integer.parseInt(p1.getText().toString());
        int altura = Integer.parseInt(p2.getText().toString());

        int area = base * altura;

        p3.setText(area + "");

    }
}

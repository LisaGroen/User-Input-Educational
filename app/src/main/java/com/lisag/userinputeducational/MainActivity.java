package com.lisag.userinputeducational;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton goed1, goed2, goed3, goed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goed1 = (RadioButton) findViewById(R.id.goed1);
        goed2 = (RadioButton) findViewById(R.id.goed2);
        goed3 = (RadioButton) findViewById(R.id.goed3);
        goed4 = (RadioButton) findViewById(R.id.goed4);
    }

    public void checkVraag1(View view) {
        if (goed1.isChecked()) {
            Toast.makeText(getApplicationContext(), "Goed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Fout", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkVraag2(View view) {
        if (goed2.isChecked()) {
            Toast.makeText(getApplicationContext(), "Goed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Fout", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkVraag3(View view) {
        if (goed3.isChecked()) {
            Toast.makeText(getApplicationContext(), "Goed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Fout", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkVraag4(View view) {
        if (goed4.isChecked()) {
            Toast.makeText(getApplicationContext(), "Goed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Fout", Toast.LENGTH_SHORT).show();
        }
    }
}

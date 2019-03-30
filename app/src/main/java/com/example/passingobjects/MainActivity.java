package com.example.passingobjects;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText sid;
    EditText sname;
    EditText n1;
    EditText n2;
    EditText n3;
    EditText n4;
    EditText n5;
    RadioButton gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
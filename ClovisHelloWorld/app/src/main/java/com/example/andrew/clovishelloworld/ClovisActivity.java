package com.example.andrew.clovishelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ClovisActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    EditText bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clovis);
        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        bmi = (EditText)findViewById(R.id.bmi);
    }
    public void calculateOnClick(View v)
    {
        int numWeight = Integer.parseInt(weight.getText().toString());
        int numHeight = Integer.parseInt(height.getText().toString());
        bmi.setText(numWeight/(numHeight*numHeight));
    }

    public void clearOnClick(View v)
    {
        bmi.setText("");
        height.setText("");
        weight.setText("");
    }

}

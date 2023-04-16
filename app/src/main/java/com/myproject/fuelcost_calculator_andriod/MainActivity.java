package com.myproject.fuelcost_calculator_andriod;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //declare the EditText and TextView widgets that are defined in the XML layout file.
    EditText distanceInput, efficiencyInput, fuelcostInput;
    TextView resultOutput, resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanceInput=findViewById(R.id.editTextNumberDecimal);
        efficiencyInput=findViewById(R.id.editTextNumberDecimal2);
        fuelcostInput=findViewById(R.id.editTextNumberDecimal3);
    }


}
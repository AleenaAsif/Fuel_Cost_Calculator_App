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
        resultOutput=findViewById(R.id.editTextNumberDecimal4);
        resultText=findViewById(R.id.textView4);
    }

    public void calculateFuelCost(View view){

        //View parameter represents the button view that was clicked.

        //input from get text comes as char, we convert it to string to parse it to Double

        double distance = Double.parseDouble(distanceInput.getText().toString());
        double efficiency=Double.parseDouble(efficiencyInput.getText().toString());
        double fuelCost = Double.parseDouble(fuelcostInput.getText().toString());

        //formula for calculating fuel cost

        double totalCost = (distance / efficiency) * fuelCost;

        //format fuelCost value as a string with two decimal places using the String.format() method.
        // The "%.2f" tells the method to format the double value with two decimal places.

        String result=  String.format("%.2f", totalCost);
        resultOutput.setText(result);
        resultText.setVisibility(View.VISIBLE);
        resultOutput.setVisibility(View.VISIBLE);
    }

}
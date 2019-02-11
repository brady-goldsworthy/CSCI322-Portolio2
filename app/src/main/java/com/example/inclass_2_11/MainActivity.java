package com.example.inclass_2_11;

/*
    Brady Goldsworthy z1816747
              and
      Justin Dupre z1835941

    Portfolio 2
    2/11/19
 */


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    //Instance Variables
    ShippingItem item;

    EditText weightET;

    TextView baseTV, addedTV, totalTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect the Edittext and textviews to the objects on the screen
        weightET = findViewById(R.id.weightEditText);

        baseTV = findViewById(R.id.baseCostTextView);
        addedTV = findViewById(R.id.addedCostTextView);
        totalTV = findViewById(R.id.totalCostTextView);

        //Create shipping item
        item = new ShippingItem();

        //Put the focus on EditText
        weightET.requestFocus();

        //Add the textwatcher to ET feild
        weightET.addTextChangedListener(weightWatcher);
    }

    TextWatcher weightWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                item.setWeight(Integer.parseInt(s.toString()));
            }
            catch (NumberFormatException nfe) {
                item.setWeight(0);
            }

            DecimalFormat df = new DecimalFormat("#0.00");

            //Put the costs in the textviews
            baseTV.setText("$" + df.format(item.getBaseCost()));
            addedTV.setText("$" + df.format(item.getAddedCost()));
            totalTV.setText("$" + df.format(item.getTotalCost()));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}



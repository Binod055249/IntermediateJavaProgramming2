package com.example.intermediatejavaprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ExceptionHandling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception_handling);

        TextView txtRates=findViewById(R.id.txtRates);
        TextView txtNumberOfStars=findViewById(R.id.txtNumberOfStars);

        String oldTxtRatesValue,oldTxtNumberOfStarsValue;

        int[] peopleRates={1,4,3,5,3,2,5,1,3,4,5,2,4,5,6};

        int[] occurence=new int[6];

        for(int respond=0;respond<peopleRates.length;respond++){

            try {
                ++occurence[peopleRates[respond]];
            }catch (Exception e){
                Log.i("LOG",e.toString());
            }

        }
        for(int amount=1;amount<occurence.length;amount++){

            oldTxtRatesValue=txtRates.getText().toString();
            oldTxtNumberOfStarsValue=txtNumberOfStars.getText().toString();

            txtRates.setText(oldTxtRatesValue+amount+"\n");
            txtNumberOfStars.setText(oldTxtNumberOfStarsValue+occurence[amount]+"\n");
        }
    }
}
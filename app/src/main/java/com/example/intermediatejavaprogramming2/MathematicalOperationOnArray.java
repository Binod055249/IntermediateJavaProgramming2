package com.example.intermediatejavaprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MathematicalOperationOnArray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematical_operation_on_array);

        TextView txtTotal=findViewById(R.id.txtTotal);
        TextView txtCalculation=findViewById(R.id.txtCalculation);

        String oldText;

        int[] intArray={2, 54, 34, 76, 23, 4, 7, 86, 4, 65};

        int totalValue=0;

        for(int index=0;index<intArray.length;index++){

            oldText=txtCalculation.getText().toString();

            txtCalculation.setText(oldText+totalValue+"+"+intArray[index]+"="+(totalValue+=intArray[index])+"\n");
            txtTotal.setText(totalValue+"");

        }

    }
}
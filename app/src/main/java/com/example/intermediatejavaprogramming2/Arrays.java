package com.example.intermediatejavaprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Arrays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays);

     /*   int[] integernumbers=new int[100];

        integernumbers[0]=24;
        Log.i("LOG",integernumbers[0]+"");
        Log.i("LOG",integernumbers[1]+"");
    */
    /* String[] stringValues={"Animal","Home","Table"};
     for(int i=0;i<stringValues.length;i++) {
         Log.i("LOG", stringValues[i] + "");
     }
        Log.i("LOG", stringValues[3] + "");

     */
        TextView txtIndex= findViewById(R.id.txtIndex);
         TextView txtValue=findViewById(R.id.txtValue);
         String oldTxtIndexValue,oldTxtValuevalue;

         int[] intArray=new int[10];

         for(int counter=0;counter<intArray.length;counter++){

             intArray[counter]=counter*5+5;
             oldTxtIndexValue=txtIndex.getText().toString();
             oldTxtValuevalue=txtValue.getText().toString();

             txtIndex.setText(oldTxtIndexValue+counter+"\n");
             txtValue.setText(oldTxtValuevalue+intArray[counter]+"\n");
         }
    }

}
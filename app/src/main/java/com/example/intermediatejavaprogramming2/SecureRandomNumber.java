package com.example.intermediatejavaprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class SecureRandomNumber extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_random_number);

        final TextView txtDice1=findViewById(R.id.txtDice1);
        final TextView txtDice2=findViewById(R.id.txtDice2);
        final TextView txtDice3=findViewById(R.id.txtDice3);
        final TextView txtDice4=findViewById(R.id.txtDice4);
        final TextView txtDice5=findViewById(R.id.txtDice5);
        final TextView txtDice6=findViewById(R.id.txtDice6);

        Button btnRollTheDice=findViewById(R.id.btnRollTheDice);

        final SecureRandom secureRandomNumber=new SecureRandom();
        final int[] occurence=new int[7];
        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(int times=0;times<50000;times++){

                    int randNum=1+secureRandomNumber.nextInt(6);
                     ++occurence[randNum];
                }

                for(int faceNum=1;faceNum<occurence.length;faceNum++){

                   /* switch(faceNum){

                        case 1: txtDice1.setText(occurence[faceNum]+"");
                              break;
                        case 2:txtDice2.setText(occurence[faceNum]+"");
                         break;
                        case 3:txtDice3.setText(occurence[faceNum]+"");
                          break;
                        case 4:txtDice4.setText(occurence[faceNum]+"");
                        break;
                        case 5:txtDice5.setText(occurence[faceNum]+"");
                        break;
                        case 6:txtDice6.setText(occurence[faceNum]+"");
                    }
                    */
                   switch (faceNum) {

                       case 1:
                           putTheRightValueToTheTextView(txtDice1, occurence, faceNum);
                           break;
                       case 2:
                           putTheRightValueToTheTextView(txtDice2, occurence, faceNum);
                           break;
                       case 3:
                           putTheRightValueToTheTextView(txtDice3,occurence,faceNum);
                           break;
                       case 4:
                           putTheRightValueToTheTextView(txtDice4,occurence,faceNum);
                           break;
                       case 5:
                           putTheRightValueToTheTextView(txtDice5,occurence,faceNum);
                           break;
                       case 6:
                           putTheRightValueToTheTextView(txtDice6,occurence,faceNum);
                           break;
                   }
                }
            }
        });
    }
    private void putTheRightValueToTheTextView(TextView txtDice,int[] occurence,int index){
        txtDice.setText(occurence[index]+"");
    }
}
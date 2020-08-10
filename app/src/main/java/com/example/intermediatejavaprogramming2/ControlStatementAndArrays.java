package com.example.intermediatejavaprogramming2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ControlStatementAndArrays extends AppCompatActivity {
    int fiveStarsReview = 0;
    int fourStarsReview=0;
    int threeStarsReview=0;
    int twoStarsReview=0;
    int oneStarReview=0;

    boolean firstTime=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_statement_and_arrays);

        final TextView txtFiveStarStudent=findViewById(R.id.txtFiveStarsStudent);
        final TextView txtFourStarStudent=findViewById(R.id.txtFourStarStudent);
        final TextView txtThreeStarStudent=findViewById(R.id.txtThreeStarStudent);
        final TextView txtTwoStarStudent=findViewById(R.id.txtTwoStarStudent);
        final TextView txtOneStarStudent=findViewById(R.id.txtOneStarStudent);

        RatingBar rtbFiveStarStudent=findViewById(R.id.rtbFiveStarStudent);
        RatingBar rtbFourStarStudent=findViewById(R.id.rtbFourStarStudent);
        RatingBar rtbThreeStarStudent=findViewById(R.id.rtbThreeStarStudent);
        RatingBar rtbTwoStarStudent=findViewById(R.id.rtbTwoStarStudent);
        RatingBar rtbOneStarStudent=findViewById(R.id.rtbOneStarStudent);

        final Button bntResults=findViewById(R.id.btnResults);

       makeThisRatingBarIndicator(rtbFiveStarStudent);
       makeThisRatingBarIndicator(rtbFourStarStudent);
       makeThisRatingBarIndicator(rtbThreeStarStudent);
       makeThisRatingBarIndicator(rtbTwoStarStudent);
       makeThisRatingBarIndicator(rtbOneStarStudent);


       final int[] studentReview={5,3,4,2,4,5,1,3,2,5,5,3,2,3};

        Toast.makeText(this, "OnCreate Method is Called", Toast.LENGTH_SHORT).show();


       /* for(int index=0;index<studentReview.length;index++) {

            if (studentReview[index] == 5) {

                ++fiveStarsReview;
            }
            if (studentReview[index] == 4) {

                ++fourStarsReview;
            }
            if (studentReview[index] == 3) {

                ++threeStarsReview;
            }
            if (studentReview[index] == 2) {

                ++twoStarsReview;
            }
            if (studentReview[index] == 1) {

                ++oneStarReview;
            }

        }
*/

        bntResults.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              if(firstTime) {
                  // bntResults.setVisibility(View.INVISIBLE);

                  for (int index = 0; index < studentReview.length; index++) {

                      switch (studentReview[index]) {

                          case 5:
                              ++fiveStarsReview;
                              break;
                          case 4:
                              ++fourStarsReview;
                              break;
                          case 3:
                              ++threeStarsReview;
                              break;
                          case 2:
                              ++twoStarsReview;
                              break;
                          case 1:
                              ++oneStarReview;
                              break;
                      }
                      firstTime=false;
                  }

                  txtFiveStarStudent.setText(fiveStarsReview + "");
                  txtFourStarStudent.setText(fourStarsReview + "");
                  txtThreeStarStudent.setText(threeStarsReview+"");
                  txtTwoStarStudent.setText(twoStarsReview+"");
                  txtOneStarStudent.setText(oneStarReview+"");

              }
           }
       });
    }

    public void makeThisRatingBarIndicator(RatingBar ratingBar){
        ratingBar.setIsIndicator(true);
    }
}
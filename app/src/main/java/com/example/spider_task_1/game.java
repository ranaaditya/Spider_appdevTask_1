package com.example.spider_task_1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class game extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;

    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;
    private ObjectAnimator animator5;
    private AnimatorSet set1 = new AnimatorSet();
    private AnimatorSet set2 = new AnimatorSet();
    private AnimatorSet set3 = new AnimatorSet();
    private AnimatorSet set4 = new AnimatorSet();
    private AnimatorSet set5 = new AnimatorSet();
    private int count = 0;
    private Random random;
    ArrayList<Integer> list=new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.stone1);
        img2 = findViewById(R.id.stone2);
        img3 = findViewById(R.id.stone3);
        img4 = findViewById(R.id.stone4);
        img5 = findViewById(R.id.stone5);
        img6 = findViewById(R.id.click);
        for (int j=1;j<6;j++){
            list.add(new Integer(j));
        }
        Collections.shuffle(list);


        randomsetimage(img1,list.get(0));
        randomsetimage(img2,list.get(1));
        randomsetimage(img3,list.get(2));
        randomsetimage(img4,list.get(3));
        randomsetimage(img5,list.get(4));




    }

    public void gamestart(View view) {
        if (count % 2 == 0) {
            count++;
            animator1 = ObjectAnimator.ofFloat(img1, "y", -4f);
            set1.setDuration(1000);
            set1.playTogether(animator1);
            set1.start();


            animator2 = ObjectAnimator.ofFloat(img2, "y", -4f);
            set2.setDuration(1000);
            set2.playTogether(animator2);
            set2.start();

            animator3 = ObjectAnimator.ofFloat(img3, "y", -4f);
            set3.setDuration(1000);
            set3.playTogether(animator3);
            set3.start();

            animator4 = ObjectAnimator.ofFloat(img4, "y", -4f);
            set4.setDuration(1000);
            set4.playTogether(animator4);
            set4.start();

            animator5 = ObjectAnimator.ofFloat(img5, "y", -4f);
            set5.setDuration(1000);
            set5.playTogether(animator5);
            set5.start();
        } else {
            count++;
            set1.reverse();
            set2.reverse();
            set3.reverse();
            set4.reverse();
            set5.reverse();
        }

    }

    public void  randomsetimage(ImageView view,int num){

        switch(num){
            case 1: view.setImageResource(R.drawable.soul);
                       break;
            case 2: view.setImageResource(R.drawable.space);
                       break;
            case 3: view.setImageResource(R.drawable.time);
                       break;
            case 4: view.setImageResource(R.drawable.reality);
                       break;
            case 5: view.setImageResource(R.drawable.power);
                       break;
            case 6: view.setImageResource(R.drawable.mind);
                       break;
                       default:
                           break;

        }

    }


}

package com.example.anukhaju.sample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Sample2 extends AppCompatActivity {
   Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2);
        animation= AnimationUtils.loadAnimation(Sample2.this,R.anim.abc);

    }

    public void sapient(View view) {
view.startAnimation(animation);
        Intent intent= new Intent(Sample2.this,MainActivity.class);
        startActivity(intent);
    }
}

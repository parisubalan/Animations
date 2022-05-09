package com.parisubalan.animations.java;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.parisubalan.animations.R;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private Button blinkBtn,rotateBtn,fadeBtn,moveBtn,slideBtn,zoomBtn,stopBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);
        initialization();
        clickLister();
    }

    private void initialization()
    {
        imageView = findViewById(R.id.imageView);
        blinkBtn = findViewById(R.id.blinkBtn);
        rotateBtn = findViewById(R.id.rotateBtn);
        fadeBtn = findViewById(R.id.fadeBtn);
        moveBtn = findViewById(R.id.moveBtn);
        slideBtn = findViewById(R.id.slideBtn);
        zoomBtn = findViewById(R.id.zoomBtn);
        stopBtn = findViewById(R.id.stopBtn);
    }

    private void clickLister()
    {
        blinkBtn.setOnClickListener(this);
        rotateBtn.setOnClickListener(this);
        fadeBtn.setOnClickListener(this);
        moveBtn.setOnClickListener(this);
        slideBtn.setOnClickListener(this);
        zoomBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    private void animationLoading(Context context, int animationId)
    {
        Animation animation = AnimationUtils.loadAnimation(context, animationId);
        imageView.startAnimation(animation);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.blinkBtn:
                animationLoading(this,R.anim.blink_animation);
                break;
            case R.id.rotateBtn:
                animationLoading(this,R.anim.rotate_animation);
                break;
            case R.id.fadeBtn:
                animationLoading(this,R.anim.fade_animation);
                break;
            case R.id.moveBtn:
                animationLoading(this,R.anim.move_animation);
                break;
            case R.id.slideBtn:
                animationLoading(this,R.anim.slide_animation);
                break;
            case R.id.zoomBtn:
                animationLoading(this,R.anim.zoom_in_animation);
                break;
            case R.id.stopBtn:
                imageView.clearAnimation();
                break;
        }

    }
}

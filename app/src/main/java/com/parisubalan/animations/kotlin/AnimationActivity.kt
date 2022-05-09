package com.parisubalan.animations.kotlin

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.parisubalan.animations.R
import android.view.animation.AnimationUtils


class AnimationActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imageView: ImageView
    private lateinit var blinkBtn : Button
    private lateinit var rotateBtn : Button
    private lateinit var fadeBtn : Button
    private lateinit var moveBtn : Button
    private lateinit var slideBtn : Button
    private lateinit var zoomBtn : Button
    private lateinit var stopBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_layout)
        initialization()
        clickLister()
    }

    private fun initialization()
    {
        imageView = findViewById(R.id.imageView)
        blinkBtn = findViewById(R.id.blinkBtn)
        rotateBtn = findViewById(R.id.rotateBtn)
        fadeBtn = findViewById(R.id.fadeBtn)
        moveBtn = findViewById(R.id.moveBtn)
        slideBtn = findViewById(R.id.slideBtn)
        zoomBtn = findViewById(R.id.zoomBtn)
        stopBtn = findViewById(R.id.stopBtn)
    }

    private fun clickLister()
    {
        blinkBtn.setOnClickListener(this)
        rotateBtn.setOnClickListener(this)
        fadeBtn.setOnClickListener(this)
        moveBtn.setOnClickListener(this)
        slideBtn.setOnClickListener(this)
        zoomBtn.setOnClickListener(this)
        stopBtn.setOnClickListener(this)
    }

    private fun animationLoading(context: Context, animationId : Int)
    {
        val animation: Animation = AnimationUtils.loadAnimation(context, animationId)
        imageView.startAnimation(animation)
    }

    override fun onClick(view: View?) {
        when(view!!.id)
        {
            R.id.blinkBtn-> animationLoading(this,R.anim.blink_animation)
            R.id.rotateBtn-> animationLoading(this, R.anim.rotate_animation)
            R.id.fadeBtn-> animationLoading(this, R.anim.fade_animation)
            R.id.moveBtn-> animationLoading(this, R.anim.move_animation)
            R.id.slideBtn-> animationLoading(this, R.anim.slide_animation)
            R.id.zoomBtn-> animationLoading(this, R.anim.zoom_in_animation)
            R.id.stopBtn-> imageView.clearAnimation()

        }
    }


}
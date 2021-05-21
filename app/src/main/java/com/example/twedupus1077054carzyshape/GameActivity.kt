package com.example.twedupus1077054carzyshape

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View

class GameActivity(context: Context) : View(context) {

    override fun onTouchEvent(event: MotionEvent): Boolean{
        var xPos = event.getX()
        var yPos = event.getY()
        invalidate()
        return true
    }
}

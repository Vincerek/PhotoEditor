package com.example.photoeditor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun ChangeTint(view: View) {
        val imageView = findViewById<ImageView>(R.id.imageView)
        val cAlpha = findViewById<EditText>(R.id.AlphaValue)
        val cRed = findViewById<EditText>(R.id.RedValue)
        val cGreen = findViewById<EditText>(R.id.GreenValue)
        val cBlue = findViewById<EditText>(R.id.BlueValue)

        val alphaV = cAlpha.text.toString()
        val redV = cRed.text.toString()
        val greenV = cGreen.text.toString()
        val blueV = cBlue.text.toString()
        var alpha = 0
        var red = 0
        var green = 0
        var blue = 0

        if (alphaV == ""){
            alpha = 0
        } else if(Integer.parseInt(alphaV)<0){
            alpha = 0
        } else if (Integer.parseInt(alphaV)>255){
            alpha = 255
        }else  alpha = Integer.parseInt(alphaV)

        if (redV == ""){
            red = 0
        } else if(Integer.parseInt(redV)<0){
            red = 0
        } else if (Integer.parseInt(redV)>255){
            red = 255
        }else  red = Integer.parseInt(redV)
        //Integer.parseInt(alphaV)
        //Integer.parseInt(redV)
        //Integer.parseInt(greenV)
        //Integer.parseInt(blueV)

        imageView.setColorFilter(Color.argb(alpha, red, Integer.parseInt(greenV), Integer.parseInt(blueV)));
    }
    fun flipX(view: View) {
        val flip = findViewById<ImageView>(R.id.imageView)
        flip.scaleX = flip.scaleX * -1
    }

    fun flipY(view: View) {
        val flip = findViewById<ImageView>(R.id.imageView)
        flip.scaleY = flip.scaleY * -1
    }
}
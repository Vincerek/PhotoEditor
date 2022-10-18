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
    var alpha = 0
    var red = 0
    var green = 0
    var blue = 0
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

        if (greenV == ""){
            green = 0
        } else if(Integer.parseInt(greenV)<0){
            green = 0
        } else if (Integer.parseInt(greenV)>255){
            green = 255
        }else  green = Integer.parseInt(greenV)

        if (blueV == ""){
            blue = 0
        } else if(Integer.parseInt(blueV)<0){
            blue = 0
        } else if (Integer.parseInt(blueV)>255){
            blue = 255
        }else  blue = Integer.parseInt(blueV)

        //Integer.parseInt(alphaV)
        //Integer.parseInt(redV)
        //Integer.parseInt(greenV)
        //Integer.parseInt(blueV)

        imageView.setColorFilter(Color.argb(alpha, red, green, blue));
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
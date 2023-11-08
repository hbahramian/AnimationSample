package edu.iu.habahram.animationsample

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var avdImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isChecked = true
        avdImage = findViewById<ImageView>(R.id.avdImage)
        avdImage.setOnClickListener {
            if (isChecked)
                checkToClose()
            else
                closeToCheck()

            isChecked = !isChecked
        }
    }
    private fun closeToCheck() {

        avdImage.setImageResource(R.drawable.avd_close_to_check)
        val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }

    private fun checkToClose() {

        avdImage.setImageResource(R.drawable.avd_check_to_close)
        val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }
}
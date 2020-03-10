package com.example.sharedelementtest

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        startPostponedEnterTransition()
//        postponeEnterTransition()

        imageView_small.setOnClickListener {
            window.enterTransition
            var intent = Intent(this, DetailActivity::class.java)
            var options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                imageView_small,
                getString(R.string.shared_element)
            )
            startActivity(intent, options.toBundle())
        }
    }
}

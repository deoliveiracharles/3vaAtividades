package com.example.charlesbronsondeoliveirasivla.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setTitle("")
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.drawable.ic_twitter_white)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        /*viewPager.setAdapter(HomeFragmentPageAdapter(supportFragmentManager, this@MainActivity))

        tabLayout.setupWithViewPager(viewPager)*/
    }
}

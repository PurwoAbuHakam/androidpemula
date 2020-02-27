package com.dicoding.ale.purwobeginner.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dicoding.ale.purwobeginner.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed({
            val moveActivity = Intent(this@MainActivity, MasterListActivity::class.java)
            startActivity(moveActivity)
            finish()
        }, 2000)
    }
}

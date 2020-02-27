package com.dicoding.ale.purwobeginner.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.ale.purwobeginner.R
import android.widget.Toolbar


class ProfileActivity : AppCompatActivity() {

    lateinit var ivImageProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ivImageProfile = findViewById(R.id.img_item_photo)

        Glide.with(this)
            .load(R.drawable.purwo)
            .apply(RequestOptions().override(195,195))
            .into(ivImageProfile)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About Me!"
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                Toast.makeText(this, "INI", Toast.LENGTH_LONG).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}

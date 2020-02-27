package com.dicoding.ale.purwobeginner.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.ale.purwobeginner.R

class DetailBugsActivity : AppCompatActivity() {

    companion object {
        const val bugsName = "bugs_name"
        const val bugsDetail = "bugs_detail"
        const val bugsImages = "bugs_images"
        const val bugsSpi = "bugs_spi"
    }

    private lateinit var tvBugsTitle: TextView
    private lateinit var ivPhoto: ImageView
    private lateinit var tvSpi: TextView
    private lateinit var tvBugsDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bugs)

        tvBugsTitle = findViewById(R.id.tv_bugs_title)
        ivPhoto = findViewById(R.id.iv_foto_bugs)
        tvSpi = findViewById(R.id.tv_spi)
        tvBugsDesc = findViewById(R.id.tv_bugs_desc)

        var screenWidth = 0
        var screenHeight = 0
        var metrics: DisplayMetrics = resources.displayMetrics
        screenWidth = (metrics.widthPixels * 0.85).toInt()
        screenHeight = (metrics.heightPixels * 0.85).toInt()

        window.setLayout(screenWidth, screenHeight)

        val bugsName = intent.getStringExtra(bugsName)
        val bugsSpi = intent.getStringExtra(bugsSpi)
        val bugsPhoto = intent.getIntExtra(bugsImages, 0)

        Glide.with(this)
            .load(bugsPhoto)
            .apply(RequestOptions().override(175,100))
            .into(ivPhoto)
        tvBugsTitle.text = bugsName
        tvSpi.text = "Index Pain : $bugsSpi"
        tvBugsDesc.text = intent.getStringExtra(bugsDetail)

        setFinishOnTouchOutside(false)
    }
}

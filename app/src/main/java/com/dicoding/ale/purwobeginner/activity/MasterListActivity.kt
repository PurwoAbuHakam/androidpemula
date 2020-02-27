package com.dicoding.ale.purwobeginner.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.ale.purwobeginner.R
import com.dicoding.ale.purwobeginner.adapter.ListBugsAdapter
import com.dicoding.ale.purwobeginner.model.Bugs
import com.dicoding.ale.purwobeginner.model.BugsData
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.Menu
import android.view.MenuItem
import java.io.ByteArrayOutputStream


class MasterListActivity : AppCompatActivity() {

    private lateinit var rvBugs: RecyclerView
    private val list: ArrayList<Bugs> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_list)

        rvBugs = findViewById(R.id.rv_bugs)

        list.addAll(BugsData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvBugs.layoutManager = LinearLayoutManager(this)
        val listBugsAdapter = ListBugsAdapter(list)
        rvBugs.adapter = listBugsAdapter

        listBugsAdapter.setOnItemClickCallback(object : ListBugsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Bugs) {
                showSelectedItem(data)
            }
        })
    }

    private fun showSelectedItem(data: Bugs) {
        /*val bitmap = BitmapFactory.decodeResource(resources, data.photo)
        val baos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos)
        val b = baos.toByteArray()*/

        val moveToMine = Intent(this@MasterListActivity, DetailBugsActivity::class.java)
        moveToMine.putExtra(DetailBugsActivity.bugsName, data.name)
        moveToMine.putExtra(DetailBugsActivity.bugsDetail, data.detail)
        moveToMine.putExtra(DetailBugsActivity.bugsImages, data.photo)
        moveToMine.putExtra(DetailBugsActivity.bugsSpi, data.spi)
        startActivity(moveToMine)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about_me -> {
                val moveToProfile = Intent(this@MasterListActivity, ProfileActivity::class.java)
                startActivity(moveToProfile)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

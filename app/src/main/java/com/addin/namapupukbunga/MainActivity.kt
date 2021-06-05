package com.addin.namapupukbunga

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.addin.namapupukbunga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var rvPupuk : RecyclerView
    private var list: ArrayList<ClassPupuk> = arrayListOf()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener {
            val eBody: String = resources.getString(R.string.body)
            val eSubject: String = resources.getString(R.string.subject)
            val eAddress: String = resources.getString(R.string.email2)
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:" + eAddress)
                putExtra(Intent.EXTRA_SUBJECT, eSubject)
                putExtra(Intent.EXTRA_TEXT, eBody)
            }
            startActivity(Intent.createChooser(emailIntent, R.string.title.toString()))
        }

        rvPupuk = binding.rvidListHero
        rvPupuk.setHasFixedSize(true)
        list.addAll(ObjPupuk.listData)
        showRecyclerList()


    }

    private fun showRecyclerList(){
        rvPupuk.layoutManager= LinearLayoutManager(this)
        val listPupukAdapter = ListPupukAdapter(list)
        rvPupuk.adapter= listPupukAdapter
    }

    private fun showCardViewPupuk(){
        rvPupuk.layoutManager = LinearLayoutManager(this)
        val cardPupukAdapter = CardPupukAdapter(list)
        rvPupuk.adapter = cardPupukAdapter
    }
    private fun showGridViewPupuk(){
        rvPupuk.layoutManager = GridLayoutManager(this,2)
        val gridPupukAdapter = GridPupukAdapter(list)
        rvPupuk.adapter= gridPupukAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_aboutme -> {
                val mIntent = Intent(this@MainActivity,AboutMe::class.java)
                startActivity(mIntent)
            }
            R.id.action_cardview -> {
                showCardViewPupuk()
                supportActionBar?.title = resources.getString(R.string.cardview)
            }
            R.id.action_grid -> {
                showGridViewPupuk()
                supportActionBar?.title = resources.getString(R.string.gridView)

            }
            R.id.action_list ->{
                showRecyclerList()
                supportActionBar?.title =resources.getString(R.string.app_name)
            }

        }
        return super.onOptionsItemSelected(item)
    }

}
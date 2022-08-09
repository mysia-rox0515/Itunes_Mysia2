package com.example.itunes_mysia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.itunes_mysia.model.PagerAdapters
import com.example.itunes_mysia.view.ClassicFragment
import com.example.itunes_mysia.view.PopFragment
import com.example.itunes_mysia.view.RockFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var itunesToolbar: androidx.appcompat.widget.Toolbar
    private lateinit var itunesTabs: TabLayout
    private lateinit var itunesTitleText: TextView
    private lateinit var itunesViewPager: ViewPager
    private lateinit var itunesPagerAdapters: PagerAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set find ID
            itunesToolbar = findViewById(R.id.itunesToolbar)
            itunesTitleText = findViewById(R.id.itunesTitleText)
            itunesTabs = findViewById(R.id.itunesTabs)
            itunesViewPager = findViewById(R.id.itunesViewPager)
            itunesPagerAdapters = PagerAdapters(supportFragmentManager)
        // Set Toolbar
        itunesToolbar.setTitle("")
        itunesTitleText.setText(getString(R.string.itunes))
        setSupportActionBar(findViewById(R.id.itunesToolbar))
        // Set Fragment List
        itunesPagerAdapters.addfragment(RockFragment(), "Rock")
        itunesPagerAdapters.addfragment(ClassicFragment(), "Classic")
        itunesPagerAdapters.addfragment(PopFragment(), "Pop")
        // Set View Pager Adapter
        itunesViewPager.adapter = itunesPagerAdapters
        // Set Tabs
        itunesTabs.setupWithViewPager(itunesViewPager)
        // Set Icons
        itunesTabs.getTabAt(0)!!.setIcon(R.mipmap.music1)
        itunesTabs.getTabAt(1)!!.setIcon(R.mipmap.music2)
        itunesTabs.getTabAt(2)!!.setIcon(R.mipmap.music3)
    }
}
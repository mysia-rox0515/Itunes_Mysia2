package com.example.itunes_mysia

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapters(sFM:FragmentManager): FragmentPagerAdapter(sFM, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    // set fragment lists
    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitle = ArrayList<String>()
    override fun getCount(): Int = fragmentList.size
    override fun getItem(position: Int): Fragment = fragmentList[position]
    override fun getPageTitle(position: Int): CharSequence = fragmentTitle[position]
    fun addfragment(fm:Fragment,title:String){
        fragmentList.add(fm)
        fragmentTitle.add(title)

    }

}

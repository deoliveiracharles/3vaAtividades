package com.example.charlesbronsondeoliveirasivla.layout

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


 class HomeFragmentPageAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

     val PAGE_COUNT = 3
     private val tabTitles = arrayOf("Tab1", "Tab2", "Tab3")
     private val context: Context? = null

     override fun getCount(): Int {
         return PAGE_COUNT
     }

     override fun getItem(p0: Int): Fragment {

         return HomeFragment.HomeFragment(p0 + 1)
     }

     override fun getPageTitle(position: Int): CharSequence? {
         val title: String
         if (position == 0) {
             title = "Home"
         } else if (position == 1) {
             title = "Discover"
         } else {
             title = "Activity"
         }
         return title
     }

}
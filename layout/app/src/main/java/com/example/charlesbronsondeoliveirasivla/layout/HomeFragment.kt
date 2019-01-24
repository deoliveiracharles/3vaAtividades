package com.example.charlesbronsondeoliveirasivla.layout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View


class HomeFragment : Fragment() {


    private var mPage : Int = 0

    companion object {

        var arg_page : String = "ARG_PAGE"

        fun HomeFragment(page: Int): HomeFragment {
            val args = Bundle()
            args.putInt(arg_page, page)
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPage = arguments!!.getInt(arg_page)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.home_fragment, container, false)
    }


}

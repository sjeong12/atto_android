package com.nimontoy.android.view.controller.fragment.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nimontoy.android.R
import com.nimontoy.android.view.controller.fragment.DataListFragment

class FollowerFragment : DataListFragment() {

    companion object {
        fun newInstance(): FollowerFragment {
            return FollowerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_follower, container, false)
        /*initViews(view)
        bindViews()
        initData()*/
        return view
    }

    override fun initViews(view: View) {
        super.initViews(view)
    }

    override fun bindViews() {
        super.bindViews()
    }

    override fun initData() {
        super.initData()
    }

}
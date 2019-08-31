package com.nimontoy.android.controller.fragment.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nimontoy.android.R
import com.nimontoy.android.adapter.DataRecyclerAdapter
import com.nimontoy.android.controller.fragment.DataListFragment
import com.nimontoy.android.viewmodel.feed.FeedListViewModel

class FeedFragment : DataListFragment() {

    companion object {
        fun newInstance(): FeedFragment {
            return FeedFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)

        viewModel = FeedListViewModel()

        dataRecyclerAdapter = DataRecyclerAdapter(viewModel.dataList)

        initViews(view)
        bindViews()
        initData()
        return view
    }

    override fun bindViews() {
        super.bindViews()
        // TODO 추가적인 UI 갱신이 필요할 경우 observable하게 구현할 것
    }

}
package com.github.dnaka91.beatfly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.adapter.HistoryListAdapter
import kotlinx.android.synthetic.main.history_list_fragment.*

class HistoryListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.history_list_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val layoutManager = LinearLayoutManager(requireContext())

        recyclerview.adapter = HistoryListAdapter(this)
        recyclerview.layoutManager = layoutManager
        recyclerview.addItemDecoration(DividerItemDecoration(requireContext(), layoutManager.orientation))
    }
}

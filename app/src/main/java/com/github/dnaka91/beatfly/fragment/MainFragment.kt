package com.github.dnaka91.beatfly.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.adapter.pager.MainPagerAdapter
import com.github.dnaka91.beatfly.extension.showPlayer
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.main_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pager.adapter = MainPagerAdapter(requireContext(), childFragmentManager)
    }

    override fun onResume() {
        super.onResume()
        showPlayer()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_player, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_review -> {
            findNavController().navigate(MainFragmentDirections.actionReview())
            true
        }
        R.id.action_request -> {
            findNavController().navigate(MainFragmentDirections.actionRequest())
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}

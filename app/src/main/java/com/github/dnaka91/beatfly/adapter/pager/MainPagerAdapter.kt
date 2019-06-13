package com.github.dnaka91.beatfly.adapter.pager

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.fragment.HistoryListFragment
import com.github.dnaka91.beatfly.fragment.ModeratorListFragment
import com.github.dnaka91.beatfly.fragment.SongDetailFragment

class MainPagerAdapter(ctx: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragments = listOf(
        ctx.getString(R.string.main_tab_header_song) to { SongDetailFragment() },
        ctx.getString(R.string.main_tab_header_history) to { HistoryListFragment() },
        ctx.getString(R.string.main_tab_header_moderators) to { ModeratorListFragment() }
    )

    override fun getPageTitle(position: Int) = fragments[position].first

    override fun getItem(position: Int) = fragments[position].second()

    override fun getCount() = fragments.size
}
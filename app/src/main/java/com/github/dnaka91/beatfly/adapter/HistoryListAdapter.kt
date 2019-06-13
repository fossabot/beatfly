package com.github.dnaka91.beatfly.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.thirdparty.glide.GlideApp
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.history_item.*
import org.jetbrains.anko.support.v4.dip
import kotlin.random.Random
import kotlin.random.nextInt

class HistoryListAdapter(private val fragment: Fragment) :
    RecyclerView.Adapter<HistoryListAdapter.ViewHolder>() {

    private val inflater = LayoutInflater.from(fragment.context)

    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            inflater.inflate(
                R.layout.history_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = position + 1
        holder.apply {
            title.text = fragment.getString(R.string.sample_song_title, pos)
            album.text = fragment.getString(R.string.sample_song_album, pos)
            artist.text = fragment.getString(R.string.sample_song_artist, pos)
            duration.text = fragment.getString(R.string.sample_song_duration, pos, Random.nextInt(0..60))

            GlideApp.with(fragment)
                .load(R.drawable.placeholder_album)
                .transform(RoundedCorners(fragment.dip(4)))
                .into(albumCover)
        }

    }
}
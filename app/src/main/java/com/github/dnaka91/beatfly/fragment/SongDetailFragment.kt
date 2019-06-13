package com.github.dnaka91.beatfly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.thirdparty.glide.GlideApp
import kotlinx.android.synthetic.main.song_detail_fragment.*
import org.jetbrains.anko.support.v4.dip

class SongDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.song_detail_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        title.text = getString(R.string.sample_song_detail_title)
        album.text = getString(R.string.sample_song_detail_album)
        artist.text = getString(R.string.sample_song_detail_artist)

        GlideApp.with(this)
            .load(R.drawable.placeholder_album)
            .transform(RoundedCorners(dip(8)))
            .into(albumCover)
    }
}

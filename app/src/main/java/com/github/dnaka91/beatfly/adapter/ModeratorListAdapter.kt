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
import kotlinx.android.synthetic.main.moderator_item.*
import org.jetbrains.anko.support.v4.dip
import kotlin.random.Random

class ModeratorListAdapter(private val fragment: Fragment) :
    RecyclerView.Adapter<ModeratorListAdapter.ViewHolder>() {

    private val inflater = LayoutInflater.from(fragment.context)

    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            inflater.inflate(
                R.layout.moderator_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = 3
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = position + 1
        holder.apply {
            title.text = fragment.getString(R.string.sample_mod_name, pos)
            rating.text = fragment.getString(
                R.string.sample_mod_rating,
                Random.nextDouble(5.0),
                Random.nextInt(10000)
            )

            GlideApp.with(fragment)
                .load(R.drawable.placeholder_moderator)
                .transform(RoundedCorners(fragment.dip(4)))
                .into(albumCover)
        }

    }
}
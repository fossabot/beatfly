package com.github.dnaka91.beatfly.adapter

import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.github.dnaka91.beatfly.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.license_item.*

class LicenseListAdapter(private val fragment: Fragment) :
    RecyclerView.Adapter<LicenseListAdapter.ViewHolder>() {

    private val inflater = LayoutInflater.from(fragment.context)

    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            inflater.inflate(
                R.layout.license_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = position + 1
        holder.apply {
            name.text = Html.fromHtml(
                fragment.getString(
                    R.string.sample_license_name,
                    "https://google.com", pos
                ),
                Html.FROM_HTML_MODE_COMPACT
            )
            song.text = Html.fromHtml(
                fragment.getString(
                    R.string.sample_license_song,
                    "https://google.com", pos,
                    "http://freemusicarchive.org", "Free Music Archive"
                ),
                Html.FROM_HTML_MODE_COMPACT
            )
            cover.text = Html.fromHtml(
                fragment.getString(
                    R.string.sample_license_cover,
                    "https://google.com", pos,
                    "https://unsplash.com", "Unsplash"
                ),
                Html.FROM_HTML_MODE_COMPACT
            )

            listOf(name, song, cover).forEach {
                it.movementMethod =
                    LinkMovementMethod.getInstance()
            }
        }
    }
}
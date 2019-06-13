package com.github.dnaka91.beatfly.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.github.dnaka91.beatfly.NavGraphDirections
import com.github.dnaka91.beatfly.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var playing = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        toolbar.overflowIcon = getDrawable(R.drawable.ic_more_vert_24)

        fab.setImageResource(R.drawable.ic_play_arrow_24)
        fab.setOnClickListener {
            playing = !playing
            fab.setImageResource(
                if (playing) R.drawable.ic_pause_24
                else R.drawable.ic_play_arrow_24
            )
        }

        //val player = ExoPlayerFactory.newSimpleInstance(this)
        //playerView.player = player
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.actionAbout())
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}

package com.github.dnaka91.beatfly.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.github.dnaka91.beatfly.R
import kotlinx.android.synthetic.main.activity_actionbar.*

class ActionBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actionbar)
        setSupportActionBar(toolbar)

        toolbar.setupWithNavController(findNavController(R.id.nav_host_fragment))
    }
}

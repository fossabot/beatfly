package com.github.dnaka91.beatfly.extension

import android.app.Activity
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

fun Activity.showPlayer() {
    fab?.doOnPreDraw {
        fab?.show()
        toolbar?.performShow()
    }
}

fun Activity.hidePlayer() {
    fab?.doOnPreDraw {
        fab?.hide()
        toolbar?.performHide()
    }
}

fun Fragment.showPlayer() = activity?.showPlayer()

fun Fragment.hidePlayer() = activity?.hidePlayer()

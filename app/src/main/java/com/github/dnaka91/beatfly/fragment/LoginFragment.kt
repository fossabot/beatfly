package com.github.dnaka91.beatfly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.dnaka91.beatfly.R
import com.github.dnaka91.beatfly.extension.hidePlayer
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.login_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        login.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLogin())
        }
    }

    override fun onResume() {
        super.onResume()
        hidePlayer()
    }
}

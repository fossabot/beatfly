package com.github.dnaka91.beatfly.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.dnaka91.beatfly.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.review_fragment.*

class ReviewFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.review_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        submit.setOnClickListener {
            dismiss()
        }
    }


}
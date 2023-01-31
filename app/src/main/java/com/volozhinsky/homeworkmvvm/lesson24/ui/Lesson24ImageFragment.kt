package com.volozhinsky.homeworkmvvm.lesson24.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.volozhinsky.homeworkmvvm.R

class Lesson24ImageFragment : Fragment() {

    private val vm by viewModels<ImageFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lesson24_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.liveData.observe(viewLifecycleOwner){
            val ivMainLesson24 =  view.findViewById<ImageView>(R.id.ivMainLesson24)
            Glide.with(this.requireContext()).load(it.link).into(ivMainLesson24)
        }
    }

    companion object {

        fun newInstance() = Lesson24ImageFragment()
    }
}
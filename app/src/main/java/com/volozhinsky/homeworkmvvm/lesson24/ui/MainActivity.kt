package com.volozhinsky.homeworkmvvm.lesson24.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.volozhinsky.homeworkmvvm.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lesson24ImageFragment =Lesson24ImageFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.flLesson24,lesson24ImageFragment).commit()
    }
}
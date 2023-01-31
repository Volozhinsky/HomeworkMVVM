package com.volozhinsky.homeworkmvvm.lesson24.domain

import com.volozhinsky.homeworkmvvm.lesson24.domain.models.ImageInfoUiData

interface Lesson24Repository {

    fun getImageInfo(): ImageInfoUiData
}
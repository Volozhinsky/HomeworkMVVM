package com.volozhinsky.homeworkmvvm.lesson24.data

import com.volozhinsky.homeworkmvvm.lesson24.data.models.ImageInfoResponse
import javax.inject.Inject

class Server @Inject constructor() {
    fun getImageInfo() =
        ImageInfoResponse("https://cdn.pixabay.com/photo/2013/08/21/13/44/sailboat-174469_960_720.jpg")
}
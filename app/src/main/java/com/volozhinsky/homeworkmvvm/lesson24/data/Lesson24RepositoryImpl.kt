package com.volozhinsky.homeworkmvvm.lesson24.data

import com.volozhinsky.homeworkmvvm.lesson24.data.mappers.ImageInfoMapper
import com.volozhinsky.homeworkmvvm.lesson24.domain.models.ImageInfoUiData
import com.volozhinsky.homeworkmvvm.lesson24.domain.Lesson24Repository
import javax.inject.Inject

class Lesson24RepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapper: ImageInfoMapper
) : Lesson24Repository {

    override fun getImageInfo(): ImageInfoUiData {
        val imageInfo = server.getImageInfo()
        return mapper(imageInfo)
    }
}
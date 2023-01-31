package com.volozhinsky.homeworkmvvm.lesson24.data.mappers

import com.volozhinsky.homeworkmvvm.lesson24.data.models.ImageInfoResponse
import com.volozhinsky.homeworkmvvm.lesson24.domain.models.ImageInfoUiData
import javax.inject.Inject

class ImageInfoMapper @Inject constructor() {

    operator fun invoke(response: ImageInfoResponse): ImageInfoUiData =
        with(response) {
            ImageInfoUiData(
                link = link.orEmpty()
            )
        }
}
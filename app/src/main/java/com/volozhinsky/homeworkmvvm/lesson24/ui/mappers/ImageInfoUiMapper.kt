package com.volozhinsky.homeworkmvvm.lesson24.ui.mappers

import com.volozhinsky.homeworkmvvm.lesson24.domain.models.ImageInfoUiData
import com.volozhinsky.homeworkmvvm.lesson24.ui.models.ImageInfoUI
import javax.inject.Inject

class ImageInfoUiMapper @Inject constructor() {

    operator fun invoke(imageInfoUiData: ImageInfoUiData): ImageInfoUI =
        with(imageInfoUiData) {
            ImageInfoUI(
                link = link
            )
        }
}
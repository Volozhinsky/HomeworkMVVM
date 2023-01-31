package com.volozhinsky.homeworkmvvm.lesson24.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.volozhinsky.homeworkmvvm.lesson24.domain.Lesson24Repository
import com.volozhinsky.homeworkmvvm.lesson24.ui.mappers.ImageInfoUiMapper
import com.volozhinsky.homeworkmvvm.lesson24.ui.models.ImageInfoUI
import javax.inject.Inject

class ImageFragmentViewModel @Inject constructor(
    private val repository: Lesson24Repository,
    private val uiMapper: ImageInfoUiMapper
): ViewModel() {

    private val _liveData = MutableLiveData<ImageInfoUI>()
    val liveData: LiveData<ImageInfoUI> get() = _liveData

    fun getImageInfo(){
        val imageInfoUI = repository.getImageInfo()
        _liveData.value = uiMapper(imageInfoUI)
    }
}
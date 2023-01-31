package com.volozhinsky.homeworkmvvm.lesson24.di

import com.volozhinsky.homeworkmvvm.lesson24.data.Lesson24RepositoryImpl
import com.volozhinsky.homeworkmvvm.lesson24.domain.Lesson24Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: Lesson24RepositoryImpl):Lesson24Repository
}
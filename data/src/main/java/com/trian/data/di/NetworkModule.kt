package com.trian.data.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class, ActivityComponent::class)
object NetworkModule {
    @Provides
    fun provideGson():Gson = Gson()
}
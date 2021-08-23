package com.trian.data.di

import com.trian.data.remote.ktorHttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    /**
     * prviding http client
     */

    @Provides
    @Singleton
    internal fun provideHttpClient():HttpClient{
        return ktorHttpClient
    }
}
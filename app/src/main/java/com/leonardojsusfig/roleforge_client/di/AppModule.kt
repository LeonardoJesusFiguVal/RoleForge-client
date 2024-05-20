package com.leonardojsusfig.roleforge_client.di

import com.leonardojsusfig.roleforge_client.data.CharacterApi
import com.leonardojsusfig.roleforge_client.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesCharacterApi(retrofit: Retrofit): CharacterApi {
        return  retrofit.create(CharacterApi::class.java)
    }
}
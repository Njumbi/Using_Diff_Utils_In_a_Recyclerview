package com.example.diff_utils_recyclerview_example.data.di

import com.example.diff_utils_recyclerview_example.data.remote.ApiService
import com.example.diff_utils_recyclerview_example.data.repository.CharactersRepo
import com.example.diff_utils_recyclerview_example.data.repository.CharactersRepoImpl
import com.example.diff_utils_recyclerview_example.ui.BASE_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.hdodenhof.circleimageview.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesOkhttp():OkHttpClient{
        val okhhtp = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logger = HttpLoggingInterceptor()
            logger.setLevel(HttpLoggingInterceptor.Level.BODY)

            okhhtp.addInterceptor(logger)
        }
        return okhhtp.build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient):Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .client(okHttpClient)
        .baseUrl(BASE_URL)
        .build()

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun providesCharactersRepo(apiService: ApiService):CharactersRepo= CharactersRepoImpl(apiService)

}
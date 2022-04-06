package com.example.diff_utils_recyclerview_example.data.responses

import com.bumptech.glide.load.HttpException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

sealed class ApiResource<out T> {
    data class Success<out T>(val value: T) : ApiResource<T>()
    data class Error(
        val isNetworkError: Boolean?,
        val errorCode: Int?,
        val errorBody: String?
    ) : ApiResource<Nothing>()

    object Loading : ApiResource<Nothing>()

}

suspend fun <T : Any> safeApiCall(
    apiCall: suspend () -> T,
) : ApiResource<T> {
    return withContext(Dispatchers.IO) {
        try {
            val response = apiCall.invoke()
            ApiResource.Success(response)
        } catch (throwable: Throwable) {
            when(throwable){
                is HttpException -> {
                    ApiResource.Error(false, throwable.statusCode, throwable.message)
                }
                else -> {
                    ApiResource.Error(true, null, throwable.message)
                }
            }
        }
    }
}
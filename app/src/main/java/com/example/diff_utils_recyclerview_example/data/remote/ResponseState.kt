package com.example.diff_utils_recyclerview_example.data.remote

import com.example.diff_utils_recyclerview_example.BuildConfig
import com.example.diff_utils_recyclerview_example.R
import com.example.diff_utils_recyclerview_example.ui.utils.UiText
import com.google.gson.Gson
import com.google.gson.JsonObject
import retrofit2.HttpException
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

sealed class ResponseState<T> {
    data class Success<T>(val data: T) : ResponseState<T>()
    data class Error<T>(val uiText: UiText) : ResponseState<T>()
}

object ErrorHandler {
    fun <T> parseRequestException(e: Exception): ResponseState.Error<T> {
        if (BuildConfig.DEBUG) e.printStackTrace()
        return when (e) {
            is HttpException -> {
                e.response()?.errorBody()?.string()?.let { errorString ->
                    try {
                        val errorBody = Gson().fromJson(errorString, JsonObject::class.java)
                        ResponseState.Error(UiText.DynamicText(errorBody.get("message").asString!!))
                    } catch (e: Exception) {
                        ResponseState.Error(UiText.DynamicText(errorString)) // <T> is required
                    }
                } ?: run {
                    ResponseState.Error(UiText.DynamicText(e.message()))
                }
            }
            is UnknownHostException -> {
                ResponseState.Error(UiText.StaticText(R.string.server_error))
            }
            is ConnectException -> {
                ResponseState.Error(UiText.StaticText(R.string.connection_error))
            }
            is SocketTimeoutException -> {
                ResponseState.Error(UiText.StaticText(R.string.socket_exception_error))
            }
            is IOException -> {
                ResponseState.Error(UiText.StaticText(R.string.check_internet))
            }
            else -> {
                if (e.message == null) ResponseState.Error(UiText.StaticText(R.string.something_error))
                else ResponseState.Error(UiText.DynamicText(e.message!!))
            }
        }
    }
}
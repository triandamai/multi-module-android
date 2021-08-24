package com.trian.data.utils

import com.trian.common.utils.network.*
import com.trian.domain.BaseResponse
import io.ktor.client.features.*
import java.nio.channels.UnresolvedAddressException

suspend fun <T : Any> safeApiCall(call: suspend () -> BaseResponse<T>): NetworkStatus<T> {

    try {
        val response = call.invoke()

        if(response.success){
           return NetworkStatus.Success(response.data)

        }
        return NetworkStatus.Error(response.message)
    } catch (e: Throwable) {
        return when (e) {
            is ClientRequestException -> {
                if(e.response?.status?.value == 403){
                    NetworkStatus.Error(UNKNOWN_HOST_EXCEPTION)
                }else{
                    NetworkStatus.Error(UNKNOWN_HOST_EXCEPTION)
                }
            }
            is UnresolvedAddressException -> {
                NetworkStatus.Error(UNKNOWN_HOST_EXCEPTION)
            }
            else -> {
                NetworkStatus.Error(UNKNOWN_NETWORK_EXCEPTION)
            }
        }
    }

}
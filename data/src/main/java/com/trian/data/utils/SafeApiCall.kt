package com.trian.data.utils

import com.trian.common.utils.network.*
import com.trian.domain.entities.Users
import io.ktor.client.call.*
import io.ktor.client.features.*
import io.ktor.client.statement.*
import io.ktor.http.cio.*
import org.json.JSONObject
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.nio.channels.UnresolvedAddressException
import javax.inject.Inject

suspend fun <T : Any> safeApiCall(call: suspend () -> T): NetworkStatus<T> {

    try {
        val response = call.invoke()

//        if(response.status.value in 200..299){
//            val jsonObject:JSONObject = response.receive()
//            //val datas:T = jsonObject.getJSONArray("data")
//
//        }


        return NetworkStatus.Success(response)
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
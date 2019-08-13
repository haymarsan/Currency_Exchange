package com.hms.currencyexchange.network.api

import com.hms.currencyexchange.network.response.GetLatestCurrencyResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface CurrencyApi {


    @GET("latest")
    fun getLatestCurrency(): Observable<GetLatestCurrencyResponse>

}
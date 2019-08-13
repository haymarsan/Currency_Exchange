package com.hms.currencyexchange

import android.app.Application
import com.hms.currencyexchange.Utils.Utils
import com.hms.currencyexchange.data.models.CurrencyExchangeModelImpl
import com.hms.currencyexchange.network.api.CurrencyApi
import com.readystatesoftware.chuck.ChuckInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CurrencyApp : Application() {

    lateinit var currencyApi: CurrencyApi


    override fun onCreate() {
        super.onCreate()

            currencyApi = setUpApi()

        CurrencyExchangeModelImpl.initModel(this,this)

    }

    private fun setUpApi(): CurrencyApi {

        val client = OkHttpClient.Builder()
            .addInterceptor(ChuckInterceptor(applicationContext))
            .build()

        return Retrofit.Builder()
            .baseUrl(Utils.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build().create(CurrencyApi::class.java)

    }
}
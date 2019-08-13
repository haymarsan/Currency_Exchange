package com.hms.currencyexchange.data.models

import android.app.Application
import android.content.Context
import com.hms.currencyexchange.CurrencyApp
import com.hms.currencyexchange.network.api.CurrencyApi

abstract class BaseModel {

    lateinit var currencyApi: CurrencyApi

    fun initModel(context: Context, application: Application){

        val app = application as CurrencyApp
        currencyApi = app.currencyApi
    }

}
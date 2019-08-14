package com.hms.currencyexchange.data.models

import androidx.lifecycle.LiveData
import com.hms.currencyexchange.data.vos.ExchangeRateVO

interface CurrencyExchangeModel {


    fun getLatestCurrency(): ExchangeRateVO



}
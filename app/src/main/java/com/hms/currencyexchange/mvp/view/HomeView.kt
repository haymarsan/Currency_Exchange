package com.hms.currencyexchange.mvp.view

import com.hms.currencyexchange.data.vos.ExchangeRateVO

interface HomeView : BaseView {

    fun showCurrencyExchangeList(currencyList: MutableList<ExchangeRateVO>)

}
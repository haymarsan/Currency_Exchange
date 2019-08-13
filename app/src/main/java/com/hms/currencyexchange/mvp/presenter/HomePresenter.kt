package com.hms.currencyexchange.mvp.presenter

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import com.hms.currencyexchange.data.models.CurrencyExchangeModelImpl
import com.hms.currencyexchange.mvp.view.BaseView


class HomePresenter : BasePresenter<BaseView>(), IHomePresenter {

    val currencyModel:CurrencyExchangeModelImpl =CurrencyExchangeModelImpl

    override fun onUIReady(lifecycleOwner: LifecycleOwner) {
        Log.d("PresenterUIReady", " UIReadyOnHomePresenter")
        currencyModel.getLatestCurrency()


    }
}
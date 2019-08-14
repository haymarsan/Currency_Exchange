package com.hms.currencyexchange.data.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hms.currencyexchange.data.vos.ExchangeRateVO
import com.hms.currencyexchange.network.response.GetLatestCurrencyResponse
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

object CurrencyExchangeModelImpl: BaseModel(), CurrencyExchangeModel {


    override fun getLatestCurrency(): ExchangeRateVO {

        var exchangeData: ExchangeRateVO? = null

        currencyApi.getLatestCurrency().observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : Observer<ExchangeRateVO>{
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(t: ExchangeRateVO) {
                    exchangeData = t
                }

                override fun onError(e: Throwable) {

                }


            })

        return exchangeData!!

    }


}
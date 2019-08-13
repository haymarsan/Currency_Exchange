package com.hms.currencyexchange.data.models

import androidx.lifecycle.LiveData
import com.hms.currencyexchange.data.vos.ExchangeRateVO
import com.hms.currencyexchange.network.response.GetLatestCurrencyResponse
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

object CurrencyExchangeModelImpl: BaseModel(), CurrencyExchangeModel {


    override fun getLatestCurrency(): LiveData<M<ExchangeRateVO>> {

        val currencyData: Muti<ExchangeRateVO> ?= null

        currencyApi.getLatestCurrency().observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : Observer<GetLatestCurrencyResponse>{
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {

                }
                override fun onNext(t: GetLatestCurrencyResponse) {

                    currencyData.
                }


                override fun onError(e: Throwable) {

                    e.localizedMessage
                }

            })

        return
    }


}
package com.hms.currencyexchange.mvp.presenter

import androidx.lifecycle.ViewModel
import com.hms.currencyexchange.mvp.view.BaseView

open class BasePresenter<T: BaseView>: ViewModel() {

    protected var mView: T?= null

    open fun initPresenter(view: T){

        mView = view
    }
}
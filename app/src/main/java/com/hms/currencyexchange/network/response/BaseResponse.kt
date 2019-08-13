package com.hms.currencyexchange.network.response

open class BaseResponse<T> {

    val code: Int = 0
    val message: String = ""
    val data: MutableList<T> = ArrayList()


    fun isSuccess(): Boolean {

        return code == 200
    }

}
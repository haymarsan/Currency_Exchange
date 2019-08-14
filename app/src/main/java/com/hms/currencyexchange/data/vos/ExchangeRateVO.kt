package com.hms.currencyexchange.data.vos

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ExchangeRateVO(
    @SerializedName("Date") var date: String = "",
    @SerializedName("CurrencyCode") var currencyCode: String = "",
    @SerializedName("BuyRate") var buyRate: String = "",
    @SerializedName("SellRate") var sellRate: String = "",
    @SerializedName("Rate") var rate: List<Rate>? = null
) : Serializable

data class Rate(
    @SerializedName("KEY") var key: String = "",
    @SerializedName("Value") var value: String = ""
)
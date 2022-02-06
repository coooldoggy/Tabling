package com.coooldoggy.tabling.framework.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Store(
    @SerializedName("restaurantIdx")
    val restaurantIdx: Int,

    @SerializedName("thumbnail")
    val thumbnail: String,

    @SerializedName("classification")
    val classification: String,

    @SerializedName("restaurantName")
    val restaurantName: String,

    @SerializedName("rating")
    val rating: Int,

    @SerializedName("reviewCount")
    val reviewCount: Int,

    @SerializedName("summaryAddress")
    val summaryAddress: String,

    @SerializedName("isQuickBooking")
    val isQuickBooking: Boolean,

    @SerializedName("isRemoteWaiting")
    val isRemoteWaiting: Boolean,

    @SerializedName("useWaiting")
    val useWaiting: Boolean,

    @SerializedName("useBooking")
    val useBooking: Boolean,

    @SerializedName("isNew")
    val isNew: Boolean,

    @SerializedName("waitingCount")
    val waitingCount: Int

):Serializable

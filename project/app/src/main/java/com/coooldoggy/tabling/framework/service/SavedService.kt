package com.coooldoggy.tabling.framework.service

import com.coooldoggy.tabling.framework.constant.SAVED_CONTENT_SUB_URL
import com.coooldoggy.tabling.framework.model.Store
import retrofit2.Response
import retrofit2.http.GET

interface SavedService {
    @GET(SAVED_CONTENT_SUB_URL)
    suspend fun getSavedContent(): Response<List<Store>>
}
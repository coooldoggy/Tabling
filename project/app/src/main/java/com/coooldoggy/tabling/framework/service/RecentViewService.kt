package com.coooldoggy.tabling.framework.service

import com.coooldoggy.tabling.framework.constant.RECENT_CONTENT_SUB_URL
import com.coooldoggy.tabling.framework.model.Store
import retrofit2.Response
import retrofit2.http.GET

interface RecentViewService {

    @GET(RECENT_CONTENT_SUB_URL)
    suspend fun getRecentContent(): Response<List<Store>>
}
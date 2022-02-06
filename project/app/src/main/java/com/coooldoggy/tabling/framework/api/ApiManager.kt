package com.coooldoggy.tabling.framework.api

import com.coooldoggy.tabling.framework.model.Store
import com.coooldoggy.tabling.framework.service.RecentViewService
import com.coooldoggy.tabling.framework.service.SavedService
import retrofit2.Response

object ApiManager {
    private val savedService by lazy { NetworkManager.createService(SavedService::class.java) }
    private val recentViewService by lazy { NetworkManager.createService(RecentViewService::class.java) }

    suspend fun getRecentContent(): Response<List<Store>>{
        return recentViewService.getRecentContent()
    }

    suspend fun getSavedContent(): Response<List<Store>>{
        return savedService.getSavedContent()
    }
}
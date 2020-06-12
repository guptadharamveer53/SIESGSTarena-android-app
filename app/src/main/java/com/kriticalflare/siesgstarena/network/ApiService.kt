package com.kriticalflare.siesgstarena.network

import com.kriticalflare.siesgstarena.models.Blog
import com.kriticalflare.siesgstarena.models.Contest
import com.kriticalflare.siesgstarena.models.Problem
import com.kriticalflare.siesgstarena.models.TopStats
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("contests")
    suspend fun getContestsFromApi(): Response<List<Contest>>

    @GET("problems")
    suspend fun getProblemSetFromApi(): Response<List<Problem>>

    @GET("blogs")
    suspend fun getBlogsFromApi(): Response<List<Blog>>

    @GET("apps/statistics")
    suspend fun getTopAcStats(): Response<List<TopStats>>
}

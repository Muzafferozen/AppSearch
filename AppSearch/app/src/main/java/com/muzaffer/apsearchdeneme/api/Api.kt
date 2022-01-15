package com.muzaffer.apsearchdeneme.api
import com.muzaffer.apsearchdeneme.model.UserResponse


import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.Call
interface Api {

    @GET("books/search/book")
    //@Headers("Authorization: token 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")

    fun getSearchUser(
        @Query("q") query: String

    ): Call<UserResponse>
}
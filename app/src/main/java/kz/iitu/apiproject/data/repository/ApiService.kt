package kz.iitu.apiproject.data.repository

import kz.iitu.apiproject.data.model.Newapi
import retrofit2.http.GET

interface ApiService {

    @GET("people/george08/lists.json")
    suspend fun getPeople(): Newapi

}
package com.leonardojsusfig.roleforge_client.data

import com.leonardojsusfig.roleforge_client.model.DndModel
import com.leonardojsusfig.roleforge_client.util.Constants.Companion.END_POINT_CHARACTERS
import okhttp3.RequestBody

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {
    @GET(END_POINT_CHARACTERS)
    suspend fun getCharacters(@Query("id") id: String): Response<DndModel>
}
package com.leonardojsusfig.roleforge_client.repository

import com.leonardojsusfig.roleforge_client.data.CharacterApi
import com.leonardojsusfig.roleforge_client.model.CharList
import okhttp3.RequestBody
import javax.inject.Inject

class CharacterRepository @Inject constructor(private val characterApi: CharacterApi) {


    suspend fun getCharacters(id : String) : List<CharList>? {
        val response = characterApi.getCharacters(id)
        if (response.isSuccessful){
            return response.body()?.result
        }
        return null
    }
}
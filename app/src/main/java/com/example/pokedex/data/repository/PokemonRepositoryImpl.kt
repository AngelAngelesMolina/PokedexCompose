package com.example.pokedex.data.repository

import com.example.pokedex.data.remote.PokeApi
import com.example.pokedex.data.remote.dto.PokemonDto
import com.example.pokedex.data.remote.dto.PokemonListDto
import com.example.pokedex.common.Resource
import com.example.pokedex.domain.repository.PokemonRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepositoryImpl @Inject constructor(private val api: PokeApi) : PokemonRepository{

    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonListDto> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknow error occured")
        }
        return Resource.Success(response)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Resource<PokemonDto> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknow error occured")
        }
        return Resource.Success(response)
    }

}
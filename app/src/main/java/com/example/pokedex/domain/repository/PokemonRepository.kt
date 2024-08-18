package com.example.pokedex.domain.repository

import com.example.pokedex.common.Resource
import com.example.pokedex.data.remote.dto.PokemonDto
import com.example.pokedex.data.remote.dto.PokemonListDto

interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonListDto>

    suspend fun getPokemonInfo(pokemonName: String): Resource<PokemonDto>
}
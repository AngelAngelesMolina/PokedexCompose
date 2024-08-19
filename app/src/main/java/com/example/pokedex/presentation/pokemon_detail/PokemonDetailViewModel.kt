package com.example.pokedex.presentation.pokemon_detail

import androidx.lifecycle.ViewModel
import com.example.pokedex.common.Resource
import com.example.pokedex.data.remote.dto.PokemonDto
import com.example.pokedex.data.repository.PokemonRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepositoryImpl
) : ViewModel() {


    suspend fun getPokemonInfo(pokemonName: String): Resource<PokemonDto> {
        return repository.getPokemonInfo(pokemonName)
    }

}
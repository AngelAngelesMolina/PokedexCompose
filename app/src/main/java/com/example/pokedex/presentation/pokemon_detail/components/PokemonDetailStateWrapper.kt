package com.example.pokedex.presentation.pokemon_detail.components

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.pokedex.common.Resource
import com.example.pokedex.data.remote.dto.PokemonDto

@Composable
fun PokemonDetailStateWrapper(
    pokemonInfo: Resource<PokemonDto>,
    modifier: Modifier = Modifier,
    loadingModifier: Modifier = Modifier
) {

    when (pokemonInfo) {
        is Resource.Success -> {

        }

        is Resource.Error -> {
            Text(
                text = pokemonInfo.message!!, color = Color.Red,
                modifier = modifier
            )

        }

        is Resource.Loading -> {
            CircularProgressIndicator(
                color = MaterialTheme.colorScheme.primary,
                modifier = loadingModifier
            )
        }
    }

}
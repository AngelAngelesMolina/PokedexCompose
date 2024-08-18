package com.example.pokedex.data.remote.dto

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)
package com.example.heroesapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.heroesapp.R

data class Heroes(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)

object HeroesRepository{
    val heroes = listOf(
        Heroes(
            name = R.string.hero1,
            description = R.string.description1,
            image = R.drawable.android_superhero1
        ),
        Heroes(
            name = R.string.hero2,
            description = R.string.description2,
            image = R.drawable.android_superhero2
        ),
        Heroes(
            name = R.string.hero3,
            description = R.string.description3,
            image = R.drawable.android_superhero3
        ),
        Heroes(
            name = R.string.hero4,
            description = R.string.description4,
            image = R.drawable.android_superhero4
        ),
        Heroes(
            name = R.string.hero5,
            description = R.string.description5,
            image = R.drawable.android_superhero5
        ),
        Heroes(
            name = R.string.hero6,
            description = R.string.description6,
            image = R.drawable.android_superhero6
        ),
        Heroes(
            name = R.string.hero1,
            description = R.string.description1,
            image = R.drawable.android_superhero1
        ),
        Heroes(
            name = R.string.hero2,
            description = R.string.description2,
            image = R.drawable.android_superhero2
        ),
        Heroes(
            name = R.string.hero3,
            description = R.string.description3,
            image = R.drawable.android_superhero3
        ),
        Heroes(
            name = R.string.hero4,
            description = R.string.description4,
            image = R.drawable.android_superhero4
        ),
        Heroes(
            name = R.string.hero5,
            description = R.string.description5,
            image = R.drawable.android_superhero5
        ),
        Heroes(
            name = R.string.hero6,
            description = R.string.description6,
            image = R.drawable.android_superhero6
        )
    )
}
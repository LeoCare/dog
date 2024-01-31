/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * Data class con los distintos perros. Mas adelante deberian obtenerse de una Base de datos
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.koda, "Koda", 2, R.string.dog_description_1),
    Dog(R.drawable.lola, "Lola", 16, R.string.dog_description_2),
    Dog(R.drawable.frankie, "Frankie", 2, R.string.dog_description_3),
    Dog(R.drawable.nox, "Nox", 8, R.string.dog_description_4),
    Dog(R.drawable.bella, "Bella", 14, R.string.dog_description_6)
)

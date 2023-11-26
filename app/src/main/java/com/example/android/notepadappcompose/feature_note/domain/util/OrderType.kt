package com.example.android.notepadappcompose.feature_note.domain.util

// класс для двух типов упорядочивания: по возрастанию и по убыванию
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}

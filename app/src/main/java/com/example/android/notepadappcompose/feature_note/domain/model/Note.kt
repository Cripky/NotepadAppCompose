package com.example.android.notepadappcompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.android.notepadappcompose.ui.theme.BabyBlue
import com.example.android.notepadappcompose.ui.theme.LightGreen
import com.example.android.notepadappcompose.ui.theme.RedOrange
import com.example.android.notepadappcompose.ui.theme.RedPink
import com.example.android.notepadappcompose.ui.theme.Violet

// сущность (таблица) в БД
@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, RedPink, BabyBlue, Violet)
    }
}

class InvalidNoteException(message: String): Exception(message)
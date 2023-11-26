package com.example.android.notepadappcompose.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.notepadappcompose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

// интерфейс для манипулирования данными БД (запросы для БД)
// Flow - есть асинхронный поток
// suspend - ф-ия, которая может приостановить свое выполнение и возобновить его через некоторый период времени
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT *  FROM note WHERE id=:id")
    suspend fun getNoteById(id: Int): Note?

    // onConflict - старая запись будет заменена новой, таким образом нам не нужна функция update
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}
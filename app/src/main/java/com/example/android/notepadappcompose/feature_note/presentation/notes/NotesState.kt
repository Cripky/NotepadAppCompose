package com.example.android.notepadappcompose.feature_note.presentation.notes

import com.example.android.notepadappcompose.feature_note.domain.model.Note
import com.example.android.notepadappcompose.feature_note.domain.util.NoteOrder
import com.example.android.notepadappcompose.feature_note.domain.util.OrderType

// первоначальное состояние главного экрана: пустой список Note, сортировка по убыванию,
// скрыта секция с Orders
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

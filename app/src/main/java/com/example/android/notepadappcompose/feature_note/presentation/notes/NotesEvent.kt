package com.example.android.notepadappcompose.feature_note.presentation.notes

import com.example.android.notepadappcompose.feature_note.domain.model.Note
import com.example.android.notepadappcompose.feature_note.domain.util.NoteOrder

// класс действий на главном экране (где List<Note>)
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class Delete(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

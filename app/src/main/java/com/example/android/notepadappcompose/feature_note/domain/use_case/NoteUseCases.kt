package com.example.android.notepadappcompose.feature_note.domain.use_case

// класс в котором объединены все Use Cases
data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNote :GetNoteUseCase
)

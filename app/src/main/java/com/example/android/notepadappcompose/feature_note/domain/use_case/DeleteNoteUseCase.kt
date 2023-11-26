package com.example.android.notepadappcompose.feature_note.domain.use_case

import com.example.android.notepadappcompose.feature_note.domain.model.Note
import com.example.android.notepadappcompose.feature_note.domain.repository.NoteRepository

// бизнес-логика удаления note
class DeleteNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}
package com.alexk.cleanarchitecture.noteapp.feature_note.domain.use_case

import com.alexk.cleanarchitecture.noteapp.feature_note.domain.model.Note
import com.alexk.cleanarchitecture.noteapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
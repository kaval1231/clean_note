package com.alexk.cleanarchitecture.noteapp.feature_note.domain.use_case

import com.alexk.cleanarchitecture.noteapp.feature_note.domain.model.InvalidNoteException
import com.alexk.cleanarchitecture.noteapp.feature_note.domain.model.Note
import com.alexk.cleanarchitecture.noteapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of Note can't be empty")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of Note can't be empty")
        }

        repository.insertNote(note)
    }
}
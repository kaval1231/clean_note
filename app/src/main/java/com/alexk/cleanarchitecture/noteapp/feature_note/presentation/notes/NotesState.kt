package com.alexk.cleanarchitecture.noteapp.feature_note.presentation.notes

import com.alexk.cleanarchitecture.noteapp.feature_note.domain.model.Note
import com.alexk.cleanarchitecture.noteapp.feature_note.domain.util.NoteOrder
import com.alexk.cleanarchitecture.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
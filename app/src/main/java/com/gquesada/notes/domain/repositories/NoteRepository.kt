package com.gquesada.notes.domain.repositories

import com.gquesada.notes.data.models.LocalNote
import com.gquesada.notes.domain.models.NoteModel

interface NoteRepository {

    fun getAllNotes(): List<NoteModel>
    fun addNote(localNote: LocalNote)
    fun deleteNote(id: Int)
}
package com.gquesada.notes.domain.usecases

import com.gquesada.notes.data.models.LocalNote
import com.gquesada.notes.domain.repositories.NoteRepository

class AddNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun execute(localNote: LocalNote) = noteRepository.addNote(localNote)
}
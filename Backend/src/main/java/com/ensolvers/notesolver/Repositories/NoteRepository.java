package com.ensolvers.notesolver.Repositories;

import com.ensolvers.notesolver.Models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
    Note findByTitle(String title);

    List<Note> findNoteByIsArchived(boolean b);
}
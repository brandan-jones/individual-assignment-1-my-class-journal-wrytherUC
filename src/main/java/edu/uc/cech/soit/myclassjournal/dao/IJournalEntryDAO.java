package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

/**
 * Interface for journal entry data access object (DAO)
 * Used with auto wired annotation from Springboot
 */
public interface IJournalEntryDAO {
    JournalEntry save(JournalEntry journalEntry);

    List<JournalEntry> fetchAll();
}

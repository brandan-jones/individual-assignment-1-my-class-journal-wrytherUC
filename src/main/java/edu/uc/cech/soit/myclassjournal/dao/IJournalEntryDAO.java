package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

public interface IJournalEntryDAO {
    JournalEntry save(JournalEntry journalEntry);
}

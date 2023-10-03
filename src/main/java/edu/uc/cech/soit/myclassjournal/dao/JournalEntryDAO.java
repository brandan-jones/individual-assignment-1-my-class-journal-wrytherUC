package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

@Repository
public class JournalEntryDAO implements IJournalEntryDAO{
    public JournalEntry save(JournalEntry journalEntry) {
        return journalEntry;
    }
}

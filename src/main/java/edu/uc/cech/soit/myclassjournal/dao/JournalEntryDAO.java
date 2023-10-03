package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class JournalEntryDAO implements IJournalEntryDAO{

    Map<Integer, JournalEntry> allJournalEntries = new HashMap<>();

    public JournalEntry save(JournalEntry journalEntry) {
        Integer journalEntryId = journalEntry.getJournalEntryId();
        allJournalEntries.put(journalEntryId, journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        List<JournalEntry> returnJournalEntries = new ArrayList<>(allJournalEntries.values());
        return returnJournalEntries;
    }
}

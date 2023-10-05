package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Journal Entry DAO (data access object)
 * Works with the JournalEntry DTO
 * Implements the IJournalEntryDAO interface
 * CRUD operations for journal entries
 * @Repository is setting this interface as a persistent class for Springboot
 */
@Repository
public class JournalEntryDAO implements IJournalEntryDAO{

    Map<Integer, JournalEntry> allJournalEntries = new HashMap<>();

    /**
     * Saving journal entry objects to the current persistence mechanism, the allJournalEntries hash map
     * @param journalEntry, passed in from the {@link edu.uc.cech.soit.myclassjournal.service.JournalService}
     * @return the save journalEntry
     */
    public JournalEntry save(JournalEntry journalEntry) {
        Integer journalEntryId = journalEntry.getJournalEntryId();
        allJournalEntries.put(journalEntryId, journalEntry);
        return journalEntry;
    }

    /**
     * Retrieves objects in the allJournalEntries hash map
     * Converts the hash map to an array list
     * @return all objects from allJournalEntries hash map
     */
    @Override
    public List<JournalEntry> fetchAll() {
        List<JournalEntry> returnJournalEntries = new ArrayList<>(allJournalEntries.values());
        return returnJournalEntries;
    }
}

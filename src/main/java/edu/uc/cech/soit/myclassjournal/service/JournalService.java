package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dao.JournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Journal service class
 * Works with the Journal Entry DAO for CRUD operations
 * Implements the IJournalEntryService interface
 * Business logic for the Class Journal application
 * @Service is setting this class as a business logic class Springboot
 */
@Service
public class JournalService implements IJournalService{

    @Autowired
    private IJournalEntryDAO journalEntryDAO;

    /**
     * Business logic to save a journal entry
     * @param journalEntry the entry to save.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntryDAO.save(journalEntry);
    }

    /**
     * Business logic to list all save journal entries
     * @return list of saved journal entries
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryDAO.fetchAll();
    }
}

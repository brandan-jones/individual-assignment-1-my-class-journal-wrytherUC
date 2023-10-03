package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dao.JournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService implements IJournalService{

    @Autowired
    private IJournalEntryDAO journalEntryDAO;

    @Override
    public void save(JournalEntry journalEntry) {
        journalEntryDAO.save(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return null;
    }
}

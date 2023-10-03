package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

@Data
public class JournalEntry {
    private int journalEntryId;
    private String notes;
    private String date;
}

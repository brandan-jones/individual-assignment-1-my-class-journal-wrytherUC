package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/**
 * Data class for the Class Journal application
 * Gettrs and settrs created by Lombok
 */
@Data
public class JournalEntry {
    private int journalEntryId;
    private String notes;
    private String date;
}

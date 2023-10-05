package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controller for My Class Journal REST endpoints and web UI
 * This class handles the CRUD operations for journal entries, via HTTP actions and also
 * serves HTML based web pages for UI interactions with journal entries.
 */

@Controller
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return start, the start.html page, or the main page for the UI
     */
    @RequestMapping("/")
    public String index(Model model) {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setDate("10/2023");
        journalEntry.setNotes("First individual assignment");
        model.addAttribute(journalEntry);
        return "start";
    }


}

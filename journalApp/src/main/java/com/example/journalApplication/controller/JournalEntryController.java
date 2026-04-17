package com.example.journalApplication.controller;


import com.example.journalApplication.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("journal")
//will map entire class
public class JournalEntryController {


    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping()
    public ArrayList<JournalEntry> getAll() {

        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping("senddata")
    public boolean createEntry(@RequestBody JournalEntry MyEntry) {

        journalEntries.put((long) MyEntry.getId(), MyEntry);
        return true;
    }
}



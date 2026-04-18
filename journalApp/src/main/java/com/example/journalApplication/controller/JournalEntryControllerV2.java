package com.example.journalApplication.controller;


import com.example.journalApplication.Entity.JournalEntry;
import com.example.journalApplication.Service.journalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("journal")
//will map entire class
public class JournalEntryControllerV2 {


    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @Autowired
    private journalService journalServices;


    @GetMapping()
    public ArrayList<JournalEntry> getAll() {

        return null;
    }

    @GetMapping("id/{Myid}")
    public JournalEntry getID(@PathVariable Long Myid){
        return null;
    }

    @PostMapping("send")
    public boolean createEntry(@RequestBody JournalEntry MyEntry) {
        journalServices.saveJournal(MyEntry);
        return true;

    }


    @PutMapping("update/{myid}")

    public JournalEntry updateData(@PathVariable long myid,@RequestBody JournalEntry MyEntry)
    {
        return null;
    }


    @DeleteMapping("delete/{id}")
    public JournalEntry deleteData(@PathVariable long id){
        return null;
    }


}




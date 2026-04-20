package com.example.journalApplication.controller;


import com.example.journalApplication.Entity.JournalEntry;
import com.example.journalApplication.Service.journalService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("journal")
//will map entire class
public class JournalEntryControllerV2 {


    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @Autowired
    private journalService journalServices;


    @GetMapping("getList")
    public List<JournalEntry> getAll() {
        return journalServices.getAll();
    }

    @GetMapping("id/{Myid}")
    public ResponseEntity<JournalEntry> getAllById(@PathVariable ObjectId Myid, HttpMethod httpMethod){


       Optional<JournalEntry> Entry=journalServices.getAllById(Myid);
        if(Entry.isPresent()){

            return new ResponseEntity<>(Entry.get(), HttpStatus.OK);

        }
        return new ResponseEntity<>(Entry.get(), HttpStatus.NOT_FOUND);
    }

    @PostMapping("send")
    public boolean createEntry(@RequestBody JournalEntry MyEntry) {
        MyEntry.setDate(LocalDateTime.now());
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




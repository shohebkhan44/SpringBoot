package com.example.journalApplication.Service;


import com.example.journalApplication.Entity.JournalEntry;
import com.example.journalApplication.Repository.JournalRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class journalService {

    @Autowired
    private JournalRepo journalRepos;

    public void saveJournal(JournalEntry entry) {
        journalRepos.save(entry);
    }


    public List<JournalEntry> getAll(){
        return journalRepos.findAll();
    }

    public Optional<JournalEntry> getAllById(ObjectId id){

        return journalRepos.findById(id);
    }
}

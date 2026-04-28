package com.example.journalApplication.Service;


import com.example.journalApplication.Entity.JournalEntry;
import com.example.journalApplication.Entity.User;
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

    @Autowired
    private  UserService userservice;

    public void saveJournal(JournalEntry entry, String username) {

        User user=userservice.findByUserName(username);

        JournalEntry saved = journalRepos.save(entry);
        user.getJournalEntryList().add(saved);
        userservice.saveUser(user);
    }


    public List<JournalEntry> getAll(){

        return journalRepos.findAll();
    }

    public Optional<JournalEntry> getAllById(ObjectId id){

        return journalRepos.findById(id);
    }
}

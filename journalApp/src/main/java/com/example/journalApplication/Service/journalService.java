package com.example.journalApplication.Service;


import com.example.journalApplication.Entity.JournalEntry;
import com.example.journalApplication.Repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class journalService {

    @Autowired
    private JournalRepo journalRepos;

    public void saveJournal(JournalEntry entry) {
        journalRepos.save(entry);
    }
}

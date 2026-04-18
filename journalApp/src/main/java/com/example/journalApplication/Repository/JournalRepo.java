package com.example.journalApplication.Repository;

import com.example.journalApplication.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepo extends MongoRepository<JournalEntry,String> {


}

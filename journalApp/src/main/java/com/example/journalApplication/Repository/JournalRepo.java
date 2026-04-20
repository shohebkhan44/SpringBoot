package com.example.journalApplication.Repository;

import com.example.journalApplication.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface JournalRepo extends MongoRepository<JournalEntry,String> {



    Optional<JournalEntry> findById(ObjectId id);
}

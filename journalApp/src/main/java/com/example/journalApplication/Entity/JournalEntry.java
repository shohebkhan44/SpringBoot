package com.example.journalApplication.Entity;


import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import org.springframework.data.annotation.Id;
//pojo class

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Document
@Data
public class JournalEntry {


    public ObjectId id;
    public  String time;
    @NonNull
    public  String message;
    public  LocalDateTime Date;
    @DBRef
    List<JournalEntry> journalEntries=new ArrayList<>();

}

package com.example.journalApplication.Entity;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


import org.springframework.data.annotation.Id;
//pojo class

import java.time.LocalDateTime;

@Document
public class JournalEntry {

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(LocalDateTime Date) {
        this.Date = Date;
    }
@Id
    public ObjectId id;
    public  String time;
    public  String message;
    public  LocalDateTime Date;



}

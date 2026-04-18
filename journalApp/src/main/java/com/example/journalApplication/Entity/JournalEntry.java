package com.example.journalApplication.Entity;


import org.springframework.data.mongodb.core.mapping.Document;


import org.springframework.data.annotation.Id;
//pojo class

import java.lang.annotation.Documented;

@Document
public class JournalEntry {

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
@Id
    public String  id;
    public  String time;
    public  String message;



}

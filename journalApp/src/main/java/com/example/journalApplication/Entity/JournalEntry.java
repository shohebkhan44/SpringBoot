package com.example.journalApplication.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
public class JournalEntry {

@Id
    public ObjectId id;
    public  String message;
    public  LocalDateTime Date;


}

package com.ecsfin.mongoperf.model;


import lombok.Data;
import org.javers.core.metamodel.annotation.Entity;
import org.javers.core.metamodel.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Entity
@Document
public class Message {

    @Id
    private String id;
    private String messageId;
    private String type;
    private String paymentChannel;
    private String settlementAmount;
    private String settlementCurrency;
    private String senderId;
    private String receiverId;
    private String bizSvc;
    private String creationDate;
    private String settlementMethod;

}

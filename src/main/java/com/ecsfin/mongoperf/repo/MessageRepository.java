package com.ecsfin.mongoperf.repo;

import com.ecsfin.mongoperf.model.Message;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@JaversSpringDataAuditable
public interface MessageRepository extends MongoRepository<Message, String> {
}

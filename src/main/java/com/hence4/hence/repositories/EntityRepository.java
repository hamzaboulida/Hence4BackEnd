package com.hence4.hence.repositories;

import com.hence4.hence.models.Entities;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntityRepository extends MongoRepository<Entities,String> {
}

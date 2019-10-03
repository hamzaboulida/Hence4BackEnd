package com.hence4.hence.repositories;


import com.hence4.hence.models.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends MongoRepository<Comments,String> {
}
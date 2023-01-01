package com.khauminhduy.repositories;

import com.khauminhduy.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

package com.khauminhduy.repositories;

import com.khauminhduy.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

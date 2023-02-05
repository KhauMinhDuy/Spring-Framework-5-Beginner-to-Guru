package com.khauminhduy.repositories;

import com.khauminhduy.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

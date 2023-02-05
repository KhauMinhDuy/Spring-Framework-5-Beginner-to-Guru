package com.khauminhduy.services;

import com.khauminhduy.domain.Recipe;
import com.khauminhduy.repositories.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes() {
        var recipes = recipeRepository.findAll();
        Set<Recipe> recipeSet = new HashSet<>();
        recipes.iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

}

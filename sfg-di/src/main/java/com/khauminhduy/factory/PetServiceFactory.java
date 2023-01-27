package com.khauminhduy.factory;

import com.khauminhduy.services.CatPetService;
import com.khauminhduy.services.DogPetService;
import com.khauminhduy.services.PetService;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                throw new RuntimeException("petType invalid");
        }
    }

}

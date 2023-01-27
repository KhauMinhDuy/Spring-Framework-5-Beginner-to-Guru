package com.khauminhduy.boostrap;

import com.khauminhduy.model.Owner;
import com.khauminhduy.model.Vet;
import com.khauminhduy.services.OwnerService;
import com.khauminhduy.services.PetService;
import com.khauminhduy.services.VetService;
import com.khauminhduy.services.map.OwnerServiceMap;
import com.khauminhduy.services.map.VetServiceMap;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Khau");
        owner1.setLastName("Duy");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Huynh");
        owner2.setLastName("Phi");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Nguyen");
        vet1.setLastName("Anh");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Le");
        vet2.setLastName("Anh");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }

}

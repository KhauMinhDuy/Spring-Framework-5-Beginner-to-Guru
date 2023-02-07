package com.khauminhduy.services.map;

import com.khauminhduy.model.Speciality;
import com.khauminhduy.model.Vet;
import com.khauminhduy.services.SpecialtyService;
import com.khauminhduy.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@AllArgsConstructor
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        vet.getSpecialities().forEach(speciality -> {
            if(speciality.getId() == null) {
                Speciality savedSpeciality = specialtyService.save(speciality);
                speciality.setId(savedSpeciality.getId());
            }
        });
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

}

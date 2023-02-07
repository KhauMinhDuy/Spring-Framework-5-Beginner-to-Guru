package com.khauminhduy.services.springdatajpa;

import com.khauminhduy.model.Speciality;
import com.khauminhduy.repositories.SpecialtyRepository;
import com.khauminhduy.services.SpecialtyService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@AllArgsConstructor
@Service
@Profile("springdatajpa")
public class SpeicaltySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    @Override
    public Set<Speciality> findAll() {
        return null;
    }

    @Override
    public Speciality findById(Long aLong) {
        return null;
    }

    @Override
    public Speciality save(Speciality object) {
        return null;
    }

    @Override
    public void delete(Speciality object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}

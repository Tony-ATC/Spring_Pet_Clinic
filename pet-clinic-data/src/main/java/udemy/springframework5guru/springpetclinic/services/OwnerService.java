package udemy.springframework5guru.springpetclinic.services;

import udemy.springframework5guru.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findbyLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
package udemy.springframework5guru.springpetclinic.services;

import udemy.springframework5guru.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findbyLastName(String lastName);
}
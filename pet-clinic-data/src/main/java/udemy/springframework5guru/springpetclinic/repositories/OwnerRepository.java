package udemy.springframework5guru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

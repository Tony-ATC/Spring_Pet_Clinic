package udemy.springframework5guru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

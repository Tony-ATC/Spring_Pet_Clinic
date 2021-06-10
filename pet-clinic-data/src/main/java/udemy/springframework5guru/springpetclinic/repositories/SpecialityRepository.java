package udemy.springframework5guru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

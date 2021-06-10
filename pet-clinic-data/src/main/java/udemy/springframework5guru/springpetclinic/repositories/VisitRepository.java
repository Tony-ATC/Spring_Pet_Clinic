package udemy.springframework5guru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

package udemy.springframework5guru.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

package udemy.springframework5guru.springpetclinic.services.map.springDataJpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import udemy.springframework5guru.springpetclinic.model.Vet;
import udemy.springframework5guru.springpetclinic.repositories.VetRepository;
import udemy.springframework5guru.springpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJpa")
public class VetSDJpa implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpa(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}

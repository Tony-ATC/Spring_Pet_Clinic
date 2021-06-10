package udemy.springframework5guru.springpetclinic.services.map.springDataJpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import udemy.springframework5guru.springpetclinic.model.Visit;
import udemy.springframework5guru.springpetclinic.repositories.VisitRepository;
import udemy.springframework5guru.springpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springDataJpa")
public class VisitSDJpa implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpa(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}

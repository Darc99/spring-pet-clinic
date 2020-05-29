package first.springframework.springpetclinic.services;

import java.util.Set;

import first.springframework.springpetclinic.model.Vet;

/**
 * VetService
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
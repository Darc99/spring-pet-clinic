package first.springframework.springpetclinic.services;

import java.util.Set;

import first.springframework.springpetclinic.model.Pet;

/**
 * PetService
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
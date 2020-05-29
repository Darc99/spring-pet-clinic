package first.springframework.springpetclinic.services;

import java.util.Set;

import first.springframework.springpetclinic.model.Owner;

/**
 * OwnerService
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
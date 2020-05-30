package first.springframework.springpetclinic.services;

import first.springframework.springpetclinic.model.Owner;

/**
 * OwnerService
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
package first.springframework.springpetclinic.repositories;

import first.springframework.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

    Owner findByLastName(String lastName);
}

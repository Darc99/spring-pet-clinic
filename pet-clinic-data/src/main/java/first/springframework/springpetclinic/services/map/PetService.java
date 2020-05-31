package first.springframework.springpetclinic.services.map;

import java.util.Set;

import first.springframework.springpetclinic.model.Pet;
import first.springframework.springpetclinic.services.CrudService;

public class PetService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

}
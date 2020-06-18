package first.springframework.springpetclinic.bootstrap;

import first.springframework.springpetclinic.model.PetType;
import first.springframework.springpetclinic.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import first.springframework.springpetclinic.model.Owner;
import first.springframework.springpetclinic.model.Vet;
import first.springframework.springpetclinic.services.OwnerService;
import first.springframework.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Joe");
        owner1.setLastName("Cole");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mark");
        owner2.setLastName("Shawn");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Winston");
        vet1.setLastName("Greenwood");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ray");
        vet2.setLastName("Howard");

        vetService.save(vet2);

        System.out.println("Loaded Vets......");

    }
    
}
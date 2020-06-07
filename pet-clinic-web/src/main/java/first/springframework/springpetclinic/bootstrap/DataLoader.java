package first.springframework.springpetclinic.bootstrap;

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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Joe");
        owner1.setLastName("Cole");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mark");
        owner2.setLastName("Shawn");

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Winston");
        vet1.setLastName("Greenwood");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ray");
        vet2.setLastName("Howard");

        vetService.save(vet2);

        System.out.println("Loaded Vets......");

    }
    
}
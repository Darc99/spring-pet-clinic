package first.springframework.springpetclinic.bootstrap;

import first.springframework.springpetclinic.model.*;
import first.springframework.springpetclinic.services.PetTypeService;
import first.springframework.springpetclinic.services.SpecialityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import first.springframework.springpetclinic.services.OwnerService;
import first.springframework.springpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        //Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        //Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        //Speciality savedDenistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Joe");
        owner1.setLastName("Cole");
        owner1.setAddress("45 Alston");
        owner1.setCity("Orleans");
        owner1.setTelephone("282838338");

        Pet jayPet = new Pet();
        jayPet.setPetType(savedDogPetType);
        jayPet.setOwner(owner1);
        jayPet.setBirthDate(LocalDate.now());
        jayPet.setName("Rosco");
        owner1.getPets().add(jayPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mark");
        owner2.setLastName("Shawn");
        owner2.setAddress("12 Willy");
        owner2.setCity("Queens");
        owner2.setTelephone("243453");

        Pet marksPet = new Pet();
        marksPet.setPetType(savedCatPetType);
        marksPet.setOwner(owner2);
        marksPet.setBirthDate(LocalDate.now());
        marksPet.setName("Dee");
        owner2.getPets().add(marksPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners........");

        Vet vet1 = new Vet();
        vet1.setFirstName("Winston");
        vet1.setLastName("Greenwood");
        //vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ray");
        vet2.setLastName("Howard");
        //vet2.getSpecialties().add(savedDenistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets......");
    }

}
package udemy.springframework5guru.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.springframework5guru.springpetclinic.model.Owner;
import udemy.springframework5guru.springpetclinic.model.Pet;
import udemy.springframework5guru.springpetclinic.model.PetType;
import udemy.springframework5guru.springpetclinic.model.Vet;
import udemy.springframework5guru.springpetclinic.services.OwnerService;
import udemy.springframework5guru.springpetclinic.services.PetTypeService;
import udemy.springframework5guru.springpetclinic.services.VetService;

import java.time.LocalDate;

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
        dog.setName("SnoopDogg");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("SnoopCatt");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Breckerl");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Doggo-Poggo");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Breckerl");
        owner2.setCity("Miami");
        owner2.setTelephone("123456789");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(saveCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Kitty-Cat");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}

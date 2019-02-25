package com.zakayo.guru.petclinic.bootstrap;

import com.zakayo.guru.petclinic.models.Owner;
import com.zakayo.guru.petclinic.models.Vet;
import com.zakayo.guru.petclinic.services.OwnerService;
import com.zakayo.guru.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirst_name("Zakayo");
        owner1.setLast_name("Haule");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirst_name("Otu");
        owner2.setLast_name("Malapa");
        ownerService.save(owner2);
        System.out.println("Creating pet owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirst_name("Michel");
        vet1.setLast_name("Sanga");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirst_name("Boni");
        vet2.setLast_name("Gianna");
        vetService.save(vet2);
        System.out.println("Creating vets....");
    }
}

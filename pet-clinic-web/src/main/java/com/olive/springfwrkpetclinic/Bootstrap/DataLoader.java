package com.olive.springfwrkpetclinic.Bootstrap;

import org.olive.springfwrkpetclinic.model.Owner;
import org.olive.springfwrkpetclinic.model.Vet;
import org.olive.springfwrkpetclinic.service.OwnerService;
import org.olive.springfwrkpetclinic.service.VetService;
import org.olive.springfwrkpetclinic.service.map.OwnerServiceMap;
import org.olive.springfwrkpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService =new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 =new Owner();
        owner2.setId(2);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners......");

        Vet vet1 =new Vet();
        vet1.setId(1);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 =new Vet();
        vet2.setId(2);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vet Loaded");
    }
}

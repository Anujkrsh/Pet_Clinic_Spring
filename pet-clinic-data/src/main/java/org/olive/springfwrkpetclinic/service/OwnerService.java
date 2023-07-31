package org.olive.springfwrkpetclinic.service;


import org.olive.springfwrkpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String Lastname);
}

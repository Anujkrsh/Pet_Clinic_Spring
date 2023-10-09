package org.olive.springfwrkpetclinic.service;


import org.olive.springfwrkpetclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}

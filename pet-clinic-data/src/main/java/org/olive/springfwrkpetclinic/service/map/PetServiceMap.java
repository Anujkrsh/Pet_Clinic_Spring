package org.olive.springfwrkpetclinic.service.map;



import org.olive.springfwrkpetclinic.model.Pet;
import org.olive.springfwrkpetclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {


    @Override
    public Set<Pet> findall() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id){
        return super.findById(id);
    }

    public Pet save(Pet object){
        return super.save((object.getId()), object);
    }
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}

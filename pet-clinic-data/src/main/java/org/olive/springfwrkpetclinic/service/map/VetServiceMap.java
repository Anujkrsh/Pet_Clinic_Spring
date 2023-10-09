package org.olive.springfwrkpetclinic.service.map;



import org.olive.springfwrkpetclinic.model.Vet;
import org.olive.springfwrkpetclinic.service.CrudService;
import org.olive.springfwrkpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Set<Vet> findall() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id){
        return super.findById(id);
    }

    public Vet save(Vet object){
        return super.save((object.getId()), object);
    }
    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}

package org.olive.springfwrkpetclinic.service.map;




import org.olive.springfwrkpetclinic.model.Owner;
import org.olive.springfwrkpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findall() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id){
        return super.findById(id);
    }

    public Owner save(Owner object){
            return super.save((object.getId()), object);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}

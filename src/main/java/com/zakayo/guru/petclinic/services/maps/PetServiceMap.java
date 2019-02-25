package com.zakayo.guru.petclinic.services.maps;

import com.zakayo.guru.petclinic.models.Pet;
import com.zakayo.guru.petclinic.services.CrudService;
import com.zakayo.guru.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet , Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId() , object);
    }
}

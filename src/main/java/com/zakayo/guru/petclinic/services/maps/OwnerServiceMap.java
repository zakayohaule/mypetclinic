package com.zakayo.guru.petclinic.services.maps;

import com.zakayo.guru.petclinic.models.Owner;
import com.zakayo.guru.petclinic.services.CrudService;
import com.zakayo.guru.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner , Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId() , owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

package com.zakayo.guru.petclinic.services;

import com.zakayo.guru.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner , Long>{
    Owner findByLastName(String lastName);
}

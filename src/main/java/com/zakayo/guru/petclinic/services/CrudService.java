package com.zakayo.guru.petclinic.services;

import javax.lang.model.element.TypeElement;
import java.util.Set;

public interface CrudService<Type , ID> {
    Set<Type> findAll();
    Type findByID(ID id);
    Type save(Type type);
    void delete(Type type);
    void deleteById(ID id);
}

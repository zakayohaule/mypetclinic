package com.zakayo.guru.petclinic.services.maps;

import com.zakayo.guru.petclinic.models.BaseEntity;
import java.util.*;

public abstract class AbstractMapService<Type, ID> {
    protected Map<ID , Type> map = new HashMap<>();

    Set<Type> findall(){
        return new HashSet<>(map.values());
    }
    Type findById(ID id){
        return map.get(id);
    }
    Type save(ID id ,Type object){
        map.put(id , object);
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(Type object){
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }
}

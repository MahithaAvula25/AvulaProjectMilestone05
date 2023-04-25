package com.avula.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.avula.DMS.Models.Dog;
/**
 * 
 * @author S554809 Mahitha Avula
 *
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
    List<Dog> findByName(String name);
     

}

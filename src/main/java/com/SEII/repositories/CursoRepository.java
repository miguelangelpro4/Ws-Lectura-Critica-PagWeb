package com.SEII.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SEII.models.Curso;

@Repository
public interface CursoRepository extends CrudRepository <Curso,Long> { 

}

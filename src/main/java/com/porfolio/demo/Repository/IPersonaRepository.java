package com.porfolio.demo.Repository;

import com.porfolio.demo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}

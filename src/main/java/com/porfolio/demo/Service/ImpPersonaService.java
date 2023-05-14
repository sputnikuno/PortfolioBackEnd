package com.porfolio.demo.Service;

import com.porfolio.demo.Interface.IPersonaService;
import com.porfolio.demo.Repository.IPersonaRepository;
import com.porfolio.demo.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        System.out.println(persona.toString());
    }
    

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }


    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }


}



   


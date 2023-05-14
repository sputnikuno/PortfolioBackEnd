package com.porfolio.demo.Interface;

import com.porfolio.demo.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);

    public void deletePersona(Long id);
}

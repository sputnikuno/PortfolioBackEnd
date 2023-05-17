package com.porfolio.demo.Controller;

import com.porfolio.demo.Interface.IPersonaService;
import com.porfolio.demo.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://frontend-porfolio-gl.web.app")
public class PersonaController {
    
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ROL_ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ROL_ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
        public String deletePersona(@PathVariable Long id){
            ipersonaService.deletePersona(id);
            return "La persona fue eliminada";
    }
        
   
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long)1);
    }
        //URL:PUERTO/personas/editar/4/nombre & apellido/
    //@PutMapping("/personas/editar/{id}")
        //public Persona editPersona(@PathVariable Long id,
      //                             @RequestParam("nombre") String nuevoNombre,
       //                            @RequestParam("text") String nuevoText,
       //                            @RequestParam("image") String nuevoImage) {
       // Persona persona = ipersonaService.findPersona(id);
        
       // persona.setNombre(nuevoNombre);
       // persona.setText(nuevoText);
      //  persona.setImage(nuevoImage);
        
      //  ipersonaService.savePersona(persona);
      //  return persona;   

}
   
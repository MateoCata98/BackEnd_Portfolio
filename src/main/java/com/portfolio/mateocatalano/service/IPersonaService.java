
package com.portfolio.mateocatalano.service;


import com.portfolio.mateocatalano.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public Persona editarPersona (Persona per);
    
    public Persona crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona(Long id);
}

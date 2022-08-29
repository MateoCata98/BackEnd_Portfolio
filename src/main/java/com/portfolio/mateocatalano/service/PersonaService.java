
package com.portfolio.mateocatalano.service;

import com.portfolio.mateocatalano.model.Persona;
import com.portfolio.mateocatalano.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    private final PersonaRepository persoRepo;
    
    @Autowired 
    public PersonaService(PersonaRepository persoRepo){
        this.persoRepo = persoRepo;
    }
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }
    
    @Override 
    public Persona editarPersona(Persona per){
       return persoRepo.save(per);
    }

    @Override
    public Persona crearPersona(Persona per) {
        return persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
}

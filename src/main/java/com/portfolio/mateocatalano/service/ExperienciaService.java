
package com.portfolio.mateocatalano.service;


import com.portfolio.mateocatalano.model.Experiencia;
import com.portfolio.mateocatalano.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
        private final ExperienciaRepository expRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository expRepo){
        this.expRepo = expRepo;
    }
    
    public List<Experiencia> list(){
       return expRepo.findAll();
    }
     
    public Experiencia save(Experiencia exp){
        return expRepo.save(exp);
    }

    public void borrarExperiencia(Long idExp) {
        expRepo.deleteById(idExp);
    }
    
    public Optional<Experiencia> getOne (Long idExp){
        return expRepo.findById(idExp);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return expRepo.findByNombreE(nombreE);
    }
   
    public boolean existsById(Long idExp){
        return expRepo.existsById(idExp);
    }
   
    public boolean existsByNombreE(String nombreE){
        return expRepo.existsByNombreE(nombreE);
    }
    
    
}



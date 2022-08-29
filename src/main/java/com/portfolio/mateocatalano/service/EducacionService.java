
package com.portfolio.mateocatalano.service;


import com.portfolio.mateocatalano.model.Educacion;
import com.portfolio.mateocatalano.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository eduRepo;
    
    @Autowired
    public EducacionService(EducacionRepository eduRepo){
        this.eduRepo = eduRepo;
    }
    
    public List<Educacion> list(){
       return eduRepo.findAll();
    }
     
    public Educacion save(Educacion edu){
        return eduRepo.save(edu);
    }

    public void borrarEducacion(Long idEdu) {
        eduRepo.deleteById(idEdu);
    }
    
    public Optional<Educacion> getOne (Long idEdu){
        return eduRepo.findById(idEdu);
    }
    
    public Optional<Educacion> getByNombreI(String nombreI){
        return eduRepo.findByNombreI(nombreI);
    }
   
    public boolean existsById(Long idEdu){
        return eduRepo.existsById(idEdu);
    }
   
    public boolean existsByNombreI(String nombreI){
        return eduRepo.existsByNombreI(nombreI);
    }
    
    
}



package com.portfolio.mateocatalano.Controller;




import com.portfolio.mateocatalano.dto.educacionDTO;
import com.portfolio.mateocatalano.model.Educacion;
import com.portfolio.mateocatalano.service.EducacionService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://mateocatalanoportfolio.web.app/#")
public class EducacionController {
    
    @Autowired
    EducacionService eduServ;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
       List<Educacion> list = eduServ.list();
       return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")Long idEdu){
        if(!eduServ.existsById(idEdu)){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        Educacion edu = eduServ.getOne(idEdu).get();
         return new ResponseEntity(edu, HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long idEdu){
        if(!eduServ.existsById(idEdu)){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        eduServ.borrarEducacion(idEdu);
        return new ResponseEntity(HttpStatus.OK);
    }
  
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody educacionDTO educaciondto){   
         if(StringUtils.isBlank(educaciondto.getNombreI()))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        if(eduServ.existsByNombreI(educaciondto.getNombreI()))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        Educacion edu = new Educacion(
                educaciondto.getNombreI(), educaciondto.getTitulo(), educaciondto.getInformacion(), educaciondto.getModalidad(), educaciondto.getFecha(), educaciondto.getImg()
       );
       eduServ.save(edu);
       return new ResponseEntity(HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long idEdu, @RequestBody educacionDTO educaciondto){ 
        Educacion edu = eduServ.getOne(idEdu).get();
        edu.setNombreI(educaciondto.getNombreI());
        edu.setTitulo(educaciondto.getTitulo());
        edu.setInformacion(educaciondto.getInformacion());
        edu.setModalidad(educaciondto.getModalidad());
        edu.setFecha(educaciondto.getFecha());
        edu.setImg(educaciondto.getImg());
        
        eduServ.save(edu);
        return new ResponseEntity(HttpStatus.OK);
    }
}

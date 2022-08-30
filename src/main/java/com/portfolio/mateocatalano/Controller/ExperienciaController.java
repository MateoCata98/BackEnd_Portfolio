
package com.portfolio.mateocatalano.Controller;


import com.portfolio.mateocatalano.dto.experienciaDTO;
import com.portfolio.mateocatalano.model.Experiencia;
import com.portfolio.mateocatalano.service.ExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://mateocatalanoportfolio.web.app/#")
public class ExperienciaController {
   
    @Autowired
    ExperienciaService expServ;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
       List<Experiencia> list = expServ.list();
       return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id")Long idExp){
        if(!expServ.existsById(idExp)){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        Experiencia exp = expServ.getOne(idExp).get();
         return new ResponseEntity(exp, HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long idExp){
        if(!expServ.existsById(idExp)){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        expServ.borrarExperiencia(idExp);
        return new ResponseEntity(HttpStatus.OK);
    }
  
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody experienciaDTO experienciadto){   
         if(StringUtils.isBlank(experienciadto.getNombreE()))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        if(expServ.existsByNombreE(experienciadto.getNombreE()))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        Experiencia exp = new Experiencia(
                experienciadto.getNombreE(), experienciadto.getAreaExp(), experienciadto.getInformacionExp(), experienciadto.getModalidadExp(), experienciadto.getFechaExp(), experienciadto.getImgExp()
       );
       expServ.save(exp);
       return new ResponseEntity(HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long idExp, @RequestBody experienciaDTO experienciadto){ 
        Experiencia exp = expServ.getOne(idExp).get();
        exp.setNombreE(experienciadto.getNombreE());
        exp.setAreaExp(experienciadto.getAreaExp());
        exp.setInformacionExp(experienciadto.getInformacionExp());
        exp.setModalidadExp(experienciadto.getModalidadExp());
        exp.setFechaExp(experienciadto.getFechaExp());
        exp.setImgExp(experienciadto.getImgExp());
        
        expServ.save(exp);
        return new ResponseEntity(HttpStatus.OK);
    }
}



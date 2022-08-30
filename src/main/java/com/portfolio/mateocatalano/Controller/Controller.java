
package com.portfolio.mateocatalano.Controller;

import com.portfolio.mateocatalano.model.Persona;
import com.portfolio.mateocatalano.service.IPersonaService;
import java.util.List;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "https://mateocatalano-portfolio.web.app")
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Persona>guardarPersona(@RequestBody Persona pers){
        Persona persEditada=persoServ.editarPersona(pers);
        return new ResponseEntity<>(persEditada, HttpStatus.OK);
    }
    
    
    @GetMapping("/traer/persona/{id}")
    public ResponseEntity<Persona> buscarPersona(@PathVariable("id") Long id){
        Persona pers = persoServ.buscarPersona(id);
        return new ResponseEntity<>(pers, HttpStatus.OK);
    }
}




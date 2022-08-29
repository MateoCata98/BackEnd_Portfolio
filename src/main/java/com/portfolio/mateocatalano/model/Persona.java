
package com.portfolio.mateocatalano.model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String descripcion;
    private String descripcionDos;
    private String descripcionTres;
    private String imgUno;
    private String imgDos;
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idEdu")
    private List<Educacion>educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idExp")
    private List<Experiencia>experienciaList;
    
    public Persona(){
    }
    
    public Persona(Long id, String nombre, String apellido, String profesion, String descripcion, String descripcionDos, String descripcionTres, String imgUno, String imgDos){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion= descripcion;
        this.descripcionDos= descripcionDos;
        this.descripcionTres= descripcionTres;
        this.imgUno = imgUno;
        this.imgDos = imgDos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionDos() {
        return descripcionDos;
    }

    public void setDescripcionDos(String descripcionDos) {
        this.descripcionDos = descripcionDos;
    }

    public String getDescripcionTres() {
        return descripcionTres;
    }

    public void setDescripcionTres(String descripcionTres) {
        this.descripcionTres = descripcionTres;
    }

    
    public String getImgUno() {
        return imgUno;
    }

    public void setImgUno(String imgUno) {
        this.imgUno = imgUno;
    }

    public String getImgDos() {
        return imgDos;
    }

    public void setImgDos(String imgDos) {
        this.imgDos = imgDos;
    }
    
    
}

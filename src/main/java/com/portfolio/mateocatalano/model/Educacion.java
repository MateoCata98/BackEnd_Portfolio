
package com.portfolio.mateocatalano.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String nombreI;
    private String titulo;
    private String informacion;
    private String modalidad;
    private String fecha;
    private String img;
  
    public Educacion(){
    }

    public Educacion(String nombreI, String titulo, String informacion, String modalidad, String fecha, String img) {
        this.nombreI = nombreI;
        this.titulo = titulo;
        this.informacion = informacion;
        this.modalidad = modalidad;
        this.fecha = fecha;
        this.img = img;
    }

    public Long getId() {
        return idEdu;
    }

    public void setId(Long id) {
        this.idEdu = idEdu;
    }

    public String getNombreI() {
        return nombreI;
    }

    public void setNombreI(String nombreI) {
        this.nombreI = nombreI;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}


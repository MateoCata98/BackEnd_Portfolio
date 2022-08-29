
package com.portfolio.mateocatalano.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreE;
    private String areaExp;
    private String informacionExp;
    private String modalidadExp;
    private String fechaExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String areaExp, String informacionExp, String modalidadExp, String fechaExp, String imgExp) {
        this.nombreE = nombreE;
        this.areaExp = areaExp;
        this.informacionExp = informacionExp;
        this.modalidadExp = modalidadExp;
        this.fechaExp = fechaExp;
        this.imgExp = imgExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getAreaExp() {
        return areaExp;
    }

    public void setAreaExp(String areaExp) {
        this.areaExp = areaExp;
    }

    public String getInformacionExp() {
        return informacionExp;
    }

    public void setInformacionExp(String informacionExp) {
        this.informacionExp = informacionExp;
    }

    public String getModalidadExp() {
        return modalidadExp;
    }

    public void setModalidadExp(String modalidadExp) {
        this.modalidadExp = modalidadExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    
  
    
    
}

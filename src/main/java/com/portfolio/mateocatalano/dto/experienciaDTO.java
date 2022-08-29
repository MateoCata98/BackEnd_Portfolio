
package com.portfolio.mateocatalano.dto;

import javax.validation.constraints.NotBlank;

public class experienciaDTO {
     @NotBlank
    private String nombreE;
    @NotBlank
    private String areaExp;
    @NotBlank
    private String informacionExp;
    @NotBlank
    private String modalidadExp;
    @NotBlank
    private String fechaExp;
    @NotBlank
    private String imgExp;

    public experienciaDTO() {
    }

    public experienciaDTO(String nombreE, String areaExp, String informacionExp, String modalidadExp, String fechaExp, String imgExp) {
        this.nombreE = nombreE;
        this.areaExp = areaExp;
        this.informacionExp = informacionExp;
        this.modalidadExp = modalidadExp;
        this.fechaExp = fechaExp;
        this.imgExp = imgExp;
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

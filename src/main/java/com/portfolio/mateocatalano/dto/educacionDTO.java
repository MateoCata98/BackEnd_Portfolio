
package com.portfolio.mateocatalano.dto;

import javax.validation.constraints.NotBlank;



public class educacionDTO {
    @NotBlank
    private String nombreI;
    @NotBlank
    private String titulo;
    @NotBlank
    private String informacion;
    @NotBlank
    private String modalidad;
    @NotBlank
    private String fecha;
    @NotBlank
    private String img;

    public educacionDTO() {
    }

    public educacionDTO(String nombreI, String titulo, String informacion, String modalidad, String fecha, String img) {
        this.nombreI = nombreI;
        this.titulo = titulo;
        this.informacion = informacion;
        this.modalidad = modalidad;
        this.fecha = fecha;
        this.img = img;
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

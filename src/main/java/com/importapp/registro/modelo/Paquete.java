package com.importapp.registro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TPaquete")
public class Paquete {

    @Id
    @Column(name = "PAQ_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PAQ_Id;

    @Column(name = "PAQ_Producto")
    private Integer PAQ_Producto;

    @Column(name = "PAQ_Orden")
    private Integer PAQ_Orden;

    @Column(name = "PAQ_FechaCreacion")
    private Date PAQ_FechaCreacion;

    @Column(name = "PAQ_Estado")
    private Integer PAQ_Estado;

    public Integer getPAQ_Id() {
        return PAQ_Id;
    }

    public void setPAQ_Id(Integer PAQ_Id) {
        this.PAQ_Id = PAQ_Id;
    }

    public Integer getPAQ_Producto() {
        return PAQ_Producto;
    }

    public void setPAQ_Producto(Integer PAQ_Producto) {
        this.PAQ_Producto = PAQ_Producto;
    }

    public Integer getPAQ_Orden() {
        return PAQ_Orden;
    }

    public void setPAQ_Orden(Integer PAQ_Orden) {
        this.PAQ_Orden = PAQ_Orden;
    }

    public Date getPAQ_FechaCreacion() {
        return PAQ_FechaCreacion;
    }

    public void setPAQ_FechaCreacion(Date PAQ_FechaCreacion) {
        this.PAQ_FechaCreacion = PAQ_FechaCreacion;
    }

    public Integer getPAQ_Estado() {
        return PAQ_Estado;
    }

    public void setPAQ_Estado(Integer PAQ_Estado) {
        this.PAQ_Estado = PAQ_Estado;
    }

}


package com.importapp.registro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TOrden")
public class Orden {

    @Id
    @Column(name = "ORD_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ORD_Id;

    @Column(name = "ORD_Cliente")
    private Integer ORD_Cliente;

    @Column(name = "ORD_Excepcion")
    private Integer ORD_Excepcion;

    @Column(name = "ORD_Garantia")
    private Integer ORD_Garantia;

    @Column(name = "ORD_Formato")
    private Integer ORD_Formato;

    @Column(name = "ORD_Courier")
    private Integer ORD_Courier;

    @Column(name = "ORD_ISD")
    private Integer ORD_ISD;

    @Column(name = "ORD_ValorParcial")
    private Double ORD_ValorParcial;

    @Column(name = "ORD_ValorTotal")
    private Double ORD_ValorTotal;

    @Column(name = "ORD_Peso")
    private Double ORD_Peso;

    @Column(name = "ORD_IVA")
    private Integer ORD_IVA;

    @Column(name = "ORD_FechaCreacion")
    private Date ORD_FechaCreacion;

    @Column(name = "ORD_Estado")
    private Integer ORD_Estado;

    public Integer getORD_Id() {
        return ORD_Id;
    }

    public void setORD_Id(Integer ORD_Id) {
        this.ORD_Id = ORD_Id;
    }

    public Integer getORD_Cliente() {
        return ORD_Cliente;
    }

    public void setORD_Cliente(Integer ORD_Cliente) {
        this.ORD_Cliente = ORD_Cliente;
    }

    public Integer getORD_Excepcion() {
        return ORD_Excepcion;
    }

    public void setORD_Excepcion(Integer ORD_Excepcion) {
        this.ORD_Excepcion = ORD_Excepcion;
    }

    public Integer getORD_Garantia() {
        return ORD_Garantia;
    }

    public void setORD_Garantia(Integer ORD_Garantia) {
        this.ORD_Garantia = ORD_Garantia;
    }

    public Integer getORD_Formato() {
        return ORD_Formato;
    }

    public void setORD_Formato(Integer ORD_Formato) {
        this.ORD_Formato = ORD_Formato;
    }

    public Integer getORD_Courier() {
        return ORD_Courier;
    }

    public void setORD_Courier(Integer ORD_Courier) {
        this.ORD_Courier = ORD_Courier;
    }

    public Integer getORD_ISD() {
        return ORD_ISD;
    }

    public void setORD_ISD(Integer ORD_ISD) {
        this.ORD_ISD = ORD_ISD;
    }

    public Double getORD_ValorParcial() {
        return ORD_ValorParcial;
    }

    public void setORD_ValorParcial(Double ORD_ValorParcial) {
        this.ORD_ValorParcial = ORD_ValorParcial;
    }

    public Double getORD_ValorTotal() {
        return ORD_ValorTotal;
    }

    public void setORD_ValorTotal(Double ORD_ValorTotal) {
        this.ORD_ValorTotal = ORD_ValorTotal;
    }

    public Double getORD_Peso() {
        return ORD_Peso;
    }

    public void setORD_Peso(Double ORD_Peso) {
        this.ORD_Peso = ORD_Peso;
    }

    public Integer getORD_IVA() {
        return ORD_IVA;
    }

    public void setORD_IVA(Integer ORD_IVA) {
        this.ORD_IVA = ORD_IVA;
    }

    public Date getORD_FechaCreacion() {
        return ORD_FechaCreacion;
    }

    public void setORD_FechaCreacion(Date ORD_FechaCreacion) {
        this.ORD_FechaCreacion = ORD_FechaCreacion;
    }

    public Integer getORD_Estado() {
        return ORD_Estado;
    }

    public void setORD_Estado(Integer ORD_Estado) {
        this.ORD_Estado = ORD_Estado;
    }

    
}

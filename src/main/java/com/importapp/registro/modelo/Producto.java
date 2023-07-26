package com.importapp.registro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TProducto")
public class Producto {

    @Id
    @Column(name = "PRO_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PRO_Id;

    @Column(name = "PRO_Nombre")
    private String PRO_Nombre;

    @Column(name = "PRO_Descripcion")
    private String PRO_Descripcion;

    @Column(name = "PRO_TipoProducto")
    private Integer PRO_TipoProducto;

    @Column(name = "PRO_Moneda")
    private Integer PRO_Moneda;

    @Column(name = "PRO_Valor")
    private Double PRO_Valor;

    @Column(name = "PRO_Peso")
    private Double PRO_Peso;

    @Column(name = "PRO_TipoMedidaPeso")
    private Integer PRO_TipoMedidaPeso;

    @Column(name = "PRO_DimensionAncho")
    private Double PRO_DimensionAncho;

    @Column(name = "PRO_DimensionAlto")
    private Double PRO_DimensionAlto;

    @Column(name = "PRO_DimensionFondo")
    private Double PRO_DimensionFondo;

    @Column(name = "PRO_TipoMedidaDimencion")
    private Integer PRO_TipoMedidaDimencion;

    @Column(name = "PRO_Estado")
    private Integer PRO_Estado;

    public Integer getPRO_Id() {
        return PRO_Id;
    }

    public void setPRO_Id(Integer PRO_Id) {
        this.PRO_Id = PRO_Id;
    }

    public String getPRO_Nombre() {
        return PRO_Nombre;
    }

    public void setPRO_Nombre(String PRO_Nombre) {
        this.PRO_Nombre = PRO_Nombre;
    }

    public String getPRO_Descripcion() {
        return PRO_Descripcion;
    }

    public void setPRO_Descripcion(String PRO_Descripcion) {
        this.PRO_Descripcion = PRO_Descripcion;
    }

    public Integer getPRO_TipoProducto() {
        return PRO_TipoProducto;
    }

    public void setPRO_TipoProducto(Integer PRO_TipoProducto) {
        this.PRO_TipoProducto = PRO_TipoProducto;
    }

    public Integer getPRO_Moneda() {
        return PRO_Moneda;
    }

    public void setPRO_Moneda(Integer PRO_Moneda) {
        this.PRO_Moneda = PRO_Moneda;
    }

    public Double getPRO_Valor() {
        return PRO_Valor;
    }

    public void setPRO_Valor(Double PRO_Valor) {
        this.PRO_Valor = PRO_Valor;
    }

    public Double getPRO_Peso() {
        return PRO_Peso;
    }

    public void setPRO_Peso(Double PRO_Peso) {
        this.PRO_Peso = PRO_Peso;
    }

    public Integer getPRO_TipoMedidaPeso() {
        return PRO_TipoMedidaPeso;
    }

    public void setPRO_TipoMedidaPeso(Integer PRO_TipoMedidaPeso) {
        this.PRO_TipoMedidaPeso = PRO_TipoMedidaPeso;
    }

    public Double getPRO_DimensionAncho() {
        return PRO_DimensionAncho;
    }

    public void setPRO_DimensionAncho(Double PRO_DimensionAncho) {
        this.PRO_DimensionAncho = PRO_DimensionAncho;
    }

    public Double getPRO_DimensionAlto() {
        return PRO_DimensionAlto;
    }

    public void setPRO_DimensionAlto(Double PRO_DimensionAlto) {
        this.PRO_DimensionAlto = PRO_DimensionAlto;
    }

    public Double getPRO_DimensionFondo() {
        return PRO_DimensionFondo;
    }

    public void setPRO_DimensionFondo(Double PRO_DimensionFondo) {
        this.PRO_DimensionFondo = PRO_DimensionFondo;
    }

    public Integer getPRO_TipoMedidaDimencion() {
        return PRO_TipoMedidaDimencion;
    }

    public void setPRO_TipoMedidaDimencion(Integer PRO_TipoMedidaDimension) {
        this.PRO_TipoMedidaDimencion = PRO_TipoMedidaDimension;
    }

    public Integer getPRO_Estado() {
        return PRO_Estado;
    }

    public void setPRO_Estado(Integer PRO_Estado) {
        this.PRO_Estado = PRO_Estado;
    }

    
}

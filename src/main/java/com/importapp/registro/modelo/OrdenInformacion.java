package com.importapp.registro.modelo;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

@Entity
@Table(name = "TOrdenInformacion")
public class OrdenInformacion {

    @Id
    private Integer Id;
    private String Cliente;
    private String Excepcion;
    private String Garantia;
    private String Formato;
    private String Courier;
    private String ISD;
    private String ValorParcial;
    private String ValorTotal;
    private String Peso;
    private String IVA;
    private String FechaCreacion;
    private String Estado;

    public OrdenInformacion() {
    }

    public OrdenInformacion(Integer id, String cliente, String excepcion, String garantia, String formato,
            String courier, String isd, String valorParcial, String valorTotal, String peso, String iva,
            String fechaCreacion, String estado) {
        Id = id;
        Cliente = cliente;
        Excepcion = excepcion;
        Garantia = garantia;
        Formato = formato;
        Courier = courier;
        ISD = isd;
        ValorParcial = valorParcial;
        ValorTotal = valorTotal;
        Peso = peso;
        IVA = iva;
        FechaCreacion = fechaCreacion;
        Estado = estado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getExcepcion() {
        return Excepcion;
    }

    public void setExcepcion(String Excepcion) {
        this.Excepcion = Excepcion;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getCourier() {
        return Courier;
    }

    public void setCourier(String Courier) {
        this.Courier = Courier;
    }

    public String getISD() {
        return ISD;
    }

    public void setISD(String ISD) {
        this.ISD = ISD;
    }

    public String getValorParcial() {
        return ValorParcial;
    }

    public void setValorParcial(String ValorParcial) {
        this.ValorParcial = ValorParcial;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
    @Override
    public String toString() {
        return "OrdenInformacion [Id=" + Id + ", Cliente=" + Cliente + ", Excepcion=" + Excepcion + ", Garantia="
                + Garantia + ", Formato=" + Formato + ", Courier=" + Courier + ", ISD=" + ISD + ", ValorParcial="
                + ValorParcial + ", ValorTotal=" + ValorTotal + ", Peso=" + Peso + ", IVA=" + IVA + ", FechaCreacion="
                + FechaCreacion + ", Estado=" + Estado + "]";
    }
}


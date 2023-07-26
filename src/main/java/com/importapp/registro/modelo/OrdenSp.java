package com.importapp.registro.modelo;

public class OrdenSp {
    
    private int Cliente ;

    private String Excepcion;

    private String Garantia ;

    private int Formato;

    private int Courier;

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
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

    public int getFormato() {
        return Formato;
    }

    public void setFormato(int Formato) {
        this.Formato = Formato;
    }

    public int getCourier() {
        return Courier;
    }

    public void setCourier(int Courier) {
        this.Courier = Courier;
    }

    
}

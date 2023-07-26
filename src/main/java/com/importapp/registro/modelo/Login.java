package com.importapp.registro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TLogin")
public class Login {

    @Id
    @Column(name = "LOG_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LOG_Id;

    @Column(name = "LOG_User")
    private String LOG_User;

    @Column(name = "LOG_Pass")
    private String LOG_Pass;

    @Column(name = "LOG_FechaCreacion")
    private Date LOG_FechaCreacion;

    @Column(name = "LOG_Cliente")
    private Integer LOG_Cliente;

    @Column(name = "LOG_Estado")
    private Integer LOG_Estado;
    
    @Column(name = "LOG_TOKEN")
    private String LOG_TOKEN;
    
    @Column(name = "LOG_UID")
    private String LOG_UID;

    public Integer getLOG_Id() {
        return LOG_Id;
    }

    public void setLOG_Id(Integer LOG_Id) {
        this.LOG_Id = LOG_Id;
    }

    public String getLOG_User() {
        return LOG_User;
    }

    public void setLOG_User(String LOG_User) {
        this.LOG_User = LOG_User;
    }

    public String getLOG_Pass() {
        return LOG_Pass;
    }

    public void setLOG_Pass(String LOG_Pass) {
        this.LOG_Pass = LOG_Pass;
    }

    public Date getLOG_FechaCreacion() {
        return LOG_FechaCreacion;
    }

    public void setLOG_FechaCreacion(Date LOG_FechaCreacion) {
        this.LOG_FechaCreacion = LOG_FechaCreacion;
    }

    public Integer getLOG_Cliente() {
        return LOG_Cliente;
    }

    public void setLOG_Cliente(Integer LOG_Cliente) {
        this.LOG_Cliente = LOG_Cliente;
    }

    public Integer getLOG_Estado() {
        return LOG_Estado;
    }

    public void setLOG_Estado(Integer LOG_Estado) {
        this.LOG_Estado = LOG_Estado;
    }

    public String getLOG_TOKEN() {
        return LOG_TOKEN;
    }

    public void setLOG_TOKEN(String LOG_TOKEN) {
        this.LOG_TOKEN = LOG_TOKEN;
    }

    public String getLOG_UID() {
        return LOG_UID;
    }

    public void setLOG_UID(String LOG_UID) {
        this.LOG_UID = LOG_UID;
    }

       
}


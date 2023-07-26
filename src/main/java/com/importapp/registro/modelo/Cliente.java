package com.importapp.registro.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "TCliente")
public class Cliente {

    @Id
    @Column(name = "CLI_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CLI_Id;

    @Column(name = "CLI_TipoIdentificacion")
    private String CLI_TipoIdentificacion;

    @Column(name = "CLI_Identificacion")
    private String CLI_Identificacion;

    @Column(name = "CLI_ApellidoPaterno")
    private String CLI_ApellidoPaterno;

    @Column(name = "CLI_ApellidoMaterno")
    private String CLI_ApellidoMaterno;

    @Column(name = "CLI_Nombre1")
    private String CLI_Nombre1;
    
    @Column(name = "CLI_Nombre2")
    private String CLI_Nombre2;

    @Column(name = "CLI_Telefono")
    private String CLI_Telefono;

    @Column(name = "CLI_Correo")
    private String CLI_Correo;

    @Column(name = "CLI_FechaNacimiento")
    private Date CLI_FechaNacimiento;
    
    @Column(name = "CLI_Estado")
    private Integer CLI_Estado;

    public Cliente(Integer CLI_Id, String CLI_TipoIdentificacion, String CLI_Identificacion, String CLI_ApellidoPaterno, String CLI_ApellidoMaterno, String CLI_Nombre1, String CLI_Nombre2, String CLI_Telefono, String CLI_Correo, Date CLI_FechaNacimiento, Integer CLI_Estado) {
        this.CLI_Id = CLI_Id;
        this.CLI_TipoIdentificacion = CLI_TipoIdentificacion;
        this.CLI_Identificacion = CLI_Identificacion;
        this.CLI_ApellidoPaterno = CLI_ApellidoPaterno;
        this.CLI_ApellidoMaterno = CLI_ApellidoMaterno;
        this.CLI_Nombre1 = CLI_Nombre1;
        this.CLI_Nombre2 = CLI_Nombre2;
        this.CLI_Telefono = CLI_Telefono;
        this.CLI_Correo = CLI_Correo;
        this.CLI_FechaNacimiento = CLI_FechaNacimiento;
        this.CLI_Estado = CLI_Estado;
    }
    
    

    public Integer getCLI_Id() {
        return CLI_Id;
    }

    public void setCLI_Id(Integer CLI_Id) {
        this.CLI_Id = CLI_Id;
    }

    public String getCLI_TipoIdentificacion() {
        return CLI_TipoIdentificacion;
    }

    public void setCLI_TipoIdentificacion(String CLI_TipoIdentificacion) {
        this.CLI_TipoIdentificacion = CLI_TipoIdentificacion;
    }

    public String getCLI_Identificacion() {
        return CLI_Identificacion;
    }

    public void setCLI_Identificacion(String CLI_Identificacion) {
        this.CLI_Identificacion = CLI_Identificacion;
    }

    public String getCLI_ApellidoPaterno() {
        return CLI_ApellidoPaterno;
    }

    public void setCLI_ApellidoPaterno(String CLI_ApellidoPaterno) {
        this.CLI_ApellidoPaterno = CLI_ApellidoPaterno;
    }

    public String getCLI_ApellidoMaterno() {
        return CLI_ApellidoMaterno;
    }

    public void setCLI_ApellidoMaterno(String CLI_ApellidoMaterno) {
        this.CLI_ApellidoMaterno = CLI_ApellidoMaterno;
    }

    public String getCLI_Nombre1() {
        return CLI_Nombre1;
    }

    public void setCLI_Nombre1(String CLI_Nombre1) {
        this.CLI_Nombre1 = CLI_Nombre1;
    }

    public String getCLI_Nombre2() {
        return CLI_Nombre2;
    }

    public void setCLI_Nombre2(String CLI_Nombre2) {
        this.CLI_Nombre2 = CLI_Nombre2;
    }

    public String getCLI_Telefono() {
        return CLI_Telefono;
    }

    public void setCLI_Telefono(String CLI_Telefono) {
        this.CLI_Telefono = CLI_Telefono;
    }

    public String getCLI_Correo() {
        return CLI_Correo;
    }

    public void setCLI_Correo(String CLI_Correo) {
        this.CLI_Correo = CLI_Correo;
    }

    public Date getCLI_FechaNacimiento() {
        return CLI_FechaNacimiento;
    }

    public void setCLI_FechaNacimiento(Date CLI_FechaNacimiento) {
        this.CLI_FechaNacimiento = CLI_FechaNacimiento;
    }

    public Integer getCLI_Estado() {
        return CLI_Estado;
    }

    public void setCLI_Estado(Integer CLI_Estado) {
        this.CLI_Estado = CLI_Estado;
    }



}

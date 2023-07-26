package com.importapp.registro.Repositorio;

import com.importapp.registro.modelo.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;


/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */
public interface LoginRepositorio extends JpaRepository<Login, Integer> {

    @Procedure("SP_CerrarSesion")
    String CerrarSP(
            @Param("Usuario") String pUsuario
    );

    @Procedure("SP_Login")
    String LoginSP(
            @Param("User") String pUser,
            @Param("Pass") String pPass,
            @Param("TOKEN") String pTOKEN
    );

}

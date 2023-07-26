package com.importapp.registro.Repositorio;


import com.importapp.registro.modelo.Cliente;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
 @Procedure("SP_ClienteInsert") 
    String insertSP(
        @Param("TipoIdentificacion") int pNombre,
        @Param("Identificacion") String pDescripcion,
        @Param("ApellidoPaterno") String pApellidoPaterno,
        @Param("ApellidoMaterno") String pApellidoMaterno,
        @Param("Nombre1") String pNombre1,
        @Param("Nombre2") String pNombre2,
        @Param("Telefono") String pTelefono,
        @Param("Correo") String pCorreo,
        @Param("FechaNacimiento") Date pFechaNacimiento,
        @Param("User") String pUser,
        @Param("Pass") String pPass,
        @Param("TOKEN ") String pTOKEN 
    );
}

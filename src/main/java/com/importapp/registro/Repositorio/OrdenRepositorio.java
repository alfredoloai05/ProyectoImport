package com.importapp.registro.Repositorio;

import com.importapp.registro.modelo.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.query.Procedure;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */

public interface OrdenRepositorio extends JpaRepository<Orden, Integer> {

    @Procedure("SP_CrearOrden") 
    String insertSP(
        @Param("Cliente") int pCliente,
        @Param("Excepcion") String pExcepcion,
        @Param("Garantia") String pGarantia,
        @Param("Formato") int pFormato,
        @Param("Courier") int pCourier
    );
}
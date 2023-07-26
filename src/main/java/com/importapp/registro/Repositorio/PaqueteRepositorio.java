package com.importapp.registro.Repositorio;


import com.importapp.registro.modelo.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */

public interface PaqueteRepositorio extends JpaRepository<Paquete, Integer>{
    
    @Procedure("SP_CrearPaquete") 
    String insertSP(
        @Param("Producto") int pProducto,
        @Param("Orden") int pOrden

    );
}

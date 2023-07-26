package com.importapp.registro.Repositorio;

import com.importapp.registro.modelo.OrdenInformacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */

@Repository
public interface OrdenInformacionRepositorio extends JpaRepository<OrdenInformacion, Integer> {
}

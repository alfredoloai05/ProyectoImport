package com.importapp.registro.servicio;

import com.importapp.registro.Repositorio.OrdenRepositorio;
import com.importapp.registro.modelo.Orden;
import com.importapp.registro.modelo.OrdenSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interconecion entre el contolador de datos de ingreso hacia la persistencia de datos
* Fecha: 05/07/2023
*/

@Service
public class OrdenServicio {

    @Autowired
    private OrdenRepositorio ordenRepositorio;

    public List<Orden> listarOrdenes() {
        return ordenRepositorio.findAll();
    }

    public Orden crearOrden(Orden orden) {
        return ordenRepositorio.save(orden);
    }

    public Orden actualizarOrden(Orden orden) {
        return ordenRepositorio.save(orden);
    }

    public String eliminarOrden(Integer id) {
        ordenRepositorio.deleteById(id);
        return "Eliminación exitosa";
    }

    public String insertarOrdenSP(OrdenSp pOrden) throws Exception {
        return ordenRepositorio.insertSP(
                pOrden.getCliente(),
                pOrden.getExcepcion(),
                pOrden.getGarantia(),
                pOrden.getFormato(),
                pOrden.getCourier()
        );
    }
    
}

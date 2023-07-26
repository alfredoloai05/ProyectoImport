package com.importapp.registro.servicio;

import com.importapp.registro.Repositorio.PaqueteRepositorio;
import com.importapp.registro.modelo.Paquete;
import com.importapp.registro.modelo.PaqueteSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interconecion entre el contolador de datos de ingreso hacia la persistencia de datos
* Fecha: 05/07/2023
*/

@Service
public class PaqueteServicio {
    @Autowired
    private PaqueteRepositorio paqueteRepositorio;

    public List<Paquete> listarPaquetes() {
        return paqueteRepositorio.findAll();
    }

    public Paquete obtenerPaquetePorId(Integer id) {
        return paqueteRepositorio.findById(id).orElse(null);
    }

    public Paquete crearPaquete(Paquete paquete) {
        return paqueteRepositorio.save(paquete);
    }

    public Paquete actualizarPaquete(Paquete paquete) {
        return paqueteRepositorio.save(paquete);
    }

    public String eliminarPaquete(Integer id) {
        paqueteRepositorio.deleteById(id);
        return "Eliminación exitosa";
    }
    
    public String insertarPaqueteSP(PaqueteSP pPaquete) throws Exception {
        return paqueteRepositorio.insertSP(
                pPaquete.getProducto(),
                pPaquete.getOrden()
        );
    }
}

package com.importapp.registro.controlador;

import com.importapp.registro.Repositorio.OrdenInformacionRepositorio;
import com.importapp.registro.modelo.Orden;
import com.importapp.registro.modelo.OrdenInformacion;
import com.importapp.registro.modelo.OrdenSp;
import com.importapp.registro.servicio.OrdenServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion para el manejo de datos desde aplicaciones
* Fecha: 16/07/2023
*/ 

@RestController
public class OrdenControlador {
    
    @Autowired
    private OrdenServicio ordenServicio;
    private OrdenInformacion ordenInformacio;
    
    private final OrdenInformacionRepositorio ordenInformacionRepository;

    public OrdenControlador(OrdenInformacionRepositorio ordenInformacionRepository) {
        this.ordenInformacionRepository = ordenInformacionRepository;
    }

    @GetMapping("/orden/{id}")
    public ResponseEntity<OrdenInformacion> obtenerOrdenInformacion(@PathVariable("id") Integer idOrden) {
        Optional<OrdenInformacion> ordenInformacionOptional = ordenInformacionRepository.findById(idOrden);
        if (ordenInformacionOptional.isPresent()) {
            return ResponseEntity.ok(ordenInformacionOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/orden")
    public String insertarOrdenSP(@RequestBody OrdenSp pOrden) throws Exception {
        return ordenServicio.insertarOrdenSP(pOrden);
    }
    
    @PutMapping("/orden")
    public Orden actualizarOrden(@RequestBody Orden orden) {
        return ordenServicio.actualizarOrden(orden);
    }
    
    @DeleteMapping("/orden/{id}")
    public String eliminarOrden(@PathVariable("id") Integer idOrden) {
        return ordenServicio.eliminarOrden(idOrden);
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ResponseEntity.badRequest().body("Error de ingreso de datos");
    }

}

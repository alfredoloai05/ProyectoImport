package com.importapp.registro.controlador;

import com.importapp.registro.modelo.Paquete;
import com.importapp.registro.modelo.PaqueteSP;
import com.importapp.registro.servicio.PaqueteServicio;
import java.util.List;
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
public class PaqueteControlador {
    
    @Autowired
    private PaqueteServicio paqueteServicio;
    
    @GetMapping("/paquete")
    public List<Paquete> listarPaquetes() {
        return paqueteServicio.listarPaquetes();
    }
    
    @PostMapping("/paquete")
    public String crearPaquete(@RequestBody PaqueteSP pPaquete)throws Exception {
        return paqueteServicio.insertarPaqueteSP(pPaquete);
    }
        
    @PutMapping("/paquete")
    public Paquete actualizarPaquete(@RequestBody Paquete paquete) {
        return paqueteServicio.actualizarPaquete(paquete);
    }
    
    @DeleteMapping("/paquete/{id}")
    public String eliminarPaquete(@PathVariable("id") Integer idPaquete) {
        return paqueteServicio.eliminarPaquete(idPaquete);
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ResponseEntity.badRequest().body("Error de ingreso de datos");
    }
}

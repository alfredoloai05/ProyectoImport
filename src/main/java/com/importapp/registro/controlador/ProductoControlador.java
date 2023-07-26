package com.importapp.registro.controlador;

import com.importapp.registro.modelo.Producto;
import com.importapp.registro.modelo.ProductoSp;
import com.importapp.registro.servicio.ProductoServicio;
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
public class ProductoControlador {
    
    @Autowired
    private ProductoServicio productoServicio;
    
    @GetMapping("/producto")
    public List<Producto> listarProductos() {
        return productoServicio.listarProductos();
    }
   
    @PostMapping("/producto")
    public String Nuevo(@RequestBody ProductoSp pproducto) {
        return productoServicio.insertarProductoSP(pproducto);
    }
    
    @PutMapping("/producto")
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return productoServicio.actualizarProducto(producto);
    }
    
    @DeleteMapping("/producto/{id}")
    public String eliminarProducto(@PathVariable("id") Integer idProducto) {
        return productoServicio.eliminarProducto(idProducto);
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ResponseEntity.badRequest().body("Error de ingreso de datos");
    }
}

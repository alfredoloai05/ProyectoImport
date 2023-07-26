package com.importapp.registro.controlador;

import com.importapp.registro.modelo.Cliente;
import com.importapp.registro.modelo.ClienteLoginSP;
import com.importapp.registro.servicio.ClienteServicio;
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
public class ClienteControlador {
    
  @Autowired
   private ClienteServicio objClienteServicio;
  
  
   @GetMapping("/clientes")
   public List<Cliente> Listar(){
       return objClienteServicio.listarCliente();
   }
   
   @PostMapping("/clientes")
    public String Nuevo(@RequestBody ClienteLoginSP pCliente ) throws Exception{
       return objClienteServicio.insertarProductoSP(pCliente);
   }
    
    @PutMapping("/clientes")
    public Cliente Actualizar(@RequestBody Cliente pCliente ){
       return objClienteServicio.actualizarCliente(pCliente);
   }
    
    @DeleteMapping("/clientes/{id}")
    public String Elimianr(@PathVariable("id") Integer pIdCliente){
        return objClienteServicio.eliminarCliente(pIdCliente);
    }
        
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ResponseEntity.badRequest().body("Error de ingreso de datos");
    }
}



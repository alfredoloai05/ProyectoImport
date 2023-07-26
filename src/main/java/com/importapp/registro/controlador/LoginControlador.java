package com.importapp.registro.controlador;

import com.importapp.registro.modelo.CerrarSesion;
import com.importapp.registro.modelo.Login;
import com.importapp.registro.modelo.LoginSP;
import com.importapp.registro.servicio.LoginServicio;
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
import java.util.List;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion para el manejo de datos desde aplicaciones
* Fecha: 16/07/2023
*/

@RestController
public class LoginControlador {
    @Autowired
    private LoginServicio loginServicio;

    @GetMapping("/login")
    public List<Login> listarLogins() {
        return loginServicio.listarLogins();
    }

    @PostMapping("/cerrarlogin")
    public String cerrarLogin(@RequestBody CerrarSesion login) {
        return loginServicio.cerrarSesionSP(login);
    }

    @PostMapping("/login")
    public String Login(@RequestBody LoginSP plogin) throws Exception{
        return loginServicio.crearLogin(plogin);
    }
    
    @PutMapping("/login")
    public Login actualizarLogin(@RequestBody Login login) {
        return loginServicio.actualizarLogin(login);
    }

    @DeleteMapping("/login/{id}")
    public String eliminarLogin(@PathVariable("id") Integer id) {
        return loginServicio.eliminarLogin(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        return ResponseEntity.badRequest().body("Error de ingreso de datos");
    }
}

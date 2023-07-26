package com.importapp.registro.servicio;

import com.importapp.registro.Repositorio.LoginRepositorio;
import com.importapp.registro.modelo.CerrarSesion;
import com.importapp.registro.modelo.Login;
import com.importapp.registro.modelo.LoginSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interconecion entre el contolador de datos de ingreso hacia la persistencia de datos
* Fecha: 05/07/2023
*/

@Service
public class LoginServicio {

    @Autowired
    private LoginRepositorio loginRepositorio;

    public List<Login> listarLogins() {
        return loginRepositorio.findAll();
    }

    public String crearLogin(LoginSP plogin) {
        return loginRepositorio.LoginSP(
                plogin.getUser(),
                plogin.getPass(),
                plogin.getTOKEN()
        );
    }

    public Login actualizarLogin(Login login) {
        return loginRepositorio.save(login);
    }

    public String eliminarLogin(Integer id) {
        loginRepositorio.deleteById(id);
        return "Eliminación exitosa";
    }

    public String cerrarSesionSP(CerrarSesion pCS) {
        return loginRepositorio.CerrarSP(
                pCS.getUsuario()
        );
    }

}

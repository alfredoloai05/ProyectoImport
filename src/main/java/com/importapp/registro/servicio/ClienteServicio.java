package com.importapp.registro.servicio;

import com.importapp.registro.Repositorio.ClienteRepositorio;
import com.importapp.registro.modelo.Cliente;
import com.importapp.registro.modelo.ClienteLoginSP;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/*
* Autor: Alfredo Loaiza
* Descripcion: Interconecion entre el contolador de datos de ingreso hacia la persistencia de datos
* Fecha: 05/07/2023
*/

@Service
public class ClienteServicio {

    private ClienteRepositorio objClienteRepositorio;
    
    @Autowired
    public ClienteServicio(ClienteRepositorio objClienteRepositorio){
        this.objClienteRepositorio = objClienteRepositorio;
    }

    public List<Cliente> listarCliente() {
        return objClienteRepositorio.findAll();
    }

    public Cliente crearCliente(Cliente pCliente) {
        return objClienteRepositorio.save(pCliente);
    }

    public Cliente actualizarCliente(Cliente pCliente) {
        return objClienteRepositorio.save(pCliente);
    }

    public String eliminarCliente(Integer pId) {
        String MsgRespuesta = "Eliminacion Correcta";
        objClienteRepositorio.deleteById(pId);
        return MsgRespuesta;
    }

    public String insertarProductoSP(ClienteLoginSP pCL) throws Exception {
        String encryptedPassword = EncriptarAES.encryptPassword(pCL.getPass());
        pCL.setPass(encryptedPassword);

        String randomPokemonName = obtenerNombrePokemonAleatorio();
        pCL.setTOKEN(randomPokemonName);

        return objClienteRepositorio.insertSP(
                pCL.getTipoIdentificacion(),
                pCL.getIdentificacion(),
                pCL.getApellidoPaterno(),
                pCL.getApellidoMaterno(),
                pCL.getNombre1(),
                pCL.getNombre2(),
                pCL.getTelefono(),
                pCL.getCorreo(),
                pCL.getFechaNacimiento(),
                pCL.getUser(),
                pCL.getPass(),
                pCL.getTOKEN()
        );
    }

    private String obtenerNombrePokemonAleatorio() throws IOException {
    String apiURL = "https://pokeapi.co/api/v2/pokemon-species";
    URL url = new URL(apiURL);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");

    if (conn.getResponseCode() != 200) {
        throw new RuntimeException("Error " + conn.getResponseCode());
    }

    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.readTree(conn.getInputStream());
    JsonNode resultsNode = jsonNode.get("results");
    int totalPokemons = resultsNode.size();
    Random random = new Random();
    int randomIndex = random.nextInt(totalPokemons);
    String randomPokemonName = resultsNode.get(randomIndex).get("name").asText();

    conn.disconnect();

    return randomPokemonName;
}

}
package com.importapp.registro.servicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

/*
* Autor: Alfredo Loaiza
* Descripcion: Consumo del API Pokemon
* Fecha: 05/07/2023
*/

public class PokemonApiClient {

    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon-species";

    public String obtenerNombrePokemonAleatorio() throws IOException {
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Error: código de respuesta HTTP " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        StringBuilder responseBuilder = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            responseBuilder.append(output);
        }

        conn.disconnect();

        String response = responseBuilder.toString();
        String[] nombresPokemon = response.split("\"name\":\"");
        Random random = new Random();
        String nombrePokemonAleatorio = nombresPokemon[random.nextInt(nombresPokemon.length)].split("\"")[0];

        return nombrePokemonAleatorio;
    }
}

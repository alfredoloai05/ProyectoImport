package com.importapp.registro;

import com.importapp.registro.Repositorio.ClienteRepositorio;
import com.importapp.registro.modelo.Cliente;
import com.importapp.registro.servicio.ClienteServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ClienteServicioTest {

    @Mock
    private ClienteRepositorio clienteRepositorio;

    @InjectMocks
    private ClienteServicio clienteServicio;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listarClienteDeberiaRetornarListaDeClientes() {

        Cliente cliente1 = new Cliente(1, "Tipo1", "Identificacion1", "Apellido1", "Materno1", "Nombre1", "Nombre2", "Telefono1", "correo1@example.com", new Date(), 1);
        Cliente cliente2 = new Cliente(2, "Tipo2", "Identificacion2", "Apellido2", "Materno2", "Nombre3", "Nombre4", "Telefono2", "correo2@example.com", new Date(), 1);

        List<Cliente> clientes = Arrays.asList(cliente1, cliente2);

        when(clienteRepositorio.findAll()).thenReturn(clientes);

        List<Cliente> resultado = clienteServicio.listarCliente();

        assertEquals(clientes, resultado);
        verify(clienteRepositorio, times(1)).findAll();
    }

}

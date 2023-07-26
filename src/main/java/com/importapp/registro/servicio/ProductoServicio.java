package com.importapp.registro.servicio;

import com.importapp.registro.Repositorio.ProductoRepositorio;
import com.importapp.registro.modelo.Producto;
import com.importapp.registro.modelo.ProductoSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interconecion entre el contolador de datos de ingreso hacia la persistencia de datos
* Fecha: 05/07/2023
*/

@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    public Producto obtenerProductoPorId(Integer id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    public Producto crearProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public Producto actualizarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public String eliminarProducto(Integer id) {
        productoRepositorio.deleteById(id);
        return "Eliminación exitosa";
    }
    
   public String insertarProductoSP(ProductoSp pProducto) {
    return productoRepositorio.insertSP(
        pProducto.getNombre(),
        pProducto.getDescripcion(),
        pProducto.getTipoProducto(),
        pProducto.getMoneda(),
        pProducto.getValor(),
        pProducto.getPeso(),
        pProducto.getTipoMedidaPeso(),
        pProducto.getDimensionAncho(),
        pProducto.getDimensionAlto(),
        pProducto.getDimensionFondo(),
        pProducto.getTipoMedidaDimencion()
    );
}
}

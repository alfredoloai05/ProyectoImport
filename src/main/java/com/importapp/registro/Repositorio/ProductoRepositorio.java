package com.importapp.registro.Repositorio;

import com.importapp.registro.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/*
* Autor: Alfredo Loaiza
* Descripcion: Interaccion de la base de datos para manejo de persistencia de datos
* Fecha: 16/07/2023
 */

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    @Procedure("SP_ProductoInsert") 
    String insertSP(
        @Param("Nombre") String pNombre,
        @Param("Descripcion") String pDescripcion,
        @Param("TipoProducto") Integer pTipoProducto,
        @Param("Moneda") Integer pMoneda,
        @Param("Valor") Double pValor,
        @Param("Peso") Double pPeso,
        @Param("TipoMedidaPeso") Integer pTipoMedidaPeso,
        @Param("DimensionAncho") Double pDimensionAncho,
        @Param("DimensionAlto") Double pDimensionAlto,
        @Param("DimensionFondo") Double pDimensionFondo,
        @Param("TipoMedidaDimension") Integer pTipoMedidaDimension
    );
}
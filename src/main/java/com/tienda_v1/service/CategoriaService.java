package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import com.tienda_v1.domain.Producto;
import java.util.List;


public interface CategoriaService {
    public List<Producto> getCategorias(boolean activo);  
     // Se obtiene un Producto, a partir del id de un categoria
    public Producto getCategoria(Producto categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);

    public Categoria getCategoria(Categoria categoria);
}


package com.tienda_v1.controller;

import com.tienda_v1.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/listado")
    public String listado(Model model){
        var categorias
                = categoriaService.getCategorias(false);
        model.addAttribute("TotalCategorias",categorias);
        model.addAttribute(categorias.size());
        return "categoria/listado";
    }
}

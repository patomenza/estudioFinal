package com.estudio.proyectoFinal.controladores;

import com.estudio.proyectoFinal.entidades.Libro;
import com.estudio.proyectoFinal.servicios.LibroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private LibroServicio LibroServicio;
    
    /*
    @GetMapping("/")
    public String inicio() {
        return "index.html";
    }*/
    
    @GetMapping("/")
    public String index(ModelMap modelo) {

        List<Libro> LibrosActivos = LibroServicio.listarActivos();

        modelo.addAttribute("libros", LibrosActivos);

        return "index";
    }
    
}

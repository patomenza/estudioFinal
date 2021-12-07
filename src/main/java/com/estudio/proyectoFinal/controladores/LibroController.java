package com.estudio.proyectoFinal.controladores;

import com.estudio.proyectoFinal.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/libro")
public class LibroController {
    
    @Autowired
    private LibroServicio LibroServicio;
    
}

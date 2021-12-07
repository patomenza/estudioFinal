package com.estudio.proyectoFinal.servicios;

import com.estudio.proyectoFinal.entidades.Libro;
import com.estudio.proyectoFinal.repositorios.LibroRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio LibroRepositorio;
    
    @Transactional
    //GUARDA QUE EL METODO DEBERIA SER LIBRO NO VOID//
    public Libro guardar(String libro, Integer anio, Integer ejemplares, 
                        Integer ejemplaresPrestados, Integer ejemplaresRestantes,
                        boolean alta) throws Exception{
        
        validar(libro, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta);
        
        Libro entidad = new Libro();
        
        entidad.setLibro(libro);
        entidad.setanio(anio);
        entidad.setEjemplares(ejemplares);
        entidad.setEjemplaresPrestados(ejemplaresPrestados);
        entidad.setEjemplaresRestantes(ejemplaresRestantes);
        entidad.setAlta(alta);
        
        return LibroRepositorio.save(entidad);
    }
    
    @Transactional(readOnly = true)
    public List<Libro> listarActivos() {
        return LibroRepositorio.buscarActivos();
    }
    
    public void validar(String libro, Integer anio, Integer ejemplares, 
                        Integer ejemplaresPrestados, Integer ejemplaresRestantes,
                        boolean alta) throws Exception {

        if (libro == null || libro.isEmpty() || libro.contains("  ")) {
            throw new Exception();
        }

        if (anio == null || anio.equals(0)) {
            throw new Exception();
        }

        if (ejemplares == null || ejemplares.equals(0)) {
            throw new Exception();
        }

        if (ejemplaresPrestados == null || ejemplaresPrestados.equals(0)) {
            throw new Exception();
        }
        
        if (ejemplaresRestantes == null || ejemplaresRestantes.equals(0)) {
            throw new Exception();
        }
        if (alta == false) {
            throw new Exception();
        }
    }
    
}

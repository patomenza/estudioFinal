package com.estudio.proyectoFinal.repositorios;

import com.estudio.proyectoFinal.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {

    	@Query("SELECT a from Libro a WHERE a.alta = true ")
	public List<Libro> buscarActivos();
    
}

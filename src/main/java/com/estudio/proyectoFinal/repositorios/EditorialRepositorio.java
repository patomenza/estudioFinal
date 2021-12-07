package com.estudio.proyectoFinal.repositorios;

import com.estudio.proyectoFinal.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository <Editorial, Integer>{
    
}

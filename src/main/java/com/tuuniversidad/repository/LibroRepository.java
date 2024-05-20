package com.tuuniversidad.repository;

import com.tuuniversidad.models.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository() {
        libros.add(new Libro(1L, "El Quijote", "Miguel de Cervantes", "Francisco de Robles", 1605));
        libros.add(new Libro(2L, "Cien Años de Soledad", "Gabriel García Márquez", "Sudamericana", 1967));
 
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public Libro save(Libro libro) {
        libros.add(libro);
        return libro;
    }
}

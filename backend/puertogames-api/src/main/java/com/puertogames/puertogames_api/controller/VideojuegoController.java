package com.puertogames.puertogames_api.controller;
//importando
import com.puertogames.puertogames_api.model.Videojuego;
import com.puertogames.puertogames_api.repository.VideojuegoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/videjuego")
@CrossOrigin("*")//para que mi api reciba peticiones desde cualquier parte
public class VideojuegoController {
    private final VideojuegoRepository repo;

    public VideojuegoController(VideojuegoRepository repo){
        this.repo = repo;

    }

    @GetMapping
    public List<Videojuego> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Videojuego crear(@RequestBody Videojuego v){
        return repo.save(v);
    }

    @PutMapping("/{id}")
    public Videojuego actualizar(@PathVariable Long id, @RequestBody Videojuego v){
        v.setId(id);
        v.setTitulo(v.getTitulo());
        v.setPrecio(v.getPrecio());
        v.setStock(v.getStock());
        v.setPlataforma(v.getPlataforma());
        v.setGenero(v.getGenero());
        return repo.save(v);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        repo.deleteById(id);
    }




}

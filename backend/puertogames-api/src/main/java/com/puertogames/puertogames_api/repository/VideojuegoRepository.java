package com.puertogames.puertogames_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.puertogames.puertogames_api.model.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {
}

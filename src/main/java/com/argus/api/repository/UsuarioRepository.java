package com.argus.api.repository;

import com.argus.api.domain.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findById(Long id);
    Optional<Usuarios> findByCpf(String cpf);
}
package com.sena.adso2499719.adso2499719.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.adso2499719.adso2499719.entities.Grado;

@Repository

public interface GradoRepository extends JpaRepository<Grado, Long> {

}

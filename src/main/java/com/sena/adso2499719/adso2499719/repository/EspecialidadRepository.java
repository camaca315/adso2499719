package com.sena.adso2499719.adso2499719.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.adso2499719.adso2499719.entities.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository <Especialidad, Long> {

}

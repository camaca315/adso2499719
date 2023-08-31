package com.sena.adso2499719.adso2499719.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.adso2499719.adso2499719.entities.Aprendiz;

@Repository

public interface AprendizRepository extends JpaRepository <Aprendiz, Long>{

}

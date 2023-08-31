package com.sena.adso2499719.adso2499719.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grados")

public class Grado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombres", length = 100, nullable = false)
	private String nombre;
	
	@Column(name = "jornadas", nullable = false)
	private boolean jornada;
	
	@Column(name = "salones", length = 100, nullable = false)
	private String salon;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "update_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "delete_at")
	private LocalDateTime deleedAt;

}

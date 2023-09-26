package com.example.Ryan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ryan.entities.ClienteEntities;

public interface ClienteRepository extends JpaRepository <ClienteEntities, Long> {

}

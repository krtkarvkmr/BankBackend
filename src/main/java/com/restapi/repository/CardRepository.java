package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.CardDetails;

@Repository
public interface CardRepository extends JpaRepository<CardDetails, Integer> {

}

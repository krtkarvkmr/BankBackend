package com.restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails,Integer> {

	
}

package com.ams.apartment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.apartment.entity.Apartment;

@Repository
public interface ApartmentRepo extends JpaRepository<Apartment, Long>{

}

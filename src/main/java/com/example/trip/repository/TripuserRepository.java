package com.example.trip.repository;

import com.example.trip.entity.Tripuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TripuserRepository extends JpaRepository<Tripuser, String> {

    @Query("select t from Tripuser t where t.id = :id")
    public Tripuser findByTripuserId (String id);

    public Tripuser findByEmail(String email);



}

package com.example.trip.repository;

import com.example.trip.entity.TripHashtag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripHashtagRepository extends JpaRepository<TripHashtag, Long> {
}

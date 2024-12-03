package com.example.trip.repository;

import com.example.trip.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepositroy extends JpaRepository<Image, Long> {
}

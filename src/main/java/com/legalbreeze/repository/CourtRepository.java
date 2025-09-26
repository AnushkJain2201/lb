package com.legalbreeze.repository;

import com.legalbreeze.entity.Court;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Court, Integer> {
}

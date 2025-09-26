package com.legalbreeze.repository;

import com.legalbreeze.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Integer> {
}

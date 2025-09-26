package com.legalbreeze.repository;

import com.legalbreeze.entity.BidApplicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidApplicantRepository extends JpaRepository<BidApplicant, Integer> {
}

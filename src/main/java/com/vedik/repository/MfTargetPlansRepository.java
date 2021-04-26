package com.vedik.repository;

import com.vedik.entity.MfTargetPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MfTargetPlansRepository extends JpaRepository<MfTargetPlans, Long> {
}

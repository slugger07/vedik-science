package com.vedik.repository;

import com.vedik.entity.MfTargetSchemes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MfTargetSchemesRepository extends JpaRepository<MfTargetSchemes, Long> {
}

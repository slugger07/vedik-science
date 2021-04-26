package com.vedik.repository;

import com.vedik.entity.MfMissedTargetSip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MfMissedSipTargetSipRepository extends JpaRepository<MfMissedTargetSip, Long> {
}

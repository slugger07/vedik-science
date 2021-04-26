package com.vedik.repository;

import com.vedik.entity.MfTargetSchemes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MfTargetSchemesRepository extends JpaRepository<MfTargetSchemes, Long> {

    MfTargetSchemes findByRiskAndRank5Years(String risk, Integer rank);

    MfTargetSchemes findByRiskAndRank3Years(String risk, Integer rank);

    MfTargetSchemes findByRiskAndRank2Years(String risk, Integer rank);

    MfTargetSchemes findByRiskAndRank1Years(String risk, Integer rank);

}

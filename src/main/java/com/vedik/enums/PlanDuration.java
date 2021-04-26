package com.vedik.enums;

import com.vedik.entity.MfTargetSchemes;
import com.vedik.repository.MfTargetSchemesRepository;

public enum PlanDuration {

    FIVE_YEARS (5) {
        @Override
        public MfTargetSchemes mfTargetSchemes(MfTargetSchemesRepository mfTargetSchemesRepository, String risk,
                                               Integer rank) {
            return mfTargetSchemesRepository.findByRiskAndRank5Years(risk, rank);
        }
    },
    THREE_YEARS (3) {
        @Override
        public MfTargetSchemes mfTargetSchemes(MfTargetSchemesRepository mfTargetSchemesRepository, String risk,
                                               Integer rank) {
            return mfTargetSchemesRepository.findByRiskAndRank3Years(risk, rank);
        }
    },
    TWO_YEARS (2) {
        @Override
        public MfTargetSchemes mfTargetSchemes(MfTargetSchemesRepository mfTargetSchemesRepository, String risk,
                                               Integer rank) {
            return mfTargetSchemesRepository.findByRiskAndRank2Years(risk, rank);
        }
    },

    ONE_YEAR (1) {
        @Override
        public MfTargetSchemes mfTargetSchemes(MfTargetSchemesRepository mfTargetSchemesRepository, String risk,
                                               Integer rank) {
            return mfTargetSchemesRepository.findByRiskAndRank1Years(risk, rank);
        }
    };

    int duration;

    PlanDuration (int duration) {
        this.duration = duration;
    }

    public abstract MfTargetSchemes mfTargetSchemes(MfTargetSchemesRepository mfTargetSchemesRepository,
                                                    String risk, Integer rank);

    public static PlanDuration getPlanDuration(int durationInYears) {
        if (durationInYears >= 5) {
            return FIVE_YEARS;
        }
        if (durationInYears >=3) {
            return THREE_YEARS;
        }
        if (durationInYears == 2) {
            return TWO_YEARS;
        }
        return ONE_YEAR;
    }
}

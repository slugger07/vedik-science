package com.vedik.enums;

import com.vedik.config.GoalConfig;
import com.vedik.dto.ConfigDto;

import java.util.List;

public enum PlanRisk {

    HIGH {
        @Override
        public List<ConfigDto> getConfigDtoList() {
            return GoalConfig.HIGH_RISK_CONFIGS;
        }
    },

    MODERATE{
        @Override
        public List<ConfigDto> getConfigDtoList() {
            return GoalConfig.MODERATE_RISK_CONFIGS;
        }
    },

    LOW{
        @Override
        public List<ConfigDto> getConfigDtoList() {
            return GoalConfig.LOW_RISK_CONFIGS;
        }
    };

    public abstract List<ConfigDto> getConfigDtoList();
}

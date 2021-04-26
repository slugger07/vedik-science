package com.vedik.config;

import com.vedik.dto.ConfigDto;

import java.util.Arrays;
import java.util.List;

public class GoalConfig {

    public static final List<ConfigDto> HIGH_RISK_CONFIGS = Arrays.asList(
            new ConfigDto("Very High", 1, 20.0),
            new ConfigDto("High", 1, 20.0),
            new ConfigDto("High", 2, 15.0),
            new ConfigDto("Moderately High", 1, 35.0),
            new ConfigDto("Moderate", 1, 10.0));


    public static final List<ConfigDto> MODERATE_RISK_CONFIGS = Arrays.asList(
            new ConfigDto("High", 1, 5.0),
            new ConfigDto("Moderately High", 1, 30.0),
            new ConfigDto("Moderate", 1, 30.0),
            new ConfigDto("Moderate", 2, 20.0),
            new ConfigDto("Low", 1, 15.0));

    public static final List<ConfigDto> LOW_RISK_CONFIGS = Arrays.asList(
            new ConfigDto("Moderate", 1, 20.0),
            new ConfigDto("Low to moderate", 1, 30.0),
            new ConfigDto("Low to moderate", 2, 25.0),
            new ConfigDto("Low", 1, 15.0),
            new ConfigDto("Low", 2, 10.0));


}

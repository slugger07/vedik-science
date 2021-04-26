package com.vedik.service;

import com.vedik.dto.GetPlanRequestDto;
import com.vedik.dto.GetPlanResponseDto;
import com.vedik.dto.SchemeDetailsDto;
import com.vedik.entity.MfTargetSchemes;
import com.vedik.enums.GoalType;
import com.vedik.enums.PlanDuration;
import com.vedik.enums.PlanRisk;

import java.util.Map;

public interface MfTargetPlansService {

    GetPlanResponseDto getPlanResponseDto(GetPlanRequestDto getPlanRequestDto);

    Map<MfTargetSchemes, Double> getSchemeDetails(PlanRisk planRisk, PlanDuration planDuration);
}

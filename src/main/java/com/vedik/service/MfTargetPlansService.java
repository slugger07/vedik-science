package com.vedik.service;

import com.vedik.dto.GetPlanRequestDto;
import com.vedik.dto.GetPlanResponseDto;

public interface MfTargetPlansService {

    GetPlanResponseDto getPlanResponseDto(GetPlanRequestDto getPlanRequestDto);
}

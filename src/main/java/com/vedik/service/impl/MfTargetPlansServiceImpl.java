package com.vedik.service.impl;

import com.vedik.dto.ConfigDto;
import com.vedik.dto.GetPlanRequestDto;
import com.vedik.dto.GetPlanResponseDto;
import com.vedik.dto.SchemeDetailsDto;
import com.vedik.entity.MfTargetSchemes;
import com.vedik.enums.GoalType;
import com.vedik.enums.PlanDuration;
import com.vedik.enums.PlanRisk;
import com.vedik.repository.MfTargetSchemesRepository;
import com.vedik.service.MfTargetPlansService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MfTargetPlansServiceImpl implements MfTargetPlansService {

    @Autowired
    private MfTargetSchemesRepository mfTargetSchemesRepository;


    @Override
    public GetPlanResponseDto getPlanResponseDto(GetPlanRequestDto getPlanRequestDto) {

        return null;
    }

    @Override
    public Map<MfTargetSchemes, Double> getSchemeDetails(
            PlanRisk planRisk, PlanDuration planDuration ) {

        List<ConfigDto> configDtoList = planRisk.getConfigDtoList();
        return configDtoList.stream().collect(Collectors.toMap(x -> planDuration.mfTargetSchemes(
                        mfTargetSchemesRepository, x.getRisk(), x.getRank()), ConfigDto::getPercentage));
    }


}

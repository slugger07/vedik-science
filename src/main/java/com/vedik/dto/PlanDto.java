package com.vedik.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedik.enums.PlanRisk;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanDto {

    private String planId;

    private String userAccountId;

    @Builder.Default
    private Long lumpsumInvestmentRequiredPerMonth = 0L;

    @Builder.Default
    private Long sipInvestmentRequiredPerMonth = 0L;

    private PlanRisk planRisk;

    @Builder.Default
    List<SchemeDetailsDto> schemeDetailsDtoList = new ArrayList<>();
}

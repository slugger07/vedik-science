package com.vedik.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vedik.enums.GoalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPlanRequestDto {

    private String userAccountId;

    private Integer duration;

    @Builder.Default
    private Long initialLumpsumInvestment = 0L;

    private Long targetAmount;

    private GoalType planType;
}

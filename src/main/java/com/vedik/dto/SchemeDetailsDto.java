package com.vedik.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class SchemeDetailsDto {

    private String schemeName;

    private String category;

    private String subCategory;

    private Long lumpsumInvestment;

    private Long monthlyInvestment;

    private Double percentageOfAllocation;
}

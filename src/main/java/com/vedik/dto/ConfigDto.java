package com.vedik.dto;

public class ConfigDto {

    private String risk;

    private Integer rank;

    private Double percentage;

    public ConfigDto(String risk, Integer rank, Double percentage) {
        this.risk = risk;
        this.rank = rank;
        this.percentage = percentage;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}

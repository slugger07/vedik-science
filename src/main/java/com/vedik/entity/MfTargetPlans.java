package com.vedik.entity;


import lombok.Data;

import java.sql.Date;
import javax.persistence.Entity;

@Entity(name = "mf_target_plans")
@Data
public class MfTargetPlans extends BaseEntity {

    private String userAccountId;

    private String planId;

    private Long targetAmount;

    private Date targetDate;

    private Long initialLumpsumInvestment;

    private Long sipInvestment;

    private byte[] requestContext;

    private String risk;

}

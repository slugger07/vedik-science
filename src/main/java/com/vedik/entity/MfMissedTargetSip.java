package com.vedik.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "mf_missed_target_sips")
@Data
public class MfMissedTargetSip extends BaseEntity {

    private String userAccountId;

    private String planId;

    private String growwSipId;
}

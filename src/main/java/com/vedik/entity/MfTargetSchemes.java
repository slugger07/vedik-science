package com.vedik.entity;


import lombok.Data;

import javax.persistence.Entity;

@Entity(name = "mf_target_schemes")
@Data
public class MfTargetSchemes extends BaseEntity {

    private String schemeCode;

    private String isin;

    private String schemeName;

    private String fundType;

    private String categoryName;

    private String category;

    private String subCategory;

    private String risk;

    private Integer rank10Years;

    private Integer rank5Years;

    private Integer rank3Years;

    private Integer rank2Years;

    private Integer rank1Years;
}

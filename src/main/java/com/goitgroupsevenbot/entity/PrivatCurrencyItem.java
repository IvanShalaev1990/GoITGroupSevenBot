package com.goitgroupsevenbot.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *DTO object.
 * @author Shalaiev Ivan
 * @version 1.0.0 19.10.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonTypeName("PrivatCurrencyItem")
public class PrivatCurrencyItem {
    private String ccy;
    private String base_ccy;
    private double buy;
    private double sale;
}

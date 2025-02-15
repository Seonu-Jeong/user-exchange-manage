package com.sparta.currency_user.dto;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ExchangeTotalInfoDto {

    private final Long count;

    private final BigDecimal totalAmountInKrw;

    public ExchangeTotalInfoDto(Long count, BigDecimal totalAmountInKrw) {
        this.count = count;
        this.totalAmountInKrw = totalAmountInKrw;
    }
}

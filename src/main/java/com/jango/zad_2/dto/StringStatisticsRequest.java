package com.jango.zad_2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StringStatisticsRequest {

    private String text;

    private String combination;
}

package com.jango.zad_2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StringStatisticsResponse {

    private Integer uppercaseLetters;

    private Integer lowercaseLetters;

    private Integer digits;

    private Integer specialCharacters;

    private Integer combinationHits;
}
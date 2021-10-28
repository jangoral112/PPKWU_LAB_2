package com.jango.zad_2.service;

import com.jango.zad_2.dto.StringStatisticsRequest;
import com.jango.zad_2.dto.StringStatisticsResponse;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    public StringStatisticsResponse stringStatistics(StringStatisticsRequest request) {
        return StringStatisticsResponse.builder().build();
    }
}

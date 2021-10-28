package com.jango.zad_2.controller;

import com.jango.zad_2.dto.StringStatisticsRequest;
import com.jango.zad_2.dto.StringStatisticsResponse;
import com.jango.zad_2.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @PostMapping("/statistics}")
    public ResponseEntity<StringStatisticsResponse> stringStatistics(@RequestBody StringStatisticsRequest request) {
        return ResponseEntity.ok(statisticsService.stringStatistics(request));
    }
}

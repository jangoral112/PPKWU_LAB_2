package com.jango.zad_2.service;

import com.jango.zad_2.dto.StringStatisticsRequest;
import com.jango.zad_2.dto.StringStatisticsResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class StatisticsService {

    public StringStatisticsResponse stringStatistics(StringStatisticsRequest request) {
        var responseBuilder  = StringStatisticsResponse.builder();

        String text = request.getText();

        Long uppercaseCount = countUppercase(text);
        Long lowercaseCount = countLowercase(text);
        Long digitsCount = countDigits(text);
        Long spacesCount = countSpaces(text);
        Long specialCharCount = text.length() - uppercaseCount - lowercaseCount - digitsCount - spacesCount;

        Long combinationCount = countCombination(text, request.getCombination());

        responseBuilder.uppercaseLetters(uppercaseCount);
        responseBuilder.lowercaseLetters(lowercaseCount);
        responseBuilder.digits(digitsCount);
        responseBuilder.specialCharacters(specialCharCount);
        responseBuilder.combinationHits(combinationCount);

        return responseBuilder.build();
    }

    private long countUppercase(String string) {
        return string.chars().filter(Character::isUpperCase).count();
    }

    private long countLowercase(String string) {
        return string.chars().filter(Character::isLowerCase).count();
    }

    private long countDigits(String string) {
        return string.chars().filter(Character::isDigit).count();
    }

    private long countSpaces(String string) {
        return string.chars().filter(Character::isWhitespace).count();
    }

    private long countCombination(String string, String combination) {
        return StringUtils.countOccurrencesOf(string, combination);
    }
}

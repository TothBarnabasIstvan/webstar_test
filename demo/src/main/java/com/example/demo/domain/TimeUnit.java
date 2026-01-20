package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TimeUnit {

    YEAR("year", 31536000),
    DAY("day", 86400),
    HOUR("hour", 3600),
    MINUTE("minute", 60),
    SECOND("second", 1);

    private final String label;
    private final int seconds;

}

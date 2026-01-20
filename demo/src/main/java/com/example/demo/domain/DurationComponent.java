package com.example.demo.domain;

import com.example.demo.domain.TimeUnit;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DurationComponent {

    private final TimeUnit unit;
    private final int value;
}

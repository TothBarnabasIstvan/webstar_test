package com.example.demo.decomposer;

import com.example.demo.domain.DurationComponent;
import com.example.demo.domain.TimeUnit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DurationDecomposer {

    public List<DurationComponent> decompose(int seconds) {
        List<DurationComponent> components = new ArrayList<>();

        for (TimeUnit unit : TimeUnit.values()) {
            int value = seconds / unit.getSeconds();
            if (value > 0) {
                components.add(new DurationComponent(unit, value));
                seconds %= unit.getSeconds();
            }
        }

        return components;
    }
}

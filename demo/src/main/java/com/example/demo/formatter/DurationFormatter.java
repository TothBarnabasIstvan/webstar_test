package com.example.demo.formatter;

import com.example.demo.domain.DurationComponent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DurationFormatter {

    public String format(List<DurationComponent> components) {
        if (components.isEmpty()) return "now";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < components.size(); i++) {
            if (i > 0) {
                sb.append(i == components.size() - 1 ? " and " : ", ");
            }
            sb.append(formatComponent(components.get(i)));
        }

        return sb.toString();
    }

    private String formatComponent(DurationComponent component) {
        int value = component.getValue();
        String unit = component.getUnit().getLabel();
        return value + " " + unit + (value > 1 ? "s" : "");
    }
}


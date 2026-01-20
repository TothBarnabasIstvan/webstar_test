package com.example.demo.controller;

import com.example.demo.dto.DurationDTO;
import com.example.demo.dto.DurationSaveDTO;
import com.example.demo.entity.Duration;
import com.example.demo.service.DurationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/duration")
@RequiredArgsConstructor
public class DurationController {

    private final DurationService durationService;

    @GetMapping
    public List<DurationDTO> getAll() {
        return durationService.findAll();
    }

    @PostMapping
    public DurationDTO add(@Valid @RequestBody DurationSaveDTO dto) {
        return this.durationService.save(dto);
    }
}

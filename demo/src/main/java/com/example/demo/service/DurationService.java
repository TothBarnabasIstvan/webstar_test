package com.example.demo.service;

import com.example.demo.decomposer.DurationDecomposer;
import com.example.demo.domain.DurationComponent;
import com.example.demo.formatter.DurationFormatter;
import com.example.demo.dto.DurationDTO;
import com.example.demo.dto.DurationSaveDTO;
import com.example.demo.entity.Duration;
import com.example.demo.mapper.DurationMapper;
import com.example.demo.repository.DurationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DurationService {

    private final DurationRepository durationRepository;
    private final DurationMapper durationMapper;
    private final DurationFormatter durationFormatter;
    private final DurationDecomposer durationDecomposer;

    public List<DurationDTO> findAll() {
        return this.durationRepository.findAll().stream().map(this.durationMapper::toDTO).toList();
    }

    public DurationDTO save(DurationSaveDTO dto) {
        Duration duration = this.durationMapper.toEntity(dto);
        List<DurationComponent> components = this.durationDecomposer.decompose(dto.getSeconds());
        String formatted = this.durationFormatter.format(components);
        duration.setFormattedResult(formatted);
        this.durationRepository.save(duration);

        return this.durationMapper.toDTO(duration);
    }
}

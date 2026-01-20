package com.example.demo.mapper;

import com.example.demo.dto.DurationDTO;
import com.example.demo.dto.DurationSaveDTO;
import com.example.demo.entity.Duration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DurationMapper {

    @Mapping(source = "formattedResult", target = "result")
    DurationDTO toDTO(Duration entity);

    Duration toEntity(DurationSaveDTO dto);
}

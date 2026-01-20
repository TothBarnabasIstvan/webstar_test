package com.example.demo.repository;

import com.example.demo.entity.Duration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DurationRepository {

    private final List<Duration> store = new ArrayList<>();

    public void save(Duration entity) {
        store.add(entity);
    }

    public List<Duration> findAll() {
        return store;
    }
}

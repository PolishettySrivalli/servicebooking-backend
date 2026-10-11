package com.quickserve.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.quickserve.model.ServiceItem;
import com.quickserve.repository.ServiceItemRepository;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    private final ServiceItemRepository repository;

    public ServiceController(ServiceItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ServiceItem> getServices() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ServiceItem getService(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found"));
    }
}

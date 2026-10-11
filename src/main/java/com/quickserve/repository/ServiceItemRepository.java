package com.quickserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quickserve.model.ServiceItem;

public interface ServiceItemRepository extends JpaRepository<ServiceItem, Long> {
}

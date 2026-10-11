package com.quickserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quickserve.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

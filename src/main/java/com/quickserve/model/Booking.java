package com.quickserve.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String customerEmail;

    @Column(nullable = false)
    private String phone;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "service_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ServiceItem service;

    @Column(nullable = false)
    private LocalDate bookingDate;

    @Column(nullable = false)
    private LocalTime bookingTime;

    @Column(nullable = false, length = 1000)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookingStatus status = BookingStatus.PENDING;

    public Long getId() { return id; }
    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getPhone() { return phone; }
    public ServiceItem getService() { return service; }
    public LocalDate getBookingDate() { return bookingDate; }
    public LocalTime getBookingTime() { return bookingTime; }
    public String getAddress() { return address; }
    public BookingStatus getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setService(ServiceItem service) { this.service = service; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }
    public void setBookingTime(LocalTime bookingTime) { this.bookingTime = bookingTime; }
    public void setAddress(String address) { this.address = address; }
    public void setStatus(BookingStatus status) { this.status = status; }
}

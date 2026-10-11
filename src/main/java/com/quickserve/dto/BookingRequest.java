package com.quickserve.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.*;

public class BookingRequest {

    @NotBlank
    private String customerName;

    @NotBlank
    @Email
    private String customerEmail;

    @NotBlank
    private String phone;

    @NotNull
    private Long serviceId;

    @NotNull
    @FutureOrPresent
    private LocalDate bookingDate;

    @NotNull
    private LocalTime bookingTime;

    @NotBlank
    private String address;

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getPhone() { return phone; }
    public Long getServiceId() { return serviceId; }
    public LocalDate getBookingDate() { return bookingDate; }
    public LocalTime getBookingTime() { return bookingTime; }
    public String getAddress() { return address; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setServiceId(Long serviceId) { this.serviceId = serviceId; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }
    public void setBookingTime(LocalTime bookingTime) { this.bookingTime = bookingTime; }
    public void setAddress(String address) { this.address = address; }
}

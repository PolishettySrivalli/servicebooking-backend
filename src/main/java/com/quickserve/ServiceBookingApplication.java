package com.quickserve;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.quickserve.model.ServiceItem;
import com.quickserve.repository.ServiceItemRepository;

@SpringBootApplication
public class ServiceBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBookingApplication.class, args);
    }

    @Bean
    CommandLineRunner seedServices(ServiceItemRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new ServiceItem("Home Cleaning",
                        "Professional cleaning for rooms, kitchens and living spaces.",
                        799.0, 90, "⌂"));
                repository.save(new ServiceItem("AC Service",
                        "AC inspection, cleaning and basic maintenance by a technician.",
                        599.0, 60, "❄"));
                repository.save(new ServiceItem("Plumbing",
                        "Reliable plumbing assistance for common household problems.",
                        449.0, 60, "⚒"));
                repository.save(new ServiceItem("Electrician",
                        "Electrical repair and installation support at your location.",
                        499.0, 60, "⚡"));
                repository.save(new ServiceItem("Salon at Home",
                        "Convenient grooming and beauty services at home.",
                        699.0, 75, "✦"));
                repository.save(new ServiceItem("Appliance Repair",
                        "Inspection and repair support for household appliances.",
                        549.0, 60, "▣"));
            }
        };
    }
}

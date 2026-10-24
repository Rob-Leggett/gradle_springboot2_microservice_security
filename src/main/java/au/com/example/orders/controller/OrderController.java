package au.com.example.orders.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import au.com.example.orders.model.Order;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Order Service", description = "All apis relating to orders")
@RestController
public class OrderController {

    private final AtomicLong counter = new AtomicLong();

    @Operation(summary = "List orders")
    @GetMapping("/orders")
    public List<Order> orders() {
        final List<Order> orders = new ArrayList<>();

        orders.add(new Order(counter.incrementAndGet()));

        return orders;
    }
}

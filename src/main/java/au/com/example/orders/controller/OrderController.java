package au.com.example.orders.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import au.com.example.orders.model.Order;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class OrderController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/orders")
    public List<Order> orders() {
        final List<Order> orders = new ArrayList<>();

        orders.add(new Order(counter.incrementAndGet()));

        return orders;
    }
}

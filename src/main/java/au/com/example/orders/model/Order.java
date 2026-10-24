package au.com.example.orders.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "An order")
public record Order(long id) {
}

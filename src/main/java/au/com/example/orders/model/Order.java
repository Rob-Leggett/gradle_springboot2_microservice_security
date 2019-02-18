package au.com.example.orders.model;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Order {

    private final long id;

    public Order(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

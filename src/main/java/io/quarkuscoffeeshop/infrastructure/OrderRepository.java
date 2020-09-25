package io.quarkuscoffeeshop.infrastructure;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkuscoffeeshop.counter.domain.Order;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderRepository implements PanacheMongoRepository<Order> {
}

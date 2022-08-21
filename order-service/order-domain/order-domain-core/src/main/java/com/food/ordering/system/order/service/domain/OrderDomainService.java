package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

import java.util.List;

/**
 * 도메인 자체(Order, Restaurant) 를 주입받아, 해당 도메인의 Critical 한 비즈니스 로직만 호출한다.
 * 그러므로 어떠한 OrderService, RestaurantService 들을 의존하지 않는다.
 */
public interface OrderDomainService {
    /**
     * 비즈니스 메서드를 호출하여 주문을 확인하고 시작한다.
     */
    OrderCreatedEvent validateAndInitializeOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}

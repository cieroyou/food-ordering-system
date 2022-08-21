package com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

/**
 * restaurant service application 에 승인 요청한 응답메세지에 대한 이벤트 리스너
 * 구현부들은 다른 Bounded Context 의 Domain Event 에서 trigger 된다.
 */
public interface RestaurantApprovalResponseMessageListerner {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}

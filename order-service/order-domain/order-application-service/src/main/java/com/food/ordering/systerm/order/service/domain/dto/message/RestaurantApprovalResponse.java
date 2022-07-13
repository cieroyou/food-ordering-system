package com.food.ordering.systerm.order.service.domain.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String restaurantId;
    private String createdAt;
    private OrderApprovalStatus orderApprovalStatus;
    private List<String> failureMessages;

}

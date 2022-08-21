package com.food.ordering.system.order.service.domain.ports.input.message.listener.payment;


import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

/**
 * payment service application 에 요청한 결제요청에 대한 응답 메세지 리스너
 * 구현부들은 다른 Bounded Context 의 Domain Event 에서 trigger 된다.
 */
public interface PaymentResponseMessageListener {

    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}

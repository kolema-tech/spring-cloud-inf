package com.kolema.orderms.entity;

import com.kolema.orderms.valueobject.OrderStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhenpeng
 */
@Getter
@Setter
public class Order {
    private String orderId;
    private OrderStatus orderStatus;
}

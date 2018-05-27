package com.kolema.orderms.controller;

import com.kolema.commonbusiness.Currency;
import com.kolema.orderms.service.MpgsService;
import com.kolema.orderms.service.mpgsmodel.AuthRequest;
import com.kolema.orderms.service.mpgsmodel.CardNumberRequest;
import com.kolema.orderms.service.mpgsmodel.OrderRequest;
import com.kolema.orderms.service.mpgsmodel.PaymentResultResponse;
import io.swagger.annotations.ApiOperation;
import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/order/pay")
public class PayController {

    @Autowired
    MpgsService mpgsService;

    @ApiOperation(value = "支付")
    @PostMapping("/auth")
    public PaymentResultResponse pay() {

        //Arrange
        var authRequestDTO = new AuthRequest(
                new CardNumberRequest("5123458", 5, 22, "123"),
                new OrderRequest(new BigDecimal(100), Currency.HKD));

        authRequestDTO.setOrderId("123455");
        authRequestDTO.setTransactionId("22222");

        return mpgsService.authorize(authRequestDTO);
    }
}

package com.kolema.mpgsms.controller;

import com.kolema.mpgsms.controller.request.AuthRequest;
import com.kolema.mpgsms.controller.response.PaymentResultResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/mpgs/payment/")
public class PaymentController {
    /**
     * 预授权API
     * @param authRequestDTO
     * @return
     */
    @ApiOperation(value = "預授權")
    @PostMapping(value = "auth")
    public PaymentResultResponse authorize(@Valid @RequestBody AuthRequest authRequestDTO) {
        PaymentResultResponse resultResponse = new PaymentResultResponse();
        resultResponse.setIsSuccess(true);
        return resultResponse;
    }
}

package com.kolema.orderms.service;

import com.kolema.orderms.config.MsService;
import com.kolema.orderms.service.mpgsmodel.AuthRequest;
import com.kolema.orderms.service.mpgsmodel.PaymentResultResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Service
@FeignClient(name = MsService.MPGS_MS)
public interface MpgsService {

    @PostMapping(value = "api/mpgs/payment/auth")
    PaymentResultResponse authorize(@Valid @RequestBody AuthRequest authRequestDTO);
}

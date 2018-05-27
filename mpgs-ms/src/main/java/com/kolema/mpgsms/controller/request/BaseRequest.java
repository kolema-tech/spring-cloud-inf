package com.kolema.mpgsms.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author zhenpeng
 */
@Getter
@Setter
@ToString
@ApiModel(value = "基礎的請求")
public class BaseRequest {

    @ApiModelProperty(value = "MPG訂單號")
    @NotNull
    private String orderId;

    @ApiModelProperty(value = "交易號Id")
    @NotNull
    private String transactionId;

    @ApiModelProperty(value = "3D Id")
    private String secureId;
}

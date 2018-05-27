package com.kolema.orderms.service.mpgsmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Summary:
 *
 * @author zhenpeng
 */
@ApiModel(value = "預授權請求DTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthRequest extends BaseRequest {

    @ApiModelProperty(value = "卡信息")
    @NotNull
    private CardNumberRequest cardNumberRequest;

    @ApiModelProperty(value = "訂單信息")
    @NotNull
    private OrderRequest orderRequest;
}

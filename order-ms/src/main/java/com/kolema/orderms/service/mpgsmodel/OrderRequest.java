package com.kolema.orderms.service.mpgsmodel;

import com.kolema.commonbusiness.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


/**
 * Summary:
 *
 * @author zhenpeng
 */
@ApiModel(value = "訂單信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    @ApiModelProperty(value = "金額", required = true)
    @NotNull
    private BigDecimal amount;

    @ApiModelProperty(value = "幣種")
    private Currency currency = Currency.HKD;
}

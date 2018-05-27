package com.kolema.orderms.service.mpgsmodel;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhenpeng
 */
@ApiModel(value = "基礎的響應")
@Data
@ToString
public class PaymentResultResponse {

    @ApiModelProperty(value = "銀行授權號")
    private String approvalCode;

    @ApiModelProperty(value = "最終是否成功")
    private Boolean isSuccess;

    @ApiModelProperty(value = "交易金額")
    private BigDecimal amount;

    @ApiModelProperty(value = "交易時間")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale = "zh", timezone = "GMT+8")
    private Date transactionTime = new Date();
}

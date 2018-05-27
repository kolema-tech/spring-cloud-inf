package com.kolema.mpgsms.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Summary:
 *
 * @author zhenpeng
 */
@ApiModel(value = "信用卡")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardNumberRequest {

    @ApiModelProperty(value = "16卡號")
    @Pattern(regexp = "\\d{16}")
    @JsonIgnore
    private String cardNo;

    @ApiModelProperty(value = "有效期月", required = true)
    @NotNull
    @Range(min = 1, max = 12)
    private Integer month;

    @ApiModelProperty(value = "有效期年", required = true)
    @NotNull
    @Range(min = 0, max = 99)
    private Integer year;

    @ApiModelProperty(value = "安全碼/CVV")
    @JsonIgnore
    private String securityCode;
}

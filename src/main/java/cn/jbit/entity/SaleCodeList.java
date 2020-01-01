package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by DELL on 2019-10-12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleCodeList {
    private Integer id;
    private String buyer;//买方
    private String saleNumber;//销售单号
    private Integer transportLicenseId;//运输证id
    private Double saleMoney;//销售金额
}

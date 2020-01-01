package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hp on 2019/10/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//树材单价明细表
public class WoodPriceDetai {
    private Integer id;//id
    private Integer unitPriceListId;//单价表
    private Integer wood;//树种
    private Integer level;//等级
    private Double length;//长度
    private Double cal;//口径
    private Double unitPrice;//单价
}

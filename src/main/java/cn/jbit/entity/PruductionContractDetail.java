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
//树材生产合同明细表
public class PruductionContractDetail {
    private Integer id;//id
    private String contractCode;//合同编号
    private String project;//项目
    private String unit;//单位
    private Double unitPrice;//单价
}

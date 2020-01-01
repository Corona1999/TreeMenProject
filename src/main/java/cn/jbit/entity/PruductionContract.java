package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by hp on 2019/10/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//树材生产合同表
public class PruductionContract {
    private Integer id;//id
    private String contractCode;//唯一，合同编号
    private Integer licenseId;//外键，采伐许可证id
    private String partyBUnit;//乙方单位
    private Double productionWageUnitPrice;//生产工资单价
    private Date contractSigningTime;//合同签订时间
    private String pathOfContract;//合同存放路径
}

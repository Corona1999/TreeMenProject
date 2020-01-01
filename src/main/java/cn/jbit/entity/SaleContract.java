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
//树材销售合同表
public class SaleContract {
    private Integer id;//id
    private String contractNumber;//唯一，合同编号
    private String partyBUnit;//乙方单位
    private Double discount;//销售折扣
    private Date contractSigningTime;//合同签订时间
    private String pathOfContract;//合同存放路径
}

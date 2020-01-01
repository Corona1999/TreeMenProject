package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 生产工程结算表
 */
public class ProjectSettlement {
    private Integer id;
    private Integer nextUser;//下一个审核人
    private String contactNumber;//合同编号
    private float workerPay;//工程结算金额
    private float advanceTotalMoney;//预支总金额
    private float penalSum;//罚款金额
    private float watingForPay;//需支付金额
    private Date settlementTime;//结算时间
    private String partyB;//乙方单位代表
    private Integer acheckStatus;//审核状态
}

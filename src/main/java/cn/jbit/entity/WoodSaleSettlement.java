package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 树材销售结算表
 */
public class WoodSaleSettlement {
    private Integer id;
    private Integer nextCherker;//下个审核人
    private String customer;//客户
    private Date settlementTime;//结算时间
    private float money;//金额
    private float totalVolume;//总材积
    private Integer checkStatus;//审核状态
}

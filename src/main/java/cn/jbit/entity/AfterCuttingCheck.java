package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 伐后验收表
 */
public class AfterCuttingCheck {
    private Integer id;
    private String cuttingAreaDesignNumber;//伐区调查规划设计号
    private Integer licenseld;//采伐证id
    private Integer colligationScore;//扣款金额
    private String checker;//检查验收人员
    private Date checkTime;//检查验收时间
    private String pathOfAttach;//附件路径

}

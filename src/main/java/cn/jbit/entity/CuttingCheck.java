package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 伐中检查表
 */
public class CuttingCheck {
    private Integer id;
    private String designSheetNumbe;//设计书编号
    private Integer licenseld;//采伐证id
    private String cuttingApplicant;//采伐申请人
    private String checker;//检查人
    private Date checkTime;//检查时间
    private String pathOfAttach;//附件路径
}

package cn.jbit.entity;

/**
 * Created by Black.Lee on 2019/10/12.
 * 伐前拨交表
 */

import java.util.Date;


public class PayBeforeCutting {
    private Integer id;
    private Integer licenseld;//采伐证id
    private Date allocateTime;//拨交时间
    private String grasslandUserOwner;//林权所有者代表
    private String jobDesigner;//作业设计者代表
    private String cuttingOperators;//采伐经办者
    private String logger;//采伐者代表
    private String pathOfAttach;//附件路径
}

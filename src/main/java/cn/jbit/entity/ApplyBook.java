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
//申请书表
public class ApplyBook {
    private Integer id; //id
    private String cuttingAreaCode;//伐区调查设计书理由
    private String applyCuttingAreaReason;    // 申请伐区理由
    private String cuttingAreaApprovalNumber;//伐区规划审批号
    private String grasslandUseCode;//林权证编号
    private String grasslandUseTeam;//林权林班
    private String largeTream;//大班
    private String smallTream;//小班
    private String township;//乡
    private String village;//村
    private String inputtingQuarter;//建档林班
    private String large;//大班
    private String small;//小班
    private String mountainName;//山名
    private String east;//东至
    private String west;//西至
    private String north;//北至
    private String south;//南至
    private Integer forestCategory;//林种
    private Integer mainTree;//主要树种
    private Integer standOrigin;//林分起源
    private Double cuttingAge;//伐区年龄
    private String crownDensity;//郁闭度
    private  Double volume;//蓄积量
    private Double slope;//坡度
    private String slopePosition;//坡位
    private String slopeTo;//坡向
    private String businessTypeName;//经营类型名称
    private String code;//代码
    private String rareName;//珍稀树树名称
    private Integer cuttingType;//采伐类型
    private Integer cuttingMode;//采伐方式
    private Double cuttingArea;//采伐面积
    private Double cuttigDuty;//采伐强度
    private Date startCuttingTime;//开始采伐期限
    private Date endCuttingTime;//非空，结束采伐期限
    private String updateWood;//更新树种
    private Double updateArea;//更新面积
    private  String updateMode;//更新方式
    private Date   updateTime;//更新时间
    private String updateUnit;//更新单位
    private Date createTimeOfApplication;//申请书创建时间

}

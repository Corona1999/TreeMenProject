package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by DELL on 2019-10-12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WoodSizeList {
    private Integer id;
    private String checkSizeCode;//检尺码单变好
    private String ForwardUnit;//发货单位
    private String grasslandUnit;//林权单位
    private String cuttingLicenseCode;//采伐证印刷号
    private String checkInformCode;//检验通知单号
    private String receiveUnit;//收获单位
    private String checkPlace;//检验地点
    private Date startTransTime;//运输开始时间
    private Date endTransTime;//运输结束时间
    private Date startEffectTime;//有效开始时间
    private Date endEffectTime;//有效结束时间
    private String TransportCode;//车船号
    private Integer totalRoot;//合计根数
    private Double totalStere;//合计立方米
    private String checker;//检验员
    private String recorder;//记录员
    private String attachmentPath;//附件路径
}

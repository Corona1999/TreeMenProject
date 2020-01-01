package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by DELL on 2019-10-12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WoodCheckSizeDetail {
    private Integer id;
    private String checkSizeCode;//检尺码单编号
    private Integer wood;//树材种
    private Integer level;//等级
    private Double length;//检尺长度
    private Double cal;//检尺口径
    private Double woodVolume;//材积
    private Integer root;//根数
}

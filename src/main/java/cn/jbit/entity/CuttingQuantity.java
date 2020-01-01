package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hp on 2019/10/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//采伐数量表
public class CuttingQuantity {
    private Integer id;//id
    private Integer applybookId;//申请书id
    private Integer woodId;//树种-字典表
    private Integer specificWood;//具体树种，字典表
    private String use;//用途
    private Double totalVolume;//总蓄积量
    private Double cuttingTrees;//采伐株树
    private Double accumulateMeter;//采伐蓄积计
    private Double accumulateThinning;//采伐蓄积间伐
    private Double outputMeter;//出材量计
    private Double outputSize;//出材量规格材
    private Double denormalizedSmallWood;//非规格材小径材
    private Double denormalizedShortWood;//非规格材短小材
    private Double firewood;//薪炭材
}

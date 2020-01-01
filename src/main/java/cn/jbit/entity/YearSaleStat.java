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
public class YearSaleStat {
    private Integer id;
    private Integer year;//年份
    private Integer firNumber;//杉树数量
    private Integer pineNumber;//松树数量
    private Integer weedNumber;//杂树数量
    private Integer firPrice;//杉树金额
    private Integer pinePrice;//松树金额
    private Integer weedPrice;//杂树金额
}

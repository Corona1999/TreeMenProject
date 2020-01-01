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
//树材单价表
public class WoodPrice {
    private Integer id;//id
    private String creator;//创建人
    private Date createTime;//创建时间
    private Date startTime;//开始时间
    private Date endTime;//结束时间
    private String remark;//备注
}

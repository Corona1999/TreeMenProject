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
public class CheckResult {
    private Integer id;
    private Integer settlementId;//结算表id
    private Date check_time;//审核时间
    private Integer check_uid;//审核人
    private String result;//审核结果
    private String comm;//审核意见
}

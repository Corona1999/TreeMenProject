package cn.jbit.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 工程预支款表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProjectAdvanceMoney {
    private Integer id;
    private Integer nextUser;//下一个审核人
    private Integer productionContractId;//生产合同表id
    private float advanceMoney;//预支款金额
    private Integer checkStatus;//审核状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date advanceTime;//预支时间
    private String advanceMan;//预支代表人
    private String attachmentPath;//附件路径
    private String asd;//审核状态
}

package cn.jbit.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 今日去向表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodayWhereAbout {
    private Integer id;
    private Integer isPublic;//是否公开(可修改)
    private String title;//标题
    private String location;//地点(可修改)
    private String content;//内容
    private String field;//同行人员(可修改)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startTime;//开始时间(可修改)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private String endTime;//结束时间(可修改)
    private Integer creator;//创建者
    private Integer status;//状态
}

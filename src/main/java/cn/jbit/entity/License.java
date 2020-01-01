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
//许可证表
public class License {
    private Integer id;//id
    private String cuttingLicenseCode;//采伐证编号
    private Integer applybookId;//外键，申请表id
    private Date issueTimel;//发证时间

}

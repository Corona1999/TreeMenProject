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
public class TransportLicenseList {
    private Integer id;
    private String transportLicenseNumber;//运输证编号
    private Date transportTime;//运输时间
    private String transportMode; //运输方式
    private String transportDestination; //运输目的地
    private String transportOrigin; //运输起始地
    private String licenseNumber;//运输车/船/火车号
}

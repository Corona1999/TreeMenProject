package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 树材库存表
 */
public class WoodInventory {
    private Integer id;
    private Integer wood;//树材种
    private Integer level;//等级
    private float length;//长度
    private float cal;//口径
    private float count;//数量
    private Date puttingTime;//入库时间
    private Date updateTime;//修改时间
    private String updateRemark;//修改备注
}

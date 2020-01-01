package cn.jbit.entity;

import java.util.Date;

/**
 * Created by Black.Lee on 2019/10/12.
 * 公示管理表
 */
public class PublicManagement {
    private Integer id;
    private String publicTitle;//公示标题
    private String publicContent;//公示正文
    private Date publicStartTime;//公示开始时间
    private Date publicEndTime;//公示结束时间
    private String incomer;//录入人
    private Date enterTime;//录入时间
    private String modifier;//修改人
    private Date modifyTime;//修改时间
    private String pathOfpublicity;//公示附件路径
}

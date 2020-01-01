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
public class User {
    private Integer id;//id
    private String userName;//用户名
    private String passWord;//密码
    private Integer roleId;//角色id
    private String email;//邮箱
    private Date createDate;//创建时间
    private String creator;		//创建者
    private String modify;//修改者
    private Date modifyDate;//修改时间
    private Date departureDate;//离职时间
}

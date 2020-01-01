package cn.jbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by hp on 2019/10/12.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//角色表
public class Role {
    private Integer id; //id
    private String roleName;//角色名

}

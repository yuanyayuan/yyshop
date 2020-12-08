package com.nexus.mall.pojo.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**

* @Description:    用户视图对象

* @Author:         Nexus

* @CreateDate:     2020/12/8 23:44

* @UpdateUser:     Nexus

* @UpdateDate:     2020/12/8 23:44

* @UpdateRemark:   修改内容

* @Version:        1.0

*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersVO {
    /**
     * 主键id 用户id
     */
    private String id;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 头像 头像
     */
    private String face;

    /**
     * 性别 性别 1:男  0:女  2:保密
     */
    private Integer sex;

    /**
     * 用户会话token
     */
    private String userUniqueToken;


}
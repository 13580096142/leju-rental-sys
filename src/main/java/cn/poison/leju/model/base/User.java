package cn.poison.leju.model.base;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户信息实体·数据模型
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxj @ pvc123.com>
 * @Date: 2020/5/30 0:00
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2134677760878878960L;

    /** 用户id   */
    @NotNull(message = "用户id不允许为空")
    private Integer id;

    /** 用户名 */
    @NotBlank(message = "用户名不允许为空")
    private String username;

    /** 密码  */
    @NotBlank(message = "密码不允许为空")
    private String password;
}

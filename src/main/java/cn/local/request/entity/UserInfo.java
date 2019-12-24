package cn.local.request.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Creator Created by lyh
 * @CreateTime 2019/12/23
 * @Description UserInfo 对象
 */
@Data
public class UserInfo implements Serializable {

    /**
     * 主键Id
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(32) COMMENT '主键id'")
    private Long id;

    /**
     * 用户昵称
     **/
    @Column(name = "nick_name", columnDefinition = "varchar(32) COMMENT '用户昵称'")
    private String nickName;

    /**
     * 用户账号
     **/
    @Column(name = "user_account", columnDefinition = "varchar(32) COMMENT '用户账号'")
    private String userAccount;

    /**
     * 密码
     **/
    @Column(name = "password", columnDefinition = "varchar(32) COMMENT '密码'")
    private String password;

    /**
     * 性别 1男 2女 数据字典控制
     **/
    @Column(name = "sex", columnDefinition = "varchar(20) COMMENT '性别 1男 2女'")
    private String sex;

    /**
     * 手机号码
     **/
    @Column(name = "phone", columnDefinition = "int COMMENT '手机号码'")
    private String phone;

    /**
     * 创建时间
     **/
    @Column(name = "create_time", columnDefinition = "datetime COMMENT '创建时间'")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private Date createTime;

    /**
     * 更新时间
     **/
    @Column(name = "update_time", columnDefinition = "datetime COMMENT '更新时间'")
    private Date updateTime;
}

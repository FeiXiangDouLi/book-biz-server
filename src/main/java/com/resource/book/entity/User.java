package com.resource.book.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author honglixiang
 * @since 2020-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="User对象", description="用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户状态(0-禁用;1-启用)")
    private Integer status;

    @ApiModelProperty(value = "用户类型(1:平台管理; 2:租户；3:组织机构)")
    private Integer type;

    private Integer topTenantId;

    @ApiModelProperty(value = "租户ID")
    private Integer tenantId;

    @ApiModelProperty(value = "名称")
    private String name;

    private String mobile;

    private String email;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "是否删除（0：否；1：是）")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime creationTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updationTime;


}

package com.record.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 团队
 * </p>
 *
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_designer")
@ApiModel(value = "Designer对象", description = "")
public class Designer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("技术人id")
    @TableId(value = "designer_id", type = IdType.AUTO)
    private Integer designerId;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("内容html")
    private String contentHtml;

    @ApiModelProperty("发布时间")
    private String createTime;

    @ApiModelProperty("逻辑删除")
    @TableLogic
    private Integer isDelete;
}

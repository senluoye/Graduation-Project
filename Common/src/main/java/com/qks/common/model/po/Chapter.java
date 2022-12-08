package com.qks.common.model.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @ClassName Chapter
 * @Description 章节
 * @Author QKS
 * @Version v1.0
 * @Create 2022-12-08 09:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Chapter extends BaseModel {

    // 章节名称
    private String name;

    // 章节描述
    private String description;

    // 视频id
    private String videoId;
}

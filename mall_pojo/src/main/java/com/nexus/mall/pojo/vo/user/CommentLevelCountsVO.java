package com.nexus.mall.pojo.vo.user;

import lombok.Data;

@Data
public class CommentLevelCountsVO {
    public Integer totalCounts;
    public Integer goodCounts;
    public Integer normalCounts;
    public Integer badCounts;
}

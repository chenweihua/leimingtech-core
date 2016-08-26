package com.leimingtech.core.entity.vo;


import lombok.Data;
import lombok.ToString;

import java.util.List;

import com.leimingtech.core.entity.base.Article;

@Data
@ToString
public class ArticleClassTitleVo {
    private Integer acId;
    private String acCode;
    private String acName;
    private Integer acParentId;
    private Integer acSort;
    private List<Article> article;
}

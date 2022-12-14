package com.mustache.bbs1110.domain.dto;

import com.mustache.bbs1110.domain.entity.Article;
import lombok.Getter;
import lombok.ToString;

@Getter
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return new Article(title, content);
    }
}

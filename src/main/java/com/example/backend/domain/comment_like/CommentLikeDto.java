package com.example.backend.domain.comment_like;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentLikeDto {
    private Long commentId;
    private String commentContent;

}

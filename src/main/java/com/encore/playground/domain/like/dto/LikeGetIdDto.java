package com.encore.playground.domain.like.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LikeGetIdDto {
    private Long feedId;
    private Long memberId;
}

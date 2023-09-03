package com.climb.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {

    public Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;
}

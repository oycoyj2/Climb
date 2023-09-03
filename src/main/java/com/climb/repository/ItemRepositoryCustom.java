package com.climb.repository;

import com.climb.dto.ItemSearchDto;
import com.climb.dto.MainItemDto;
import com.climb.entity.Item;
import com.climb.service.ItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}

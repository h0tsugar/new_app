package com.zaitsev.inventory.service.dto;

import lombok.*;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    String skuCode;
    private boolean isInStock;
}

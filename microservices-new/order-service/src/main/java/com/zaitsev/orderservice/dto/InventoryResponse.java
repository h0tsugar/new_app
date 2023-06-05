package com.zaitsev.orderservice.dto;

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

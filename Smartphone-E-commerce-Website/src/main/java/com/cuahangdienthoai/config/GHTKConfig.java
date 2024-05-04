package com.cuahangdienthoai.config;

import org.springframework.stereotype.Component;

@Component
public class GHTKConfig {
    public static String ghtk_Token = "";
    public static String ghtk_ClientId = "";
    public static String ghtk_ShopId = "";
    public static String ghtk_CreateOrder = "https://dev-online-gateway.ghn.vn/shiip/public-api/v2/shipping-order/create";
    public static String ghtk_OrderInfoByClientOrderCode = "https://dev-online-gateway.ghn.vn/shiip/public-api/v2/shipping-order/detail-by-client-code";
    public static String ghtk_CancleOrder = "https://dev-online-gateway.ghn.vn/shiip/public-api/v2/switch-status/cancel";
}

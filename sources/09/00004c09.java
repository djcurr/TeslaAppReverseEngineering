package com.stripe.android;

/* loaded from: classes2.dex */
public enum StripeApiBeta {
    WeChatPayV1("wechat_pay_beta=v1");
    
    private final String code;

    StripeApiBeta(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
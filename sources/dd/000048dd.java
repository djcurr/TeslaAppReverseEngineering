package com.plaid.link.result;

import com.plaid.link.result.LinkErrorType;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkErrorType$Companion$jsonToObject$2 extends u implements a<Map<String, ? extends LinkErrorType>> {
    public static final LinkErrorType$Companion$jsonToObject$2 INSTANCE = new LinkErrorType$Companion$jsonToObject$2();

    public LinkErrorType$Companion$jsonToObject$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkErrorType> invoke() {
        Map<String, ? extends LinkErrorType> l11;
        LinkErrorType.INVALID_REQUEST invalid_request = LinkErrorType.INVALID_REQUEST.INSTANCE;
        LinkErrorType.INVALID_INPUT invalid_input = LinkErrorType.INVALID_INPUT.INSTANCE;
        LinkErrorType.INSTITUTION_ERROR institution_error = LinkErrorType.INSTITUTION_ERROR.INSTANCE;
        LinkErrorType.RATE_LIMIT_EXCEEDED rate_limit_exceeded = LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE;
        LinkErrorType.API_ERROR api_error = LinkErrorType.API_ERROR.INSTANCE;
        LinkErrorType.ITEM_ERROR item_error = LinkErrorType.ITEM_ERROR.INSTANCE;
        LinkErrorType.ASSET_REPORT_ERROR asset_report_error = LinkErrorType.ASSET_REPORT_ERROR.INSTANCE;
        LinkErrorType.RECAPTCHA_ERROR recaptcha_error = LinkErrorType.RECAPTCHA_ERROR.INSTANCE;
        LinkErrorType.OAUTH_ERROR oauth_error = LinkErrorType.OAUTH_ERROR.INSTANCE;
        LinkErrorType.PAYMENT_ERROR payment_error = LinkErrorType.PAYMENT_ERROR.INSTANCE;
        LinkErrorType.BANK_TRANSFER_ERROR bank_transfer_error = LinkErrorType.BANK_TRANSFER_ERROR.INSTANCE;
        LinkErrorType.DEPOSIT_SWITCH_ERROR deposit_switch_error = LinkErrorType.DEPOSIT_SWITCH_ERROR.INSTANCE;
        LinkErrorType.SANDBOX_ERROR sandbox_error = LinkErrorType.SANDBOX_ERROR.INSTANCE;
        l11 = s0.l(v.a(invalid_request.getJson(), invalid_request), v.a(invalid_input.getJson(), invalid_input), v.a(institution_error.getJson(), institution_error), v.a(rate_limit_exceeded.getJson(), rate_limit_exceeded), v.a(api_error.getJson(), api_error), v.a(item_error.getJson(), item_error), v.a(asset_report_error.getJson(), asset_report_error), v.a(recaptcha_error.getJson(), recaptcha_error), v.a(oauth_error.getJson(), oauth_error), v.a(payment_error.getJson(), payment_error), v.a(bank_transfer_error.getJson(), bank_transfer_error), v.a(deposit_switch_error.getJson(), deposit_switch_error), v.a(sandbox_error.getJson(), sandbox_error));
        return l11;
    }
}
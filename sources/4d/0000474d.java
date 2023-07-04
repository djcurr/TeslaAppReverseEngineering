package com.plaid.link.result;

import com.plaid.link.result.LinkAccountSubtype;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountSubtype$Companion$creditMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.CREDIT>> {
    public static final LinkAccountSubtype$Companion$creditMap$2 INSTANCE = new LinkAccountSubtype$Companion$creditMap$2();

    public LinkAccountSubtype$Companion$creditMap$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkAccountSubtype.CREDIT> invoke() {
        Map<String, ? extends LinkAccountSubtype.CREDIT> l11;
        LinkAccountSubtype.CREDIT.ALL all = LinkAccountSubtype.CREDIT.ALL.INSTANCE;
        LinkAccountSubtype.CREDIT.CREDIT_CARD credit_card = LinkAccountSubtype.CREDIT.CREDIT_CARD.INSTANCE;
        LinkAccountSubtype.CREDIT.PAYPAL_CREDIT paypal_credit = LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.INSTANCE;
        l11 = s0.l(v.a(all.getJson(), all), v.a(credit_card.getJson(), credit_card), v.a(paypal_credit.getJson(), paypal_credit));
        return l11;
    }
}
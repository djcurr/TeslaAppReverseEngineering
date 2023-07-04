package com.plaid.link.result;

import com.plaid.link.result.LinkAccountSubtype;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountSubtype$Companion$depositoryMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.DEPOSITORY>> {
    public static final LinkAccountSubtype$Companion$depositoryMap$2 INSTANCE = new LinkAccountSubtype$Companion$depositoryMap$2();

    public LinkAccountSubtype$Companion$depositoryMap$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkAccountSubtype.DEPOSITORY> invoke() {
        Map<String, ? extends LinkAccountSubtype.DEPOSITORY> l11;
        LinkAccountSubtype.DEPOSITORY.ALL all = LinkAccountSubtype.DEPOSITORY.ALL.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT cash_management = LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.CD cd2 = LinkAccountSubtype.DEPOSITORY.CD.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.CHECKING checking = LinkAccountSubtype.DEPOSITORY.CHECKING.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.EBT ebt = LinkAccountSubtype.DEPOSITORY.EBT.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.HSA hsa = LinkAccountSubtype.DEPOSITORY.HSA.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.MONEY_MARKET money_market = LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.PAYPAL paypal = LinkAccountSubtype.DEPOSITORY.PAYPAL.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.PREPAID prepaid = LinkAccountSubtype.DEPOSITORY.PREPAID.INSTANCE;
        LinkAccountSubtype.DEPOSITORY.SAVINGS savings = LinkAccountSubtype.DEPOSITORY.SAVINGS.INSTANCE;
        l11 = s0.l(v.a(all.getJson(), all), v.a(cash_management.getJson(), cash_management), v.a(cd2.getJson(), cd2), v.a(checking.getJson(), checking), v.a(ebt.getJson(), ebt), v.a(hsa.getJson(), hsa), v.a(money_market.getJson(), money_market), v.a(paypal.getJson(), paypal), v.a(prepaid.getJson(), prepaid), v.a(savings.getJson(), savings));
        return l11;
    }
}
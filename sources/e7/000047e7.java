package com.plaid.link.result;

import com.plaid.link.result.LinkAccountType;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountType$Companion$jsonToObject$2 extends u implements a<Map<String, ? extends LinkAccountType>> {
    public static final LinkAccountType$Companion$jsonToObject$2 INSTANCE = new LinkAccountType$Companion$jsonToObject$2();

    public LinkAccountType$Companion$jsonToObject$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkAccountType> invoke() {
        Map<String, ? extends LinkAccountType> l11;
        LinkAccountType.CREDIT credit = LinkAccountType.CREDIT.INSTANCE;
        LinkAccountType.DEPOSITORY depository = LinkAccountType.DEPOSITORY.INSTANCE;
        LinkAccountType.INVESTMENT investment = LinkAccountType.INVESTMENT.INSTANCE;
        LinkAccountType.LOAN loan = LinkAccountType.LOAN.INSTANCE;
        LinkAccountType.OTHER other = LinkAccountType.OTHER.INSTANCE;
        l11 = s0.l(v.a(credit.getJson(), credit), v.a(depository.getJson(), depository), v.a(investment.getJson(), investment), v.a(loan.getJson(), loan), v.a(other.getJson(), other));
        return l11;
    }
}
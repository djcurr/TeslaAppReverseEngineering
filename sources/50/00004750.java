package com.plaid.link.result;

import com.plaid.link.result.LinkAccountSubtype;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountSubtype$Companion$loanMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE>> {
    public static final LinkAccountSubtype$Companion$loanMap$2 INSTANCE = new LinkAccountSubtype$Companion$loanMap$2();

    public LinkAccountSubtype$Companion$loanMap$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE> invoke() {
        Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE> l11;
        LinkAccountSubtype.LOAN_SUBTYPE.ALL all = LinkAccountSubtype.LOAN_SUBTYPE.ALL.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.AUTO auto = LinkAccountSubtype.LOAN_SUBTYPE.AUTO.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS business = LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL commercial = LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION construction = LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER consumer = LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY home_equity = LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT line_of_credit = LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.LOAN loan = LinkAccountSubtype.LOAN_SUBTYPE.LOAN.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE mortgage = LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.OTHER other = LinkAccountSubtype.LOAN_SUBTYPE.OTHER.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT overdraft = LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.INSTANCE;
        LinkAccountSubtype.LOAN_SUBTYPE.STUDENT student = LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.INSTANCE;
        l11 = s0.l(v.a(all.getJson(), all), v.a(auto.getJson(), auto), v.a(business.getJson(), business), v.a(commercial.getJson(), commercial), v.a(construction.getJson(), construction), v.a(consumer.getJson(), consumer), v.a(home_equity.getJson(), home_equity), v.a(line_of_credit.getJson(), line_of_credit), v.a(loan.getJson(), loan), v.a(mortgage.getJson(), mortgage), v.a(other.getJson(), other), v.a(overdraft.getJson(), overdraft), v.a(student.getJson(), student));
        return l11;
    }
}
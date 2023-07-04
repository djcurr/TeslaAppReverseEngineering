package com.plaid.link.result;

import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountSubtype$Companion$accountTypeToMap$2 extends u implements a<Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>>> {
    public static final LinkAccountSubtype$Companion$accountTypeToMap$2 INSTANCE = new LinkAccountSubtype$Companion$accountTypeToMap$2();

    public LinkAccountSubtype$Companion$accountTypeToMap$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>> invoke() {
        Map creditMap;
        Map depositoryMap;
        Map investmentMap;
        Map loanMap;
        Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>> l11;
        LinkAccountType.CREDIT credit = LinkAccountType.CREDIT.INSTANCE;
        LinkAccountSubtype.Companion companion = LinkAccountSubtype.Companion;
        creditMap = companion.getCreditMap();
        LinkAccountType.DEPOSITORY depository = LinkAccountType.DEPOSITORY.INSTANCE;
        depositoryMap = companion.getDepositoryMap();
        LinkAccountType.INVESTMENT investment = LinkAccountType.INVESTMENT.INSTANCE;
        investmentMap = companion.getInvestmentMap();
        LinkAccountType.LOAN loan = LinkAccountType.LOAN.INSTANCE;
        loanMap = companion.getLoanMap();
        l11 = s0.l(v.a(credit, creditMap), v.a(depository, depositoryMap), v.a(investment, investmentMap), v.a(loan, loanMap));
        return l11;
    }
}
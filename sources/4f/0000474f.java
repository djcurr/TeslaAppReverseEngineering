package com.plaid.link.result;

import com.plaid.link.result.LinkAccountSubtype;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkAccountSubtype$Companion$investmentMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.INVESTMENT>> {
    public static final LinkAccountSubtype$Companion$investmentMap$2 INSTANCE = new LinkAccountSubtype$Companion$investmentMap$2();

    public LinkAccountSubtype$Companion$investmentMap$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkAccountSubtype.INVESTMENT> invoke() {
        Map<String, ? extends LinkAccountSubtype.INVESTMENT> l11;
        LinkAccountSubtype.INVESTMENT.ALL all = LinkAccountSubtype.INVESTMENT.ALL.INSTANCE;
        LinkAccountSubtype.INVESTMENT.BROKERAGE brokerage = LinkAccountSubtype.INVESTMENT.BROKERAGE.INSTANCE;
        LinkAccountSubtype.INVESTMENT.CASH_ISA cash_isa = LinkAccountSubtype.INVESTMENT.CASH_ISA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT education_savings_account = LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
        LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY fixed_annuity = LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.INSTANCE;
        LinkAccountSubtype.INVESTMENT.GIC gic = LinkAccountSubtype.INVESTMENT.GIC.INSTANCE;
        LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT health_reimbursement_arrangement = LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
        LinkAccountSubtype.INVESTMENT.HSA hsa = LinkAccountSubtype.INVESTMENT.HSA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.INVESTMENT_401A investment_401a = LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.INSTANCE;
        LinkAccountSubtype.INVESTMENT.INVESTMENT_401K investment_401k = LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.INSTANCE;
        LinkAccountSubtype.INVESTMENT.INVESTMENT_403B investment_403b = LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.INSTANCE;
        LinkAccountSubtype.INVESTMENT.INVESTMENT_457B investment_457b = LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.INSTANCE;
        LinkAccountSubtype.INVESTMENT.INVESTMENT_529 investment_529 = LinkAccountSubtype.INVESTMENT.INVESTMENT_529.INSTANCE;
        LinkAccountSubtype.INVESTMENT.IRA ira = LinkAccountSubtype.INVESTMENT.IRA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.ISA isa = LinkAccountSubtype.INVESTMENT.ISA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.KEOGH keogh = LinkAccountSubtype.INVESTMENT.KEOGH.INSTANCE;
        LinkAccountSubtype.INVESTMENT.LIF lif = LinkAccountSubtype.INVESTMENT.LIF.INSTANCE;
        LinkAccountSubtype.INVESTMENT.LIRA lira = LinkAccountSubtype.INVESTMENT.LIRA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.LRIF lrif = LinkAccountSubtype.INVESTMENT.LRIF.INSTANCE;
        LinkAccountSubtype.INVESTMENT.LRSP lrsp = LinkAccountSubtype.INVESTMENT.LRSP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.MUTUAL_FUND mutual_fund = LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.INSTANCE;
        LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT non_taxable_brokerage_accountt = LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
        LinkAccountSubtype.INVESTMENT.PENSION pension = LinkAccountSubtype.INVESTMENT.PENSION.INSTANCE;
        LinkAccountSubtype.INVESTMENT.PRIF prif = LinkAccountSubtype.INVESTMENT.PRIF.INSTANCE;
        LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN profit_sharing_plan = LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.INSTANCE;
        LinkAccountSubtype.INVESTMENT.QSHR qshr = LinkAccountSubtype.INVESTMENT.QSHR.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RDSP rdsp = LinkAccountSubtype.INVESTMENT.RDSP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RESP resp = LinkAccountSubtype.INVESTMENT.RESP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RETIREMENT retirement = LinkAccountSubtype.INVESTMENT.RETIREMENT.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RLIF rlif = LinkAccountSubtype.INVESTMENT.RLIF.INSTANCE;
        LinkAccountSubtype.INVESTMENT.ROTH roth = LinkAccountSubtype.INVESTMENT.ROTH.INSTANCE;
        LinkAccountSubtype.INVESTMENT.ROTH_401K roth_401k = LinkAccountSubtype.INVESTMENT.ROTH_401K.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RRIF rrif = LinkAccountSubtype.INVESTMENT.RRIF.INSTANCE;
        LinkAccountSubtype.INVESTMENT.RRSP rrsp = LinkAccountSubtype.INVESTMENT.RRSP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.SARSEP sarsep = LinkAccountSubtype.INVESTMENT.SARSEP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.SEP_IRA sep_ira = LinkAccountSubtype.INVESTMENT.SEP_IRA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.SIMPLE_IRA simple_ira = LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.SIPP sipp = LinkAccountSubtype.INVESTMENT.SIPP.INSTANCE;
        LinkAccountSubtype.INVESTMENT.STOCK_PLAN stock_plan = LinkAccountSubtype.INVESTMENT.STOCK_PLAN.INSTANCE;
        LinkAccountSubtype.INVESTMENT.TFSA tfsa = LinkAccountSubtype.INVESTMENT.TFSA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN thrift_savings_plan = LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.INSTANCE;
        LinkAccountSubtype.INVESTMENT.TRUST trust = LinkAccountSubtype.INVESTMENT.TRUST.INSTANCE;
        LinkAccountSubtype.INVESTMENT.UGMA ugma = LinkAccountSubtype.INVESTMENT.UGMA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.UTMA utma = LinkAccountSubtype.INVESTMENT.UTMA.INSTANCE;
        LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY variable_annuity = LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.INSTANCE;
        l11 = s0.l(v.a(all.getJson(), all), v.a(brokerage.getJson(), brokerage), v.a(cash_isa.getJson(), cash_isa), v.a(education_savings_account.getJson(), education_savings_account), v.a(fixed_annuity.getJson(), fixed_annuity), v.a(gic.getJson(), gic), v.a(health_reimbursement_arrangement.getJson(), health_reimbursement_arrangement), v.a(hsa.getJson(), hsa), v.a(investment_401a.getJson(), investment_401a), v.a(investment_401k.getJson(), investment_401k), v.a(investment_403b.getJson(), investment_403b), v.a(investment_457b.getJson(), investment_457b), v.a(investment_529.getJson(), investment_529), v.a(ira.getJson(), ira), v.a(isa.getJson(), isa), v.a(keogh.getJson(), keogh), v.a(lif.getJson(), lif), v.a(lira.getJson(), lira), v.a(lrif.getJson(), lrif), v.a(lrsp.getJson(), lrsp), v.a(mutual_fund.getJson(), mutual_fund), v.a(non_taxable_brokerage_accountt.getJson(), non_taxable_brokerage_accountt), v.a(pension.getJson(), pension), v.a(prif.getJson(), prif), v.a(profit_sharing_plan.getJson(), profit_sharing_plan), v.a(qshr.getJson(), qshr), v.a(rdsp.getJson(), rdsp), v.a(resp.getJson(), resp), v.a(retirement.getJson(), retirement), v.a(rlif.getJson(), rlif), v.a(roth.getJson(), roth), v.a(roth_401k.getJson(), roth_401k), v.a(rrif.getJson(), rrif), v.a(rrsp.getJson(), rrsp), v.a(sarsep.getJson(), sarsep), v.a(sep_ira.getJson(), sep_ira), v.a(simple_ira.getJson(), simple_ira), v.a(sipp.getJson(), sipp), v.a(stock_plan.getJson(), stock_plan), v.a(tfsa.getJson(), tfsa), v.a(thrift_savings_plan.getJson(), thrift_savings_plan), v.a(trust.getJson(), trust), v.a(ugma.getJson(), ugma), v.a(utma.getJson(), utma), v.a(variable_annuity.getJson(), variable_annuity));
        return l11;
    }
}
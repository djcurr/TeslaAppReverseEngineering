package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.u;
import wz.w0;
import wz.x;
import wz.x0;

/* loaded from: classes2.dex */
public final class DefaultStaticCardAccountRanges implements StaticCardAccountRanges {
    public static final int $stable = 0;
    private static final List<AccountRange> ACCOUNTS;
    private static final List<AccountRange> AMEX_ACCOUNTS;
    public static final Companion Companion = new Companion(null);
    private static final List<AccountRange> DINERSCLUB14_ACCOUNT_RANGES;
    private static final List<AccountRange> DINERSCLUB16_ACCOUNT_RANGES;
    private static final List<AccountRange> DISCOVER_ACCOUNTS;
    private static final List<AccountRange> JCB_ACCOUNTS;
    private static final List<AccountRange> MASTERCARD_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY16_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY19_ACCOUNTS;
    private static final List<AccountRange> VISA_ACCOUNTS;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getUNIONPAY16_ACCOUNTS$payments_core_release$annotations() {
        }

        public static /* synthetic */ void getUNIONPAY19_ACCOUNTS$payments_core_release$annotations() {
        }

        public final List<AccountRange> getACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.ACCOUNTS;
        }

        public final List<AccountRange> getDISCOVER_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.DISCOVER_ACCOUNTS;
        }

        public final List<AccountRange> getUNIONPAY16_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.UNIONPAY16_ACCOUNTS;
        }

        public final List<AccountRange> getUNIONPAY19_ACCOUNTS$payments_core_release() {
            return DefaultStaticCardAccountRanges.UNIONPAY19_ACCOUNTS;
        }
    }

    static {
        Set<BinRange> c11;
        int t11;
        Set<BinRange> i11;
        int t12;
        Set<BinRange> i12;
        int t13;
        Set<BinRange> i13;
        int t14;
        Set<BinRange> c12;
        int t15;
        Set<BinRange> i14;
        int t16;
        Set<BinRange> c13;
        int t17;
        Set<BinRange> i15;
        int t18;
        Set<BinRange> c14;
        int t19;
        List y02;
        List y03;
        List y04;
        List y05;
        List y06;
        List y07;
        List y08;
        List<AccountRange> y09;
        c11 = w0.c(new BinRange("4000000000000000", "4999999999999999"));
        t11 = x.t(c11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (BinRange binRange : c11) {
            arrayList.add(new AccountRange(binRange, 16, AccountRange.BrandInfo.Visa, null, 8, null));
        }
        VISA_ACCOUNTS = arrayList;
        i11 = x0.i(new BinRange("2221000000000000", "2720999999999999"), new BinRange("5100000000000000", "5599999999999999"));
        t12 = x.t(i11, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (BinRange binRange2 : i11) {
            arrayList2.add(new AccountRange(binRange2, 16, AccountRange.BrandInfo.Mastercard, null, 8, null));
        }
        MASTERCARD_ACCOUNTS = arrayList2;
        i12 = x0.i(new BinRange("340000000000000", "349999999999999"), new BinRange("370000000000000", "379999999999999"));
        t13 = x.t(i12, 10);
        ArrayList arrayList3 = new ArrayList(t13);
        for (BinRange binRange3 : i12) {
            arrayList3.add(new AccountRange(binRange3, 15, AccountRange.BrandInfo.AmericanExpress, null, 8, null));
        }
        AMEX_ACCOUNTS = arrayList3;
        i13 = x0.i(new BinRange("6000000000000000", "6099999999999999"), new BinRange("6400000000000000", "6499999999999999"), new BinRange("6500000000000000", "6599999999999999"));
        t14 = x.t(i13, 10);
        ArrayList arrayList4 = new ArrayList(t14);
        for (BinRange binRange4 : i13) {
            arrayList4.add(new AccountRange(binRange4, 16, AccountRange.BrandInfo.Discover, null, 8, null));
        }
        DISCOVER_ACCOUNTS = arrayList4;
        c12 = w0.c(new BinRange("3528000000000000", "3589999999999999"));
        t15 = x.t(c12, 10);
        ArrayList arrayList5 = new ArrayList(t15);
        for (BinRange binRange5 : c12) {
            arrayList5.add(new AccountRange(binRange5, 16, AccountRange.BrandInfo.JCB, null, 8, null));
        }
        JCB_ACCOUNTS = arrayList5;
        i14 = x0.i(new BinRange("6200000000000000", "6216828049999999"), new BinRange("6216828060000000", "6299999999999999"), new BinRange("8100000000000000", "8199999999999999"));
        t16 = x.t(i14, 10);
        ArrayList arrayList6 = new ArrayList(t16);
        for (BinRange binRange6 : i14) {
            arrayList6.add(new AccountRange(binRange6, 16, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY16_ACCOUNTS = arrayList6;
        c13 = w0.c(new BinRange("6216828050000000000", "6216828059999999999"));
        t17 = x.t(c13, 10);
        ArrayList arrayList7 = new ArrayList(t17);
        for (BinRange binRange7 : c13) {
            arrayList7.add(new AccountRange(binRange7, 19, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY19_ACCOUNTS = arrayList7;
        i15 = x0.i(new BinRange("3000000000000000", "3059999999999999"), new BinRange("3095000000000000", "3095999999999999"), new BinRange("3800000000000000", "3999999999999999"));
        t18 = x.t(i15, 10);
        ArrayList arrayList8 = new ArrayList(t18);
        for (BinRange binRange8 : i15) {
            arrayList8.add(new AccountRange(binRange8, 16, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB16_ACCOUNT_RANGES = arrayList8;
        c14 = w0.c(new BinRange("36000000000000", "36999999999999"));
        t19 = x.t(c14, 10);
        ArrayList arrayList9 = new ArrayList(t19);
        for (BinRange binRange9 : c14) {
            arrayList9.add(new AccountRange(binRange9, 14, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB14_ACCOUNT_RANGES = arrayList9;
        y02 = e0.y0(VISA_ACCOUNTS, MASTERCARD_ACCOUNTS);
        y03 = e0.y0(y02, AMEX_ACCOUNTS);
        y04 = e0.y0(y03, DISCOVER_ACCOUNTS);
        y05 = e0.y0(y04, JCB_ACCOUNTS);
        y06 = e0.y0(y05, UNIONPAY16_ACCOUNTS);
        y07 = e0.y0(y06, UNIONPAY19_ACCOUNTS);
        y08 = e0.y0(y07, DINERSCLUB16_ACCOUNT_RANGES);
        y09 = e0.y0(y08, arrayList9);
        ACCOUNTS = y09;
    }

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public List<AccountRange> filter(CardNumber.Unvalidated cardNumber) {
        s.g(cardNumber, "cardNumber");
        List<AccountRange> list = ACCOUNTS;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountRange) obj).getBinRange().matches(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public AccountRange first(CardNumber.Unvalidated cardNumber) {
        s.g(cardNumber, "cardNumber");
        return (AccountRange) u.d0(filter(cardNumber));
    }
}
package com.stripe.android.model;

import com.stripe.android.cards.CardNumber;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import vr.a;
import wz.e0;
import wz.p;
import wz.r0;
import wz.s0;
import wz.u;
import wz.x0;
import yz.b;

/* loaded from: classes6.dex */
public final class CardBrand {
    private static final /* synthetic */ CardBrand[] $VALUES;
    public static final CardBrand AmericanExpress;
    private static final int CVC_COMMON_LENGTH = 3;
    public static final Companion Companion;
    public static final CardBrand DinersClub;
    public static final CardBrand Discover;
    public static final CardBrand JCB;
    public static final CardBrand MasterCard;
    public static final CardBrand UnionPay;
    public static final CardBrand Unknown;
    public static final CardBrand Visa;
    private static final List<CardBrand> orderedBrands;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final int renderingOrder;
    private final Map<Pattern, Integer> variantMaxLength;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<CardBrand> getMatchingCards(String str) {
            Matcher matcher;
            CardBrand[] values = CardBrand.values();
            ArrayList arrayList = new ArrayList();
            for (CardBrand cardBrand : values) {
                Pattern patternForLength = cardBrand.getPatternForLength(str);
                if ((patternForLength == null || (matcher = patternForLength.matcher(str)) == null || !matcher.matches()) ? false : true) {
                    arrayList.add(cardBrand);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0010  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.model.CardBrand fromCardNumber(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 == 0) goto Ld
                boolean r2 = kotlin.text.m.w(r4)
                if (r2 == 0) goto Lb
                goto Ld
            Lb:
                r2 = r0
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 == 0) goto L13
                com.stripe.android.model.CardBrand r4 = com.stripe.android.model.CardBrand.Unknown
                return r4
            L13:
                java.util.List r4 = r3.getMatchingCards(r4)
                int r2 = r4.size()
                if (r2 != r1) goto L1e
                r0 = r1
            L1e:
                if (r0 == 0) goto L21
                goto L22
            L21:
                r4 = 0
            L22:
                if (r4 != 0) goto L2a
                com.stripe.android.model.CardBrand r4 = com.stripe.android.model.CardBrand.Unknown
                java.util.List r4 = wz.u.d(r4)
            L2a:
                java.lang.Object r4 = wz.u.b0(r4)
                com.stripe.android.model.CardBrand r4 = (com.stripe.android.model.CardBrand) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.Companion.fromCardNumber(java.lang.String):com.stripe.android.model.CardBrand");
        }

        public final CardBrand fromCode(String str) {
            CardBrand cardBrand;
            boolean u11;
            CardBrand[] values = CardBrand.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    cardBrand = null;
                    break;
                }
                cardBrand = values[i11];
                u11 = v.u(cardBrand.getCode(), str, true);
                if (u11) {
                    break;
                }
                i11++;
            }
            return cardBrand == null ? CardBrand.Unknown : cardBrand;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x000f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<com.stripe.android.model.CardBrand> getCardBrands(java.lang.String r3) {
            /*
                r2 = this;
                r0 = 1
                if (r3 == 0) goto Lc
                boolean r1 = kotlin.text.m.w(r3)
                if (r1 == 0) goto La
                goto Lc
            La:
                r1 = 0
                goto Ld
            Lc:
                r1 = r0
            Ld:
                if (r1 == 0) goto L14
                java.util.List r3 = r2.getOrderedBrands()
                return r3
            L14:
                java.util.List r3 = r2.getMatchingCards(r3)
                boolean r1 = r3.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L20
                goto L21
            L20:
                r3 = 0
            L21:
                if (r3 != 0) goto L29
                com.stripe.android.model.CardBrand r3 = com.stripe.android.model.CardBrand.Unknown
                java.util.List r3 = wz.u.d(r3)
            L29:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.Companion.getCardBrands(java.lang.String):java.util.List");
        }

        public final List<CardBrand> getOrderedBrands() {
            return CardBrand.orderedBrands;
        }
    }

    private static final /* synthetic */ CardBrand[] $values() {
        return new CardBrand[]{Visa, MasterCard, AmericanExpress, Discover, JCB, DinersClub, UnionPay, Unknown};
    }

    static {
        Map f11;
        Map l11;
        Set i11;
        Map f12;
        Map f13;
        Map l12;
        Map f14;
        Map f15;
        Map f16;
        Set i12;
        Map i13;
        List s02;
        List<CardBrand> G0;
        int i14 = a.f54610k;
        Pattern compile = Pattern.compile("^(4)[0-9]*$");
        f11 = r0.f(vz.v.a(1, Pattern.compile("^4$")));
        Visa = new CardBrand("Visa", 0, "visa", "Visa", i14, 0, 0, null, 0, compile, f11, null, 1, 632, null);
        int i15 = a.f54607h;
        Pattern compile2 = Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$");
        l11 = s0.l(vz.v.a(1, Pattern.compile("^2|5|6$")), vz.v.a(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$")));
        MasterCard = new CardBrand("MasterCard", 1, "mastercard", "Mastercard", i15, 0, 0, null, 0, compile2, l11, null, 2, 632, null);
        int i16 = a.f54600a;
        int i17 = a.f54602c;
        i11 = x0.i(3, 4);
        Pattern compile3 = Pattern.compile("^(34|37)[0-9]*$");
        f12 = r0.f(vz.v.a(1, Pattern.compile("^3$")));
        AmericanExpress = new CardBrand("AmericanExpress", 2, "amex", "American Express", i16, i17, 0, i11, 15, compile3, f12, null, 3, 528, null);
        int i18 = a.f54604e;
        Pattern compile4 = Pattern.compile("^(60|64|65)[0-9]*$");
        f13 = r0.f(vz.v.a(1, Pattern.compile("^6$")));
        Discover = new CardBrand("Discover", 3, "discover", "Discover", i18, 0, 0, null, 0, compile4, f13, null, 4, 632, null);
        int i19 = a.f54606g;
        Pattern compile5 = Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$");
        l12 = s0.l(vz.v.a(1, Pattern.compile("^3$")), vz.v.a(2, Pattern.compile("^(35)$")), vz.v.a(3, Pattern.compile("^(35[2-8])$")));
        JCB = new CardBrand("JCB", 4, "jcb", "JCB", i19, 0, 0, null, 0, compile5, l12, null, 5, 632, null);
        int i21 = a.f54603d;
        Pattern compile6 = Pattern.compile("^(36|30|38|39)[0-9]*$");
        f14 = r0.f(vz.v.a(1, Pattern.compile("^3$")));
        f15 = r0.f(vz.v.a(Pattern.compile("^(36)[0-9]*$"), 14));
        DinersClub = new CardBrand("DinersClub", 5, "diners", "Diners Club", i21, 0, 0, null, 16, compile6, f14, f15, 6, 56, null);
        int i22 = a.f54608i;
        Pattern compile7 = Pattern.compile("^(62|81)[0-9]*$");
        f16 = r0.f(vz.v.a(1, Pattern.compile("^6|8$")));
        UnionPay = new CardBrand("UnionPay", 6, "unionpay", "UnionPay", i22, 0, 0, null, 0, compile7, f16, null, 7, 632, null);
        int i23 = a.f54609j;
        i12 = x0.i(3, 4);
        i13 = s0.i();
        Unknown = new CardBrand("Unknown", 7, "unknown", "Unknown", i23, 0, 0, i12, 0, null, i13, null, -1, 728, null);
        $VALUES = $values();
        Companion = new Companion(null);
        s02 = p.s0(values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : s02) {
            if (((CardBrand) obj).renderingOrder > 0) {
                arrayList.add(obj);
            }
        }
        G0 = e0.G0(arrayList, new Comparator() { // from class: com.stripe.android.model.CardBrand$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                int a11;
                a11 = b.a(Integer.valueOf(CardBrand.access$getRenderingOrder$p((CardBrand) t11)), Integer.valueOf(CardBrand.access$getRenderingOrder$p((CardBrand) t12)));
                return a11;
            }
        });
        orderedBrands = G0;
    }

    private CardBrand(String str, int i11, String str2, String str3, int i12, int i13, int i14, Set set, int i15, Pattern pattern, Map map, Map map2, int i16) {
        super(str, i11);
        this.code = str2;
        this.displayName = str3;
        this.icon = i12;
        this.cvcIcon = i13;
        this.errorIcon = i14;
        this.cvcLength = set;
        this.defaultMaxLength = i15;
        this.pattern = pattern;
        this.partialPatterns = map;
        this.variantMaxLength = map2;
        this.renderingOrder = i16;
    }

    public static final /* synthetic */ int access$getRenderingOrder$p(CardBrand cardBrand) {
        return cardBrand.renderingOrder;
    }

    public final Pattern getPatternForLength(String str) {
        Pattern pattern = this.partialPatterns.get(Integer.valueOf(str.length()));
        return pattern == null ? this.pattern : pattern;
    }

    public static CardBrand valueOf(String str) {
        return (CardBrand) Enum.valueOf(CardBrand.class, str);
    }

    public static CardBrand[] values() {
        return (CardBrand[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCvcIcon() {
        return this.cvcIcon;
    }

    public final Set<Integer> getCvcLength() {
        return this.cvcLength;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getMaxCvcLength() {
        Integer num = (Integer) u.r0(this.cvcLength);
        if (num == null) {
            return 3;
        }
        return num.intValue();
    }

    public final int getMaxLengthForCardNumber(String cardNumber) {
        Object obj;
        s.g(cardNumber, "cardNumber");
        String normalized = new CardNumber.Unvalidated(cardNumber).getNormalized();
        Iterator<T> it2 = this.variantMaxLength.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Pattern) ((Map.Entry) obj).getKey()).matcher(normalized).matches()) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        Integer num = entry != null ? (Integer) entry.getValue() : null;
        return num == null ? this.defaultMaxLength : num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isMaxCvc(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r3 = r0
            goto L14
        L5:
            java.lang.CharSequence r3 = kotlin.text.m.d1(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L10
            goto L3
        L10:
            int r3 = r3.length()
        L14:
            int r1 = r2.getMaxCvcLength()
            if (r1 != r3) goto L1b
            r0 = 1
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.isMaxCvc(java.lang.String):boolean");
    }

    public final boolean isValidCardNumberLength(String str) {
        return (str == null || Unknown == this || str.length() != getMaxLengthForCardNumber(str)) ? false : true;
    }

    public final boolean isValidCvc(String cvc) {
        s.g(cvc, "cvc");
        return this.cvcLength.contains(Integer.valueOf(cvc.length()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ CardBrand(java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23, java.util.Set r24, int r25, java.util.regex.Pattern r26, java.util.Map r27, java.util.Map r28, int r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 8
            if (r1 == 0) goto La
            int r1 = vr.a.f54601b
            r8 = r1
            goto Lc
        La:
            r8 = r22
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L14
            int r1 = vr.a.f54605f
            r9 = r1
            goto L16
        L14:
            r9 = r23
        L16:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Set r1 = wz.v0.c(r1)
            r10 = r1
            goto L27
        L25:
            r10 = r24
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2f
            r1 = 16
            r11 = r1
            goto L31
        L2f:
            r11 = r25
        L31:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L38
            r1 = 0
            r12 = r1
            goto L3a
        L38:
            r12 = r26
        L3a:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L44
            java.util.Map r0 = wz.p0.i()
            r14 = r0
            goto L46
        L44:
            r14 = r28
        L46:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r13 = r27
            r15 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardBrand.<init>(java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.util.Set, int, java.util.regex.Pattern, java.util.Map, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
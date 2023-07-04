package com.stripe.android.cards;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.y;
import wz.e0;
import wz.s0;
import wz.u;
import wz.w;
import wz.x0;

/* loaded from: classes2.dex */
public abstract class CardNumber {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_PAN_LENGTH = 16;
    private static final Set<Integer> DEFAULT_SPACE_POSITIONS;
    public static final int MAX_PAN_LENGTH = 19;
    public static final int MIN_PAN_LENGTH = 14;
    private static final Map<Integer, Set<Integer>> SPACE_POSITIONS;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Integer> getSpacePositions(int i11) {
            Set<Integer> set = (Set) CardNumber.SPACE_POSITIONS.get(Integer.valueOf(i11));
            return set == null ? CardNumber.DEFAULT_SPACE_POSITIONS : set;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Unvalidated extends CardNumber {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Set<Character> REJECT_CHARS;
        private final Bin bin;
        private final String denormalized;
        private final boolean isMaxLength;
        private final boolean isValidLuhn;
        private final int length;
        private final String normalized;

        /* loaded from: classes2.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Set<Character> i11;
            i11 = x0.i(Character.valueOf(CoreConstants.DASH_CHAR), ' ');
            REJECT_CHARS = i11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) {
            super(null);
            s.g(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < denormalized.length(); i11++) {
                char charAt = denormalized.charAt(i11);
                if (!REJECT_CHARS.contains(Character.valueOf(charAt))) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            s.f(sb3, "filterNotTo(StringBuilder(), predicate).toString()");
            this.normalized = sb3;
            int length = sb3.length();
            this.length = length;
            this.isMaxLength = length == 19;
            this.bin = Bin.Companion.create(sb3);
            this.isValidLuhn = CardUtils.INSTANCE.isValidLuhnNumber(sb3);
        }

        private final String component1() {
            return this.denormalized;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unvalidated.denormalized;
            }
            return unvalidated.copy(str);
        }

        private final String formatNumber(int i11) {
            String i12;
            List O0;
            List F0;
            String l02;
            Set<Integer> spacePositions = CardNumber.Companion.getSpacePositions(i11);
            i12 = y.i1(this.normalized, i11);
            int size = spacePositions.size() + 1;
            String[] strArr = new String[size];
            int length = i12.length();
            O0 = e0.O0(spacePositions);
            F0 = e0.F0(O0);
            int i13 = 0;
            int i14 = 0;
            for (Object obj : F0) {
                int i15 = i13 + 1;
                if (i13 < 0) {
                    w.s();
                }
                int intValue = ((Number) obj).intValue() - i13;
                if (length > intValue) {
                    String substring = i12.substring(i14, intValue);
                    s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    strArr[i13] = substring;
                    i14 = intValue;
                }
                i13 = i15;
            }
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    i16 = -1;
                    break;
                }
                if (strArr[i16] == null) {
                    break;
                }
                i16++;
            }
            Integer valueOf = Integer.valueOf(i16);
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                String substring2 = i12.substring(i14);
                s.f(substring2, "this as java.lang.String).substring(startIndex)");
                strArr[intValue2] = substring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < size; i17++) {
                String str = strArr[i17];
                if (!(str != null)) {
                    break;
                }
                arrayList.add(str);
            }
            l02 = e0.l0(arrayList, " ", null, null, 0, null, null, 62, null);
            return l02;
        }

        public static /* synthetic */ String getFormatted$default(Unvalidated unvalidated, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = 16;
            }
            return unvalidated.getFormatted(i11);
        }

        public final Unvalidated copy(String denormalized) {
            s.g(denormalized, "denormalized");
            return new Unvalidated(denormalized);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unvalidated) && s.c(this.denormalized, ((Unvalidated) obj).denormalized);
        }

        public final Bin getBin() {
            return this.bin;
        }

        public final String getFormatted(int i11) {
            return formatNumber(i11);
        }

        public final int getLength() {
            return this.length;
        }

        public final String getNormalized() {
            return this.normalized;
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public final boolean isMaxLength() {
            return this.isMaxLength;
        }

        public final boolean isPartialEntry(int i11) {
            boolean w11;
            if (this.normalized.length() != i11) {
                w11 = v.w(this.normalized);
                if (!w11) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isPossibleCardBrand() {
            boolean w11;
            w11 = v.w(this.normalized);
            return (w11 ^ true) && u.b0(CardBrand.Companion.getCardBrands(this.normalized)) != CardBrand.Unknown;
        }

        public final boolean isValidLuhn() {
            return this.isValidLuhn;
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.denormalized + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final Validated validate(int i11) {
            if (i11 >= 14 && this.normalized.length() == i11 && this.isValidLuhn) {
                return new Validated(this.normalized);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Validated extends CardNumber {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            s.g(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = validated.value;
            }
            return validated.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Validated copy(String value) {
            s.g(value, "value");
            return new Validated(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Validated) && s.c(this.value, ((Validated) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        Set<Integer> i11;
        Set i12;
        Set i13;
        Set i14;
        Set i15;
        Map<Integer, Set<Integer>> l11;
        i11 = x0.i(4, 9, 14);
        DEFAULT_SPACE_POSITIONS = i11;
        i12 = x0.i(4, 11);
        i13 = x0.i(4, 11);
        i14 = x0.i(4, 9, 14);
        i15 = x0.i(4, 9, 14, 19);
        l11 = s0.l(vz.v.a(14, i12), vz.v.a(15, i13), vz.v.a(16, i14), vz.v.a(19, i15));
        SPACE_POSITIONS = l11;
    }

    private CardNumber() {
    }

    public /* synthetic */ CardNumber(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
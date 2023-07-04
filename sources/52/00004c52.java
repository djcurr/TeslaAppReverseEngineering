package com.stripe.android.cards;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import wz.x0;

/* loaded from: classes2.dex */
public abstract class Cvc {
    @Deprecated
    private static final int COMMON_LENGTH = 3;
    private static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Unvalidated extends Cvc {
        private final String denormalized;
        private final String normalized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) {
            super(null);
            s.g(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb2 = new StringBuilder();
            int length = denormalized.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = denormalized.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
            this.normalized = sb3;
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

        private final boolean isComplete(int i11) {
            Set i12;
            i12 = x0.i(3, Integer.valueOf(i11));
            return i12.contains(Integer.valueOf(this.normalized.length()));
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

        public final String getNormalized$payments_core_release() {
            return this.normalized;
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public final boolean isPartialEntry(int i11) {
            boolean w11;
            w11 = v.w(this.normalized);
            return (w11 ^ true) && !isComplete(i11);
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.denormalized + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final Validated validate(int i11) {
            if (isComplete(i11)) {
                return new Validated(this.normalized);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Validated extends Cvc {
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

        public final String component1$payments_core_release() {
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

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private Cvc() {
    }

    public /* synthetic */ Cvc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
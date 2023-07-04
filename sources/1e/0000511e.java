package com.stripe.android.model;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.view.DateUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.b;
import kotlin.text.w;
import kotlin.text.y;
import vz.q;
import vz.r;
import wz.e0;

/* loaded from: classes6.dex */
public abstract class ExpirationDate {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class Validated extends ExpirationDate {
        public static final int $stable = 0;
        private final int month;
        private final int year;

        public Validated(int i11, int i12) {
            super(null);
            this.month = i11;
            this.year = i12;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = validated.month;
            }
            if ((i13 & 2) != 0) {
                i12 = validated.year;
            }
            return validated.copy(i11, i12);
        }

        public final int component1() {
            return this.month;
        }

        public final int component2() {
            return this.year;
        }

        public final Validated copy(int i11, int i12) {
            return new Validated(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Validated) {
                Validated validated = (Validated) obj;
                return this.month == validated.month && this.year == validated.year;
            }
            return false;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public int hashCode() {
            return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
        }

        public String toString() {
            return "Validated(month=" + this.month + ", year=" + this.year + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private ExpirationDate() {
    }

    public /* synthetic */ ExpirationDate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* loaded from: classes6.dex */
    public static final class Unvalidated extends ExpirationDate {
        public static final Companion Companion = new Companion(null);
        private static final Unvalidated EMPTY = new Unvalidated("", "");
        private final boolean isComplete;
        private final boolean isMonthValid;
        private final boolean isPartialEntry;
        private final String month;
        private final String year;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Unvalidated create(String input) {
                boolean z11;
                String i12;
                String e12;
                boolean c11;
                s.g(input, "input");
                int i11 = 0;
                while (true) {
                    z11 = true;
                    if (i11 >= input.length()) {
                        break;
                    }
                    char charAt = input.charAt(i11);
                    if (!Character.isDigit(charAt)) {
                        c11 = b.c(charAt);
                        if (!c11 && charAt != '/') {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
                if (!z11) {
                    return getEMPTY();
                }
                StringBuilder sb2 = new StringBuilder();
                int length = input.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char charAt2 = input.charAt(i13);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                String sb3 = sb2.toString();
                s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
                i12 = y.i1(sb3, 2);
                e12 = y.e1(sb3, 2);
                return new Unvalidated(i12, e12);
            }

            public final Unvalidated getEMPTY() {
                return Unvalidated.EMPTY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String month, String year) {
            super(null);
            Boolean b11;
            s.g(month, "month");
            s.g(year, "year");
            this.month = month;
            this.year = year;
            boolean z11 = false;
            try {
                q.a aVar = q.f54772b;
                int parseInt = Integer.parseInt(getMonth());
                b11 = q.b(Boolean.valueOf(1 <= parseInt && parseInt < 13));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            this.isMonthValid = ((Boolean) (q.g(b11) ? Boolean.FALSE : b11)).booleanValue();
            boolean z12 = this.month.length() + this.year.length() == 4;
            this.isComplete = z12;
            if (!z12 && this.month.length() + this.year.length() > 0) {
                z11 = true;
            }
            this.isPartialEntry = z11;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unvalidated.month;
            }
            if ((i11 & 2) != 0) {
                str2 = unvalidated.year;
            }
            return unvalidated.copy(str, str2);
        }

        public final String component1() {
            return this.month;
        }

        public final String component2() {
            return this.year;
        }

        public final Unvalidated copy(String month, String year) {
            s.g(month, "month");
            s.g(year, "year");
            return new Unvalidated(month, year);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Unvalidated) {
                Unvalidated unvalidated = (Unvalidated) obj;
                return s.c(this.month, unvalidated.month) && s.c(this.year, unvalidated.year);
            }
            return false;
        }

        public final String getDisplayString() {
            String m02;
            String j12;
            String m03;
            List l11;
            String l02;
            if (this.year.length() == 3) {
                return "";
            }
            m02 = w.m0(this.month, 2, '0');
            j12 = y.j1(this.year, 2);
            m03 = w.m0(j12, 2, '0');
            l11 = wz.w.l(m02, m03);
            l02 = e0.l0(l11, "", null, null, 0, null, null, 62, null);
            return l02;
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public final boolean isComplete$payments_core_release() {
            return this.isComplete;
        }

        public final boolean isMonthValid() {
            return this.isMonthValid;
        }

        public final boolean isPartialEntry$payments_core_release() {
            return this.isPartialEntry;
        }

        public String toString() {
            return "Unvalidated(month=" + this.month + ", year=" + this.year + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final Validated validate() {
            Object b11;
            String str = this.month;
            String str2 = this.year;
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(new Validated(Integer.parseInt(str), DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            if (q.g(b11)) {
                b11 = null;
            }
            return (Validated) b11;
        }

        public Unvalidated(int i11, int i12) {
            this(String.valueOf(i11), String.valueOf(i12));
        }
    }
}
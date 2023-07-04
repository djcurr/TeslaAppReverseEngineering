package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class UtcOffset {

    /* renamed from: a  reason: collision with root package name */
    private final long f25445a;

    public UtcOffset(boolean z11, int i11, int i12) {
        this.f25445a = (z11 ? 1 : -1) * (b(Math.abs(i11)) + e(Math.abs(i12)));
    }

    private static long b(long j11) {
        return j11 * 60 * 60 * 1000;
    }

    private static long c(long j11) {
        return ((j11 / 1000) / 60) / 60;
    }

    private static long d(long j11) {
        return ((j11 / 1000) / 60) % 60;
    }

    private static long e(long j11) {
        return j11 * 60 * 1000;
    }

    public static UtcOffset f(String str) {
        int i11;
        boolean z11;
        String substring;
        int i12 = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            z11 = false;
            i11 = 1;
        } else if (charAt == '+') {
            i11 = 1;
            z11 = true;
        } else {
            i11 = 0;
            z11 = true;
        }
        int i13 = i11 + 4;
        int indexOf = str.indexOf(58, i11);
        if (indexOf >= 0) {
            i13++;
        }
        if (str.length() <= i13) {
            String str2 = null;
            if (indexOf < 0) {
                substring = str.substring(i11);
                int length = substring.length() - 2;
                if (length > 0) {
                    str2 = substring.substring(length);
                    substring = substring.substring(0, length);
                }
            } else {
                substring = str.substring(i11, indexOf);
                if (indexOf < str.length() - 1) {
                    str2 = str.substring(indexOf + 1);
                }
            }
            try {
                int parseInt = Integer.parseInt(substring);
                if (str2 != null) {
                    i12 = Integer.parseInt(str2);
                }
                return new UtcOffset(z11, parseInt, i12);
            } catch (NumberFormatException unused) {
                throw ezvcard.a.INSTANCE.getIllegalArgumentException(40, str);
            }
        }
        throw ezvcard.a.INSTANCE.getIllegalArgumentException(40, str);
    }

    public static UtcOffset g(TimeZone timeZone) {
        return new UtcOffset(timeZone.getOffset(System.currentTimeMillis()));
    }

    public long a() {
        return this.f25445a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && UtcOffset.class == obj.getClass() && this.f25445a == ((UtcOffset) obj).f25445a;
    }

    public String h(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f25445a;
        boolean z12 = j11 >= 0;
        long abs = Math.abs(c(j11));
        long abs2 = Math.abs(d(this.f25445a));
        sb2.append(z12 ? '+' : CoreConstants.DASH_CHAR);
        if (abs < 10) {
            sb2.append('0');
        }
        sb2.append(abs);
        if (z11) {
            sb2.append(CoreConstants.COLON_CHAR);
        }
        if (abs2 < 10) {
            sb2.append('0');
        }
        sb2.append(abs2);
        return sb2.toString();
    }

    public int hashCode() {
        long j11 = this.f25445a;
        return 31 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return h(false);
    }

    public UtcOffset(long j11) {
        this.f25445a = j11;
    }
}
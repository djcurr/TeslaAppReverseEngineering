package j$.time;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f32848c = new Duration(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f32849a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32850b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j11, int i11) {
        this.f32849a = j11;
        this.f32850b = i11;
    }

    private static Duration c(long j11, int i11) {
        return (((long) i11) | j11) == 0 ? f32848c : new Duration(j11, i11);
    }

    public static Duration d(long j11) {
        long j12 = j11 / 1000000000;
        int i11 = (int) (j11 % 1000000000);
        if (i11 < 0) {
            i11 = (int) (i11 + 1000000000);
            j12--;
        }
        return c(j12, i11);
    }

    public static Duration e(long j11) {
        return c(j11, 0);
    }

    public static Duration ofSeconds(long j11, long j12) {
        return c(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f32849a, duration2.f32849a);
        return compare != 0 ? compare : this.f32850b - duration2.f32850b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.f32849a == duration.f32849a && this.f32850b == duration.f32850b;
        }
        return false;
    }

    public int getNano() {
        return this.f32850b;
    }

    public long getSeconds() {
        return this.f32849a;
    }

    public int hashCode() {
        long j11 = this.f32849a;
        return (this.f32850b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.f32849a, 1000L), this.f32850b / 1000000);
    }

    public String toString() {
        if (this == f32848c) {
            return "PT0S";
        }
        long j11 = this.f32849a;
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i12 == 0 && this.f32850b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i12 >= 0 || this.f32850b <= 0) {
            sb2.append(i12);
        } else if (i12 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i12 + 1);
        }
        if (this.f32850b > 0) {
            int length = sb2.length();
            if (i12 < 0) {
                sb2.append(2000000000 - this.f32850b);
            } else {
                sb2.append(this.f32850b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, CoreConstants.DOT);
        }
        sb2.append('S');
        return sb2.toString();
    }
}
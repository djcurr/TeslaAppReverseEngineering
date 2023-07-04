package j$.time.temporal;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class x implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final long f32970a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32971b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32972c;

    /* renamed from: d  reason: collision with root package name */
    private final long f32973d;

    private x(long j11, long j12, long j13, long j14) {
        this.f32970a = j11;
        this.f32971b = j12;
        this.f32972c = j13;
        this.f32973d = j14;
    }

    private String c(l lVar, long j11) {
        if (lVar == null) {
            return "Invalid value (valid values " + this + "): " + j11;
        }
        return "Invalid value for " + lVar + " (valid values " + this + "): " + j11;
    }

    public static x i(long j11, long j12) {
        if (j11 <= j12) {
            return new x(j11, j11, j12, j12);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static x j(long j11, long j12, long j13) {
        if (j11 <= j11) {
            if (j12 <= j13) {
                if (j11 <= j13) {
                    return new x(j11, j11, j12, j13);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    public int a(long j11, l lVar) {
        if (g() && h(j11)) {
            return (int) j11;
        }
        throw new j$.time.c(c(lVar, j11));
    }

    public long b(long j11, l lVar) {
        if (h(j11)) {
            return j11;
        }
        throw new j$.time.c(c(lVar, j11));
    }

    public long d() {
        return this.f32973d;
    }

    public long e() {
        return this.f32970a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f32970a == xVar.f32970a && this.f32971b == xVar.f32971b && this.f32972c == xVar.f32972c && this.f32973d == xVar.f32973d;
        }
        return false;
    }

    public boolean f() {
        return this.f32970a == this.f32971b && this.f32972c == this.f32973d;
    }

    public boolean g() {
        return this.f32970a >= -2147483648L && this.f32973d <= 2147483647L;
    }

    public boolean h(long j11) {
        return j11 >= this.f32970a && j11 <= this.f32973d;
    }

    public int hashCode() {
        long j11 = this.f32970a;
        long j12 = this.f32971b;
        long j13 = j11 + (j12 << 16) + (j12 >> 48);
        long j14 = this.f32972c;
        long j15 = j13 + (j14 << 32) + (j14 >> 32);
        long j16 = this.f32973d;
        long j17 = j15 + (j16 << 48) + (j16 >> 16);
        return (int) (j17 ^ (j17 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32970a);
        if (this.f32970a != this.f32971b) {
            sb2.append('/');
            sb2.append(this.f32971b);
        }
        sb2.append(" - ");
        sb2.append(this.f32972c);
        if (this.f32972c != this.f32973d) {
            sb2.append('/');
            sb2.append(this.f32973d);
        }
        return sb2.toString();
    }
}
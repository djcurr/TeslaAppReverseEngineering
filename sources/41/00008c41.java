package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class q implements Comparable<q>, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public q(long j11, int i11, int i12, int i13) {
        this.posix = j11;
        this.previous = i11;
        this.total = i12;
        this.dst = i13;
        b(i11);
        b(i12);
        a(i13);
    }

    private static void a(int i11) {
        if (i11 != Integer.MAX_VALUE) {
            b(i11);
        }
    }

    private static void b(int i11) {
        if (i11 < -64800 || i11 > 64800) {
            throw new IllegalArgumentException("Offset out of range: " + i11);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            b(this.previous);
            b(this.total);
            a(this.dst);
        } catch (IllegalArgumentException e11) {
            throw new InvalidObjectException(e11.getMessage());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(q qVar) {
        long j11 = this.posix - qVar.posix;
        if (j11 == 0) {
            j11 = this.previous - qVar.previous;
            if (j11 == 0) {
                j11 = this.total - qVar.total;
                if (j11 == 0) {
                    j11 = d() - qVar.d();
                    if (j11 == 0) {
                        return 0;
                    }
                }
            }
        }
        return j11 < 0 ? -1 : 1;
    }

    public int d() {
        int i11 = this.dst;
        if (i11 == Integer.MAX_VALUE) {
            return 0;
        }
        return i11;
    }

    public long e() {
        return this.posix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.posix == qVar.posix && this.previous == qVar.previous && this.total == qVar.total && d() == qVar.d();
        }
        return false;
    }

    public int f() {
        return this.previous;
    }

    public int g() {
        return this.total - this.previous;
    }

    public int h() {
        return this.total - d();
    }

    public int hashCode() {
        long j11 = this.posix;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public int i() {
        return this.total;
    }

    public boolean k() {
        return this.total > this.previous;
    }

    public boolean l() {
        return this.total < this.previous;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[POSIX=");
        sb2.append(this.posix);
        sb2.append(", previous-offset=");
        sb2.append(this.previous);
        sb2.append(", total-offset=");
        sb2.append(this.total);
        sb2.append(", dst-offset=");
        sb2.append(d());
        sb2.append(']');
        return sb2.toString();
    }
}
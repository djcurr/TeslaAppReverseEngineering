package jj;

import ak.i0;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f33842a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33843b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33844c;

    /* renamed from: d  reason: collision with root package name */
    private int f33845d;

    public h(String str, long j11, long j12) {
        this.f33844c = str == null ? "" : str;
        this.f33842a = j11;
        this.f33843b = j12;
    }

    public h a(h hVar, String str) {
        String c11 = c(str);
        if (hVar != null && c11.equals(hVar.c(str))) {
            long j11 = this.f33843b;
            if (j11 != -1) {
                long j12 = this.f33842a;
                if (j12 + j11 == hVar.f33842a) {
                    long j13 = hVar.f33843b;
                    return new h(c11, j12, j13 != -1 ? j11 + j13 : -1L);
                }
            }
            long j14 = hVar.f33843b;
            if (j14 != -1) {
                long j15 = hVar.f33842a;
                if (j15 + j14 == this.f33842a) {
                    return new h(c11, j15, j11 != -1 ? j14 + j11 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return i0.d(str, this.f33844c);
    }

    public String c(String str) {
        return i0.c(str, this.f33844c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f33842a == hVar.f33842a && this.f33843b == hVar.f33843b && this.f33844c.equals(hVar.f33844c);
    }

    public int hashCode() {
        if (this.f33845d == 0) {
            this.f33845d = ((((527 + ((int) this.f33842a)) * 31) + ((int) this.f33843b)) * 31) + this.f33844c.hashCode();
        }
        return this.f33845d;
    }

    public String toString() {
        String str = this.f33844c;
        long j11 = this.f33842a;
        long j12 = this.f33843b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 81);
        sb2.append("RangedUri(referenceUri=");
        sb2.append(str);
        sb2.append(", start=");
        sb2.append(j11);
        sb2.append(", length=");
        sb2.append(j12);
        sb2.append(")");
        return sb2.toString();
    }
}
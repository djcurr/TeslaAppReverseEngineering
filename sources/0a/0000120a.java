package ci;

import ak.k0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final q f9250c;

    /* renamed from: d  reason: collision with root package name */
    public static final q f9251d;

    /* renamed from: a  reason: collision with root package name */
    public final long f9252a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9253b;

    static {
        q qVar = new q(0L, 0L);
        f9250c = qVar;
        new q(Long.MAX_VALUE, Long.MAX_VALUE);
        new q(Long.MAX_VALUE, 0L);
        new q(0L, Long.MAX_VALUE);
        f9251d = qVar;
    }

    public q(long j11, long j12) {
        ak.a.a(j11 >= 0);
        ak.a.a(j12 >= 0);
        this.f9252a = j11;
        this.f9253b = j12;
    }

    public long a(long j11, long j12, long j13) {
        long j14 = this.f9252a;
        if (j14 == 0 && this.f9253b == 0) {
            return j11;
        }
        long O0 = k0.O0(j11, j14, Long.MIN_VALUE);
        long b11 = k0.b(j11, this.f9253b, Long.MAX_VALUE);
        boolean z11 = true;
        boolean z12 = O0 <= j12 && j12 <= b11;
        if (O0 > j13 || j13 > b11) {
            z11 = false;
        }
        return (z12 && z11) ? Math.abs(j12 - j11) <= Math.abs(j13 - j11) ? j12 : j13 : z12 ? j12 : z11 ? j13 : O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9252a == qVar.f9252a && this.f9253b == qVar.f9253b;
    }

    public int hashCode() {
        return (((int) this.f9252a) * 31) + ((int) this.f9253b);
    }
}
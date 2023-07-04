package y0;

import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f58663a;

    /* renamed from: b  reason: collision with root package name */
    private final long f58664b;

    /* renamed from: c  reason: collision with root package name */
    private final long f58665c;

    private u(long j11, long j12, long j13) {
        this.f58663a = j11;
        this.f58664b = j12;
        this.f58665c = j13;
    }

    public /* synthetic */ u(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    @Override // y0.t0
    public v1<t1.a0> a(boolean z11, boolean z12, c1.i iVar, int i11) {
        long j11;
        v1<t1.a0> m11;
        iVar.x(-1052799594);
        if (!z11) {
            j11 = this.f58665c;
        } else if (!z12) {
            j11 = this.f58664b;
        } else {
            j11 = this.f58663a;
        }
        long j12 = j11;
        if (z11) {
            iVar.x(-1052799218);
            m11 = k0.u.a(j12, l0.j.k(100, 0, null, 6, null), null, iVar, 48, 4);
            iVar.N();
        } else {
            iVar.x(-1052799113);
            m11 = c1.n1.m(t1.a0.h(j12), iVar, 0);
            iVar.N();
        }
        iVar.N();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(u.class), kotlin.jvm.internal.m0.b(obj.getClass()))) {
            return false;
        }
        u uVar = (u) obj;
        return t1.a0.n(this.f58663a, uVar.f58663a) && t1.a0.n(this.f58664b, uVar.f58664b) && t1.a0.n(this.f58665c, uVar.f58665c);
    }

    public int hashCode() {
        return (((t1.a0.t(this.f58663a) * 31) + t1.a0.t(this.f58664b)) * 31) + t1.a0.t(this.f58665c);
    }
}
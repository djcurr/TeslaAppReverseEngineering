package y0;

import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements c {

    /* renamed from: a  reason: collision with root package name */
    private final long f58576a;

    /* renamed from: b  reason: collision with root package name */
    private final long f58577b;

    /* renamed from: c  reason: collision with root package name */
    private final long f58578c;

    /* renamed from: d  reason: collision with root package name */
    private final long f58579d;

    private q(long j11, long j12, long j13, long j14) {
        this.f58576a = j11;
        this.f58577b = j12;
        this.f58578c = j13;
        this.f58579d = j14;
    }

    public /* synthetic */ q(long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14);
    }

    @Override // y0.c
    public v1<t1.a0> a(boolean z11, c1.i iVar, int i11) {
        iVar.x(1290127909);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(z11 ? this.f58576a : this.f58578c), iVar, 0);
        iVar.N();
        return m11;
    }

    @Override // y0.c
    public v1<t1.a0> b(boolean z11, c1.i iVar, int i11) {
        iVar.x(1464785127);
        v1<t1.a0> m11 = c1.n1.m(t1.a0.h(z11 ? this.f58577b : this.f58579d), iVar, 0);
        iVar.N();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(kotlin.jvm.internal.m0.b(q.class), kotlin.jvm.internal.m0.b(obj.getClass()))) {
            return false;
        }
        q qVar = (q) obj;
        return t1.a0.n(this.f58576a, qVar.f58576a) && t1.a0.n(this.f58577b, qVar.f58577b) && t1.a0.n(this.f58578c, qVar.f58578c) && t1.a0.n(this.f58579d, qVar.f58579d);
    }

    public int hashCode() {
        return (((((t1.a0.t(this.f58576a) * 31) + t1.a0.t(this.f58577b)) * 31) + t1.a0.t(this.f58578c)) * 31) + t1.a0.t(this.f58579d);
    }
}
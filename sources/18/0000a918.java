package p0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final int f45406a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45407b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45408c;

    /* renamed from: d  reason: collision with root package name */
    private final int f45409d;

    public t(int i11, int i12, int i13, int i14) {
        this.f45406a = i11;
        this.f45407b = i12;
        this.f45408c = i13;
        this.f45409d = i14;
    }

    public /* synthetic */ t(long j11, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, pVar);
    }

    public static /* synthetic */ t b(t tVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = tVar.f45406a;
        }
        if ((i15 & 2) != 0) {
            i12 = tVar.f45407b;
        }
        if ((i15 & 4) != 0) {
            i13 = tVar.f45408c;
        }
        if ((i15 & 8) != 0) {
            i14 = tVar.f45409d;
        }
        return tVar.a(i11, i12, i13, i14);
    }

    public final t a(int i11, int i12, int i13, int i14) {
        return new t(i11, i12, i13, i14);
    }

    public final int c() {
        return this.f45409d;
    }

    public final int d() {
        return this.f45408c;
    }

    public final int e() {
        return this.f45407b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f45406a == tVar.f45406a && this.f45407b == tVar.f45407b && this.f45408c == tVar.f45408c && this.f45409d == tVar.f45409d;
        }
        return false;
    }

    public final int f() {
        return this.f45406a;
    }

    public final long g(p orientation) {
        kotlin.jvm.internal.s.g(orientation, "orientation");
        if (orientation == p.Horizontal) {
            return x2.c.a(this.f45406a, this.f45407b, this.f45408c, this.f45409d);
        }
        return x2.c.a(this.f45408c, this.f45409d, this.f45406a, this.f45407b);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f45406a) * 31) + Integer.hashCode(this.f45407b)) * 31) + Integer.hashCode(this.f45408c)) * 31) + Integer.hashCode(this.f45409d);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f45406a + ", mainAxisMax=" + this.f45407b + ", crossAxisMin=" + this.f45408c + ", crossAxisMax=" + this.f45409d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private t(long r5, p0.p r7) {
        /*
            r4 = this;
            p0.p r0 = p0.p.Horizontal
            if (r7 != r0) goto L9
            int r1 = x2.b.p(r5)
            goto Ld
        L9:
            int r1 = x2.b.o(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = x2.b.n(r5)
            goto L18
        L14:
            int r2 = x2.b.m(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = x2.b.o(r5)
            goto L23
        L1f:
            int r3 = x2.b.p(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = x2.b.m(r5)
            goto L2e
        L2a:
            int r5 = x2.b.n(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.t.<init>(long, p0.p):void");
    }
}
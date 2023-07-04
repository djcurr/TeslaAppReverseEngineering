package kh;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f34649a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34650b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34651c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34652d;

    public e(int i11, int i12, int i13, int i14) {
        this.f34649a = i11;
        this.f34650b = i12;
        this.f34651c = i13;
        this.f34652d = i14;
    }

    public /* synthetic */ e(long j11, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, cVar);
    }

    public final int a() {
        return this.f34651c;
    }

    public final int b() {
        return this.f34650b;
    }

    public final int c() {
        return this.f34649a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f34649a == eVar.f34649a && this.f34650b == eVar.f34650b && this.f34651c == eVar.f34651c && this.f34652d == eVar.f34652d;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f34649a) * 31) + Integer.hashCode(this.f34650b)) * 31) + Integer.hashCode(this.f34651c)) * 31) + Integer.hashCode(this.f34652d);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f34649a + ", mainAxisMax=" + this.f34650b + ", crossAxisMin=" + this.f34651c + ", crossAxisMax=" + this.f34652d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private e(long r5, kh.c r7) {
        /*
            r4 = this;
            kh.c r0 = kh.c.Horizontal
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
        throw new UnsupportedOperationException("Method not decompiled: kh.e.<init>(long, kh.c):void");
    }
}
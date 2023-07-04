package kx;

import hy.l;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
final class f<R> implements retrofit2.c<R, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Type f35913a;

    /* renamed from: b  reason: collision with root package name */
    private final l f35914b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35915c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35916d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35917e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35918f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35919g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f35920h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f35921i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Type type, l lVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f35913a = type;
        this.f35914b = lVar;
        this.f35915c = z11;
        this.f35916d = z12;
        this.f35917e = z13;
        this.f35918f = z14;
        this.f35919g = z15;
        this.f35920h = z16;
        this.f35921i = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // retrofit2.c
    /* renamed from: adapt */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo217adapt(retrofit2.b<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.f35915c
            if (r0 == 0) goto La
            kx.b r0 = new kx.b
            r0.<init>(r2)
            goto Lf
        La:
            kx.c r0 = new kx.c
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.f35916d
            if (r2 == 0) goto L1a
            kx.e r2 = new kx.e
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.f35917e
            if (r2 == 0) goto L24
            kx.a r2 = new kx.a
            r2.<init>(r0)
            goto L18
        L24:
            hy.l r2 = r1.f35914b
            if (r2 == 0) goto L2c
            hy.i r0 = r0.M(r2)
        L2c:
            boolean r2 = r1.f35918f
            if (r2 == 0) goto L37
            hy.a r2 = hy.a.LATEST
            hy.e r2 = r0.P(r2)
            return r2
        L37:
            boolean r2 = r1.f35919g
            if (r2 == 0) goto L40
            hy.m r2 = r0.G()
            return r2
        L40:
            boolean r2 = r1.f35920h
            if (r2 == 0) goto L49
            hy.g r2 = r0.F()
            return r2
        L49:
            boolean r2 = r1.f35921i
            if (r2 == 0) goto L52
            hy.b r2 = r0.y()
            return r2
        L52:
            hy.i r2 = az.a.n(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.f.mo217adapt(retrofit2.b):java.lang.Object");
    }

    @Override // retrofit2.c
    public Type responseType() {
        return this.f35913a;
    }
}
package x5;

import android.graphics.Bitmap;
import b6.g;
import b6.i;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.s;
import x5.b;

/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f57093a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57094b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f57095c;

    /* renamed from: d  reason: collision with root package name */
    private final int f57096d;

    /* renamed from: e  reason: collision with root package name */
    private final g f57097e;

    /* renamed from: f  reason: collision with root package name */
    private final c6.g f57098f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap f57099g;

    /* renamed from: h  reason: collision with root package name */
    private final r5.c f57100h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {29}, m = "proceed")
    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f57101a;

        /* renamed from: b  reason: collision with root package name */
        int f57102b;

        /* renamed from: d  reason: collision with root package name */
        Object f57104d;

        /* renamed from: e  reason: collision with root package name */
        Object f57105e;

        /* renamed from: f  reason: collision with root package name */
        Object f57106f;

        /* renamed from: g  reason: collision with root package name */
        Object f57107g;

        a(zz.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57101a = obj;
            this.f57102b |= Integer.MIN_VALUE;
            return c.this.h(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(g initialRequest, int i11, List<? extends b> interceptors, int i12, g request, c6.g size, Bitmap bitmap, r5.c eventListener) {
        s.g(initialRequest, "initialRequest");
        s.g(interceptors, "interceptors");
        s.g(request, "request");
        s.g(size, "size");
        s.g(eventListener, "eventListener");
        this.f57093a = initialRequest;
        this.f57094b = i11;
        this.f57095c = interceptors;
        this.f57096d = i12;
        this.f57097e = request;
        this.f57098f = size;
        this.f57099g = bitmap;
        this.f57100h = eventListener;
    }

    private final void b(g gVar, b bVar) {
        if (gVar.k() == this.f57093a.k()) {
            if (gVar.l() != i.f7498a) {
                if (gVar.G() == this.f57093a.G()) {
                    if (gVar.v() == this.f57093a.v()) {
                        if (gVar.F() == this.f57093a.F()) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
    }

    private final c c(int i11, g gVar, c6.g gVar2) {
        return new c(this.f57093a, this.f57094b, this.f57095c, i11, gVar, gVar2, this.f57099g, this.f57100h);
    }

    static /* synthetic */ c d(c cVar, int i11, g gVar, c6.g gVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f57096d;
        }
        if ((i12 & 2) != 0) {
            gVar = cVar.getRequest();
        }
        if ((i12 & 4) != 0) {
            gVar2 = cVar.a();
        }
        return cVar.c(i11, gVar, gVar2);
    }

    @Override // x5.b.a
    public c6.g a() {
        return this.f57098f;
    }

    public final Bitmap e() {
        return this.f57099g;
    }

    public final r5.c f() {
        return this.f57100h;
    }

    public final int g() {
        return this.f57094b;
    }

    @Override // x5.b.a
    public g getRequest() {
        return this.f57097e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(b6.g r12, zz.d<? super b6.h> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof x5.c.a
            if (r0 == 0) goto L13
            r0 = r13
            x5.c$a r0 = (x5.c.a) r0
            int r1 = r0.f57102b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57102b = r1
            goto L18
        L13:
            x5.c$a r0 = new x5.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f57101a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f57102b
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r12 = r0.f57107g
            x5.c r12 = (x5.c) r12
            java.lang.Object r12 = r0.f57106f
            x5.b r12 = (x5.b) r12
            java.lang.Object r1 = r0.f57105e
            b6.g r1 = (b6.g) r1
            java.lang.Object r0 = r0.f57104d
            x5.c r0 = (x5.c) r0
            vz.r.b(r13)
            goto L80
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L41:
            vz.r.b(r13)
            int r13 = r11.f57096d
            if (r13 <= 0) goto L54
            java.util.List<x5.b> r2 = r11.f57095c
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            x5.b r13 = (x5.b) r13
            r11.b(r12, r13)
        L54:
            java.util.List<x5.b> r13 = r11.f57095c
            int r2 = r11.f57096d
            java.lang.Object r13 = r13.get(r2)
            x5.b r13 = (x5.b) r13
            int r2 = r11.f57096d
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            x5.c r2 = d(r4, r5, r6, r7, r8, r9)
            r0.f57104d = r11
            r0.f57105e = r12
            r0.f57106f = r13
            r0.f57107g = r2
            r0.f57102b = r3
            java.lang.Object r12 = r13.a(r2, r0)
            if (r12 != r1) goto L7c
            return r1
        L7c:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L80:
            b6.h r13 = (b6.h) r13
            b6.g r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.c.h(b6.g, zz.d):java.lang.Object");
    }
}
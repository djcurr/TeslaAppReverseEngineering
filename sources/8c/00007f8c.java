package kotlinx.coroutines.flow;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    private final h00.p<x20.r<? super T>, zz.d<? super vz.b0>, Object> f35235e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35236a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<T> f35238c;

        /* renamed from: d  reason: collision with root package name */
        int f35239d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, zz.d<? super a> dVar) {
            super(dVar);
            this.f35238c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35237b = obj;
            this.f35239d |= Integer.MIN_VALUE;
            return this.f35238c.g(null, this);
        }
    }

    public /* synthetic */ b(h00.p pVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i12 & 2) != 0 ? zz.h.f61280a : gVar, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? kotlinx.coroutines.channels.a.SUSPEND : aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // kotlinx.coroutines.flow.c, y20.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(x20.r<? super T> r5, zz.d<? super vz.b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f35239d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35239d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35237b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f35239d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f35236a
            x20.r r5 = (x20.r) r5
            vz.r.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            vz.r.b(r6)
            r0.f35236a = r5
            r0.f35239d = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.r()
            if (r5 == 0) goto L4c
            vz.b0 r5 = vz.b0.f54756a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.g(x20.r, zz.d):java.lang.Object");
    }

    @Override // y20.d
    protected y20.d<T> h(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return new b(this.f35235e, gVar, i11, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h00.p<? super x20.r<? super T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        super(pVar, gVar, i11, aVar);
        this.f35235e = pVar;
    }
}
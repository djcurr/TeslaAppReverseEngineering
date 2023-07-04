package androidx.lifecycle;

import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;
import v20.e1;
import v20.y0;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f5103a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<b0<T>, zz.d<? super vz.b0>, Object> f5104b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5105c;

    /* renamed from: d  reason: collision with root package name */
    private final v20.o0 f5106d;

    /* renamed from: e  reason: collision with root package name */
    private final h00.a<vz.b0> f5107e;

    /* renamed from: f  reason: collision with root package name */
    private a2 f5108f;

    /* renamed from: g  reason: collision with root package name */
    private a2 f5109g;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c<T> f5111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5111b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f5111b, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5110a;
            if (i11 == 0) {
                vz.r.b(obj);
                long j11 = ((c) this.f5111b).f5105c;
                this.f5110a = 1;
                if (y0.b(j11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            if (!((c) this.f5111b).f5103a.hasActiveObservers()) {
                a2 a2Var = ((c) this.f5111b).f5108f;
                if (a2Var != null) {
                    a2.a.a(a2Var, null, 1, null);
                }
                ((c) this.f5111b).f5108f = null;
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f5112a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f5113b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c<T> f5114c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<T> cVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f5114c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f5114c, dVar);
            bVar.f5113b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f5112a;
            if (i11 == 0) {
                vz.r.b(obj);
                c0 c0Var = new c0(((c) this.f5114c).f5103a, ((v20.o0) this.f5113b).J());
                h00.p pVar = ((c) this.f5114c).f5104b;
                this.f5112a = 1;
                if (pVar.invoke(c0Var, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            ((c) this.f5114c).f5107e.invoke();
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(f<T> liveData, h00.p<? super b0<T>, ? super zz.d<? super vz.b0>, ? extends Object> block, long j11, v20.o0 scope, h00.a<vz.b0> onDone) {
        kotlin.jvm.internal.s.g(liveData, "liveData");
        kotlin.jvm.internal.s.g(block, "block");
        kotlin.jvm.internal.s.g(scope, "scope");
        kotlin.jvm.internal.s.g(onDone, "onDone");
        this.f5103a = liveData;
        this.f5104b = block;
        this.f5105c = j11;
        this.f5106d = scope;
        this.f5107e = onDone;
    }

    public final void g() {
        a2 d11;
        if (this.f5109g == null) {
            d11 = v20.k.d(this.f5106d, e1.c().R0(), null, new a(this, null), 2, null);
            this.f5109g = d11;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    public final void h() {
        a2 d11;
        a2 a2Var = this.f5109g;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f5109g = null;
        if (this.f5108f != null) {
            return;
        }
        d11 = v20.k.d(this.f5106d, null, null, new b(this, null), 3, null);
        this.f5108f = d11;
    }
}
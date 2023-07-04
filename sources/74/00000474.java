package androidx.compose.ui.platform;

import android.view.Choreographer;
import c1.m0;
import vz.q;
import zz.g;

/* loaded from: classes.dex */
public final class f0 implements c1.m0 {

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f2918a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f2919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f2920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2919a = d0Var;
            this.f2920b = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f2919a.L1(this.f2920b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f2922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2922b = frameCallback;
        }

        public final void a(Throwable th2) {
            f0.this.b().removeFrameCallback(this.f2922b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v20.o<R> f2923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0 f2924b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<Long, R> f2925c;

        /* JADX WARN: Multi-variable type inference failed */
        c(v20.o<? super R> oVar, f0 f0Var, h00.l<? super Long, ? extends R> lVar) {
            this.f2923a = oVar;
            this.f2924b = f0Var;
            this.f2925c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            Object b11;
            zz.d dVar = this.f2923a;
            h00.l<Long, R> lVar = this.f2925c;
            try {
                q.a aVar = vz.q.f54772b;
                b11 = vz.q.b(lVar.invoke(Long.valueOf(j11)));
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            dVar.resumeWith(b11);
        }
    }

    public f0(Choreographer choreographer) {
        kotlin.jvm.internal.s.g(choreographer, "choreographer");
        this.f2918a = choreographer;
    }

    public final Choreographer b() {
        return this.f2918a;
    }

    @Override // c1.m0
    public <R> Object e0(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        zz.d c11;
        Object d11;
        g.b bVar = dVar.getContext().get(zz.e.f61277h3);
        d0 d0Var = bVar instanceof d0 ? (d0) bVar : null;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        c cVar = new c(pVar, this, lVar);
        if (d0Var != null && kotlin.jvm.internal.s.c(d0Var.v1(), b())) {
            d0Var.K1(cVar);
            pVar.T(new a(d0Var, cVar));
        } else {
            b().postFrameCallback(cVar);
            pVar.T(new b(cVar));
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) m0.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) m0.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return m0.a.c(this);
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return m0.a.d(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return m0.a.e(this, gVar);
    }
}
package c1;

import android.view.Choreographer;
import c1.m0;
import vz.q;
import zz.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u f8694a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final Choreographer f8695b = (Choreographer) v20.i.e(v20.e1.c().R0(), new a(null));

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super Choreographer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8696a;

        a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super Choreographer> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f8696a == 0) {
                vz.r.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f8697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f8697a = frameCallback;
        }

        public final void a(Throwable th2) {
            u.f8695b.removeFrameCallback(this.f8697a);
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
        final /* synthetic */ v20.o<R> f8698a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Long, R> f8699b;

        /* JADX WARN: Multi-variable type inference failed */
        c(v20.o<? super R> oVar, h00.l<? super Long, ? extends R> lVar) {
            this.f8698a = oVar;
            this.f8699b = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            Object b11;
            zz.d dVar = this.f8698a;
            u uVar = u.f8694a;
            h00.l<Long, R> lVar = this.f8699b;
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

    private u() {
    }

    @Override // c1.m0
    public <R> Object e0(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        c cVar = new c(pVar, lVar);
        f8695b.postFrameCallback(cVar);
        pVar.T(new b(cVar));
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
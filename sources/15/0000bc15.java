package w20;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.o;
import v20.p;
import vz.q;
import vz.r;

/* loaded from: classes5.dex */
public final class e {
    private static volatile Choreographer choreographer;

    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ o f55443a;

        public a(o oVar) {
            this.f55443a = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.i(this.f55443a);
        }
    }

    static {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(new b(d(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        c cVar = q.g(b11) ? null : b11;
    }

    public static /* synthetic */ void a(o oVar, long j11) {
        h(oVar, j11);
    }

    public static final Handler d(Looper looper, boolean z11) {
        int i11;
        if (!z11 || (i11 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i11 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object e(zz.d<? super Long> dVar) {
        zz.d c11;
        Object d11;
        zz.d c12;
        Object d12;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            c12 = a00.c.c(dVar);
            p pVar = new p(c12, 1);
            pVar.y();
            g(choreographer2, pVar);
            Object s11 = pVar.s();
            d12 = a00.d.d();
            if (s11 == d12) {
                h.c(dVar);
            }
            return s11;
        }
        c11 = a00.c.c(dVar);
        p pVar2 = new p(c11, 1);
        pVar2.y();
        e1.c().I0(zz.h.f61280a, new a(pVar2));
        Object s12 = pVar2.s();
        d11 = a00.d.d();
        if (s12 == d11) {
            h.c(dVar);
        }
        return s12;
    }

    public static final c f(Handler handler, String str) {
        return new b(handler, str);
    }

    public static final void g(Choreographer choreographer2, final o<? super Long> oVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: w20.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                e.a(oVar, j11);
            }
        });
    }

    public static final void h(o oVar, long j11) {
        oVar.v(e1.c(), Long.valueOf(j11));
    }

    public static final void i(o<? super Long> oVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            s.e(choreographer2);
            choreographer = choreographer2;
        }
        g(choreographer2, oVar);
    }
}
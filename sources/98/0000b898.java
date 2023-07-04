package v20;

import java.util.concurrent.CancellationException;
import zz.g;

/* loaded from: classes5.dex */
public interface a2 extends g.b {

    /* renamed from: l1 */
    public static final b f53887l1 = b.f53888a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ void a(a2 a2Var, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            a2Var.j(cancellationException);
        }

        public static <R> R b(a2 a2Var, R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(a2Var, r11, pVar);
        }

        public static <E extends g.b> E c(a2 a2Var, g.c<E> cVar) {
            return (E) g.b.a.b(a2Var, cVar);
        }

        public static /* synthetic */ g1 d(a2 a2Var, boolean z11, boolean z12, h00.l lVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                if ((i11 & 2) != 0) {
                    z12 = true;
                }
                return a2Var.G0(z11, z12, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static zz.g e(a2 a2Var, g.c<?> cVar) {
            return g.b.a.c(a2Var, cVar);
        }

        public static zz.g f(a2 a2Var, zz.g gVar) {
            return g.b.a.d(a2Var, gVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements g.c<a2> {

        /* renamed from: a */
        static final /* synthetic */ b f53888a = new b();

        private b() {
        }
    }

    Object D(zz.d<? super vz.b0> dVar);

    u F0(w wVar);

    g1 G0(boolean z11, boolean z12, h00.l<? super Throwable, vz.b0> lVar);

    boolean a();

    u20.h<a2> getChildren();

    void j(CancellationException cancellationException);

    CancellationException m();

    g1 p(h00.l<? super Throwable, vz.b0> lVar);

    boolean start();
}
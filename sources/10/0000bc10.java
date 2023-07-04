package w20;

import android.os.Handler;
import android.os.Looper;
import h00.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.d2;
import v20.e1;
import v20.g1;
import v20.n2;
import v20.o;
import vz.b0;
import zz.g;

/* loaded from: classes5.dex */
public final class b extends c {
    private volatile b _immediate;

    /* renamed from: b */
    private final Handler f55434b;

    /* renamed from: c */
    private final String f55435c;

    /* renamed from: d */
    private final boolean f55436d;

    /* renamed from: e */
    private final b f55437e;

    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ o f55438a;

        /* renamed from: b */
        final /* synthetic */ b f55439b;

        public a(o oVar, b bVar) {
            this.f55438a = oVar;
            this.f55439b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f55438a.v(this.f55439b, b0.f54756a);
        }
    }

    /* renamed from: w20.b$b */
    /* loaded from: classes5.dex */
    static final class C1262b extends u implements l<Throwable, b0> {

        /* renamed from: b */
        final /* synthetic */ Runnable f55441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1262b(Runnable runnable) {
            super(1);
            b.this = r1;
            this.f55441b = runnable;
        }

        public final void a(Throwable th2) {
            b.this.f55434b.removeCallbacks(this.f55441b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
            a(th2);
            return b0.f54756a;
        }
    }

    private b(Handler handler, String str, boolean z11) {
        super(null);
        this.f55434b = handler;
        this.f55435c = str;
        this.f55436d = z11;
        this._immediate = z11 ? this : null;
        b bVar = this._immediate;
        if (bVar == null) {
            bVar = new b(handler, str, true);
            this._immediate = bVar;
        }
        this.f55437e = bVar;
    }

    public static /* synthetic */ void Z0(b bVar, Runnable runnable) {
        t1(bVar, runnable);
    }

    private final void h1(g gVar, Runnable runnable) {
        d2.d(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        e1.b().I0(gVar, runnable);
    }

    public static final void t1(b bVar, Runnable runnable) {
        bVar.f55434b.removeCallbacks(runnable);
    }

    @Override // v20.j0
    public void I0(g gVar, Runnable runnable) {
        if (this.f55434b.post(runnable)) {
            return;
        }
        h1(gVar, runnable);
    }

    @Override // v20.x0
    public void J(long j11, o<? super b0> oVar) {
        long j12;
        a aVar = new a(oVar, this);
        Handler handler = this.f55434b;
        j12 = m00.l.j(j11, 4611686018427387903L);
        if (handler.postDelayed(aVar, j12)) {
            oVar.T(new C1262b(aVar));
        } else {
            h1(oVar.getContext(), aVar);
        }
    }

    @Override // v20.j0
    public boolean P0(g gVar) {
        return (this.f55436d && s.c(Looper.myLooper(), this.f55434b.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f55434b == this.f55434b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f55434b);
    }

    @Override // w20.c, v20.x0
    public g1 l(long j11, final Runnable runnable, g gVar) {
        long j12;
        Handler handler = this.f55434b;
        j12 = m00.l.j(j11, 4611686018427387903L);
        if (handler.postDelayed(runnable, j12)) {
            return new g1() { // from class: w20.a
                {
                    b.this = this;
                }

                @Override // v20.g1
                public final void dispose() {
                    b.Z0(b.this, runnable);
                }
            };
        }
        h1(gVar, runnable);
        return n2.f53980a;
    }

    @Override // w20.c
    /* renamed from: p1 */
    public b X0() {
        return this.f55437e;
    }

    @Override // v20.l2, v20.j0
    public String toString() {
        String S0 = S0();
        if (S0 == null) {
            String str = this.f55435c;
            if (str == null) {
                str = this.f55434b.toString();
            }
            return this.f55436d ? s.p(str, ".immediate") : str;
        }
        return S0;
    }

    public /* synthetic */ b(Handler handler, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i11 & 2) != 0 ? null : str);
    }

    public b(Handler handler, String str) {
        this(handler, str, false);
    }
}
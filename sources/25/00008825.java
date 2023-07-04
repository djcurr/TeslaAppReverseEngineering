package mx;

import com.google.common.base.u;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import okhttp3.internal.http2.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final h f39628a;

    /* renamed from: b  reason: collision with root package name */
    private final nx.c f39629b;

    /* renamed from: c  reason: collision with root package name */
    private int f39630c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: d  reason: collision with root package name */
    private final b f39631d = new b(0, (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        int f39639a;

        private c() {
        }

        boolean a() {
            return this.f39639a > 0;
        }

        void b() {
            this.f39639a++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(h hVar, nx.c cVar) {
        this.f39628a = (h) u.p(hVar, "transport");
        this.f39629b = (nx.c) u.p(cVar, "frameWriter");
    }

    private b f(g gVar) {
        b bVar = (b) gVar.M();
        if (bVar == null) {
            b bVar2 = new b(this, gVar, this.f39630c);
            gVar.P(bVar2);
            return bVar2;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z11, int i11, okio.f fVar, boolean z12) {
        u.p(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        g Z = this.f39628a.Z(i11);
        if (Z == null) {
            return;
        }
        b f11 = f(Z);
        int j11 = f11.j();
        boolean e11 = f11.e();
        int P0 = (int) fVar.P0();
        if (!e11 && j11 >= P0) {
            f11.k(fVar, P0, z11);
        } else {
            if (!e11 && j11 > 0) {
                f11.k(fVar, j11, false);
            }
            f11.d(fVar, (int) fVar.P0(), z11);
        }
        if (z12) {
            d();
        }
    }

    void d() {
        try {
            this.f39629b.flush();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(int i11) {
        g[] U;
        if (i11 >= 0) {
            int i12 = i11 - this.f39630c;
            this.f39630c = i11;
            for (g gVar : this.f39628a.U()) {
                b bVar = (b) gVar.M();
                if (bVar == null) {
                    gVar.P(new b(this, gVar, this.f39630c));
                } else {
                    bVar.f(i12);
                }
            }
            return i12 > 0;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(g gVar, int i11) {
        if (gVar == null) {
            int f11 = this.f39631d.f(i11);
            h();
            return f11;
        }
        b f12 = f(gVar);
        int f13 = f12.f(i11);
        c cVar = new c();
        f12.l(f12.j(), cVar);
        if (cVar.a()) {
            d();
        }
        return f13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        int i11;
        g[] U = this.f39628a.U();
        int i12 = this.f39631d.i();
        int length = U.length;
        while (true) {
            i11 = 0;
            if (length <= 0 || i12 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i12 / length);
            for (int i13 = 0; i13 < length && i12 > 0; i13++) {
                g gVar = U[i13];
                b f11 = f(gVar);
                int min = Math.min(i12, Math.min(f11.h(), ceil));
                if (min > 0) {
                    f11.a(min);
                    i12 -= min;
                }
                if (f11.h() > 0) {
                    U[i11] = gVar;
                    i11++;
                }
            }
            length = i11;
        }
        c cVar = new c();
        g[] U2 = this.f39628a.U();
        int length2 = U2.length;
        while (i11 < length2) {
            b f12 = f(U2[i11]);
            f12.l(f12.b(), cVar);
            f12.c();
            i11++;
        }
        if (cVar.a()) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        final okio.f f39632a;

        /* renamed from: b  reason: collision with root package name */
        final int f39633b;

        /* renamed from: c  reason: collision with root package name */
        int f39634c;

        /* renamed from: d  reason: collision with root package name */
        int f39635d;

        /* renamed from: e  reason: collision with root package name */
        g f39636e;

        /* renamed from: f  reason: collision with root package name */
        boolean f39637f;

        b(int i11, int i12) {
            this.f39637f = false;
            this.f39633b = i11;
            this.f39634c = i12;
            this.f39632a = new okio.f();
        }

        void a(int i11) {
            this.f39635d += i11;
        }

        int b() {
            return this.f39635d;
        }

        void c() {
            this.f39635d = 0;
        }

        void d(okio.f fVar, int i11, boolean z11) {
            this.f39632a.write(fVar, i11);
            this.f39637f |= z11;
        }

        boolean e() {
            return this.f39632a.P0() > 0;
        }

        int f(int i11) {
            if (i11 > 0 && Integer.MAX_VALUE - i11 < this.f39634c) {
                throw new IllegalArgumentException("Window size overflow for stream: " + this.f39633b);
            }
            int i12 = this.f39634c + i11;
            this.f39634c = i12;
            return i12;
        }

        int g() {
            return Math.max(0, Math.min(this.f39634c, (int) this.f39632a.P0()));
        }

        int h() {
            return g() - this.f39635d;
        }

        int i() {
            return this.f39634c;
        }

        int j() {
            return Math.min(this.f39634c, p.this.f39631d.i());
        }

        void k(okio.f fVar, int i11, boolean z11) {
            do {
                int min = Math.min(i11, p.this.f39629b.maxDataLength());
                int i12 = -min;
                p.this.f39631d.f(i12);
                f(i12);
                try {
                    p.this.f39629b.data(fVar.P0() == ((long) min) && z11, this.f39633b, fVar, min);
                    this.f39636e.x().q(min);
                    i11 -= min;
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            } while (i11 > 0);
        }

        int l(int i11, c cVar) {
            int min = Math.min(i11, j());
            int i12 = 0;
            while (e() && min > 0) {
                if (min >= this.f39632a.P0()) {
                    i12 += (int) this.f39632a.P0();
                    okio.f fVar = this.f39632a;
                    k(fVar, (int) fVar.P0(), this.f39637f);
                } else {
                    i12 += min;
                    k(this.f39632a, min, false);
                }
                cVar.b();
                min = Math.min(i11 - i12, j());
            }
            return i12;
        }

        b(p pVar, g gVar, int i11) {
            this(gVar.O(), i11);
            this.f39636e = gVar;
        }
    }
}
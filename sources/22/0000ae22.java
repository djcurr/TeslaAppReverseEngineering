package qj;

import ak.k0;
import ak.v;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import nj.b;
import nj.d;
import nj.f;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: n  reason: collision with root package name */
    private final v f48334n;

    /* renamed from: o  reason: collision with root package name */
    private final v f48335o;

    /* renamed from: p  reason: collision with root package name */
    private final C1031a f48336p;

    /* renamed from: q  reason: collision with root package name */
    private Inflater f48337q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1031a {

        /* renamed from: a  reason: collision with root package name */
        private final v f48338a = new v();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f48339b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f48340c;

        /* renamed from: d  reason: collision with root package name */
        private int f48341d;

        /* renamed from: e  reason: collision with root package name */
        private int f48342e;

        /* renamed from: f  reason: collision with root package name */
        private int f48343f;

        /* renamed from: g  reason: collision with root package name */
        private int f48344g;

        /* renamed from: h  reason: collision with root package name */
        private int f48345h;

        /* renamed from: i  reason: collision with root package name */
        private int f48346i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(v vVar, int i11) {
            int F;
            if (i11 < 4) {
                return;
            }
            vVar.P(3);
            int i12 = i11 - 4;
            if ((vVar.C() & 128) != 0) {
                if (i12 < 7 || (F = vVar.F()) < 4) {
                    return;
                }
                this.f48345h = vVar.I();
                this.f48346i = vVar.I();
                this.f48338a.K(F - 4);
                i12 -= 7;
            }
            int e11 = this.f48338a.e();
            int f11 = this.f48338a.f();
            if (e11 >= f11 || i12 <= 0) {
                return;
            }
            int min = Math.min(i12, f11 - e11);
            vVar.j(this.f48338a.d(), e11, min);
            this.f48338a.O(e11 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(v vVar, int i11) {
            if (i11 < 19) {
                return;
            }
            this.f48341d = vVar.I();
            this.f48342e = vVar.I();
            vVar.P(11);
            this.f48343f = vVar.I();
            this.f48344g = vVar.I();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(v vVar, int i11) {
            if (i11 % 5 != 2) {
                return;
            }
            vVar.P(2);
            Arrays.fill(this.f48339b, 0);
            int i12 = i11 / 5;
            int i13 = 0;
            while (i13 < i12) {
                int C = vVar.C();
                int C2 = vVar.C();
                int C3 = vVar.C();
                int C4 = vVar.C();
                int C5 = vVar.C();
                double d11 = C2;
                double d12 = C3 - 128;
                int i14 = i13;
                double d13 = C4 - 128;
                this.f48339b[C] = k0.r((int) (d11 + (d13 * 1.772d)), 0, 255) | (k0.r((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255) << 8) | (C5 << 24) | (k0.r((int) ((1.402d * d12) + d11), 0, 255) << 16);
                i13 = i14 + 1;
            }
            this.f48340c = true;
        }

        public nj.b d() {
            int i11;
            if (this.f48341d == 0 || this.f48342e == 0 || this.f48345h == 0 || this.f48346i == 0 || this.f48338a.f() == 0 || this.f48338a.e() != this.f48338a.f() || !this.f48340c) {
                return null;
            }
            this.f48338a.O(0);
            int i12 = this.f48345h * this.f48346i;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int C = this.f48338a.C();
                if (C != 0) {
                    i11 = i13 + 1;
                    iArr[i13] = this.f48339b[C];
                } else {
                    int C2 = this.f48338a.C();
                    if (C2 != 0) {
                        i11 = ((C2 & 64) == 0 ? C2 & 63 : ((C2 & 63) << 8) | this.f48338a.C()) + i13;
                        Arrays.fill(iArr, i13, i11, (C2 & 128) == 0 ? 0 : this.f48339b[this.f48338a.C()]);
                    }
                }
                i13 = i11;
            }
            return new b.C0811b().f(Bitmap.createBitmap(iArr, this.f48345h, this.f48346i, Bitmap.Config.ARGB_8888)).j(this.f48343f / this.f48341d).k(0).h(this.f48344g / this.f48342e, 0).i(0).l(this.f48345h / this.f48341d).g(this.f48346i / this.f48342e).a();
        }

        public void h() {
            this.f48341d = 0;
            this.f48342e = 0;
            this.f48343f = 0;
            this.f48344g = 0;
            this.f48345h = 0;
            this.f48346i = 0;
            this.f48338a.K(0);
            this.f48340c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f48334n = new v();
        this.f48335o = new v();
        this.f48336p = new C1031a();
    }

    private void B(v vVar) {
        if (vVar.a() <= 0 || vVar.h() != 120) {
            return;
        }
        if (this.f48337q == null) {
            this.f48337q = new Inflater();
        }
        if (k0.n0(vVar, this.f48335o, this.f48337q)) {
            vVar.M(this.f48335o.d(), this.f48335o.f());
        }
    }

    private static nj.b C(v vVar, C1031a c1031a) {
        int f11 = vVar.f();
        int C = vVar.C();
        int I = vVar.I();
        int e11 = vVar.e() + I;
        nj.b bVar = null;
        if (e11 > f11) {
            vVar.O(f11);
            return null;
        }
        if (C != 128) {
            switch (C) {
                case 20:
                    c1031a.g(vVar, I);
                    break;
                case 21:
                    c1031a.e(vVar, I);
                    break;
                case 22:
                    c1031a.f(vVar, I);
                    break;
            }
        } else {
            bVar = c1031a.d();
            c1031a.h();
        }
        vVar.O(e11);
        return bVar;
    }

    @Override // nj.d
    protected f A(byte[] bArr, int i11, boolean z11) {
        this.f48334n.M(bArr, i11);
        B(this.f48334n);
        this.f48336p.h();
        ArrayList arrayList = new ArrayList();
        while (this.f48334n.a() >= 3) {
            nj.b C = C(this.f48334n, this.f48336p);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
package a3;

import a3.d;
import a3.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: c  reason: collision with root package name */
    boolean f156c;

    /* renamed from: e  reason: collision with root package name */
    public a f158e;

    /* renamed from: a  reason: collision with root package name */
    i f154a = null;

    /* renamed from: b  reason: collision with root package name */
    float f155b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f157d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f159f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(i iVar);

        i b(int i11);

        float c(b bVar, boolean z11);

        void clear();

        boolean d(i iVar);

        void e(i iVar, float f11);

        int f();

        float g(int i11);

        float h(i iVar, boolean z11);

        void i(float f11);

        void invert();

        void j(i iVar, float f11, boolean z11);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f212m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int f11 = this.f158e.f();
        i iVar2 = null;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < f11; i11++) {
            float g11 = this.f158e.g(i11);
            if (g11 < BitmapDescriptorFactory.HUE_RED) {
                i b11 = this.f158e.b(i11);
                if ((zArr == null || !zArr[b11.f202c]) && b11 != iVar && (((aVar = b11.f209j) == i.a.SLACK || aVar == i.a.ERROR) && g11 < f12)) {
                    f12 = g11;
                    iVar2 = b11;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z11) {
        if (iVar == null || !iVar.f206g) {
            return;
        }
        this.f155b += iVar.f205f * this.f158e.a(iVar);
        this.f158e.h(iVar, z11);
        if (z11) {
            iVar.d(this);
        }
        if (d.f166t && this.f158e.f() == 0) {
            this.f159f = true;
            dVar.f173a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z11) {
        this.f155b += bVar.f155b * this.f158e.c(bVar, z11);
        if (z11) {
            bVar.f154a.d(this);
        }
        if (d.f166t && this.f154a != null && this.f158e.f() == 0) {
            this.f159f = true;
            dVar.f173a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z11) {
        if (iVar == null || !iVar.f213n) {
            return;
        }
        float a11 = this.f158e.a(iVar);
        this.f155b += iVar.f215p * a11;
        this.f158e.h(iVar, z11);
        if (z11) {
            iVar.d(this);
        }
        this.f158e.j(dVar.f186n.f163d[iVar.f214o], a11, z11);
        if (d.f166t && this.f158e.f() == 0) {
            this.f159f = true;
            dVar.f173a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f179g.length == 0) {
            return;
        }
        boolean z11 = false;
        while (!z11) {
            int f11 = this.f158e.f();
            for (int i11 = 0; i11 < f11; i11++) {
                i b11 = this.f158e.b(i11);
                if (b11.f203d != -1 || b11.f206g || b11.f213n) {
                    this.f157d.add(b11);
                }
            }
            int size = this.f157d.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    i iVar = this.f157d.get(i12);
                    if (iVar.f206g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f213n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f179g[iVar.f203d], true);
                    }
                }
                this.f157d.clear();
            } else {
                z11 = true;
            }
        }
        if (d.f166t && this.f154a != null && this.f158e.f() == 0) {
            this.f159f = true;
            dVar.f173a = true;
        }
    }

    @Override // a3.d.a
    public void a(i iVar) {
        int i11 = iVar.f204e;
        float f11 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 1000.0f;
            } else if (i11 == 3) {
                f11 = 1000000.0f;
            } else if (i11 == 4) {
                f11 = 1.0E9f;
            } else if (i11 == 5) {
                f11 = 1.0E12f;
            }
        }
        this.f158e.e(iVar, f11);
    }

    @Override // a3.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f154a = null;
            this.f158e.clear();
            for (int i11 = 0; i11 < bVar.f158e.f(); i11++) {
                this.f158e.j(bVar.f158e.b(i11), bVar.f158e.g(i11), true);
            }
        }
    }

    @Override // a3.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // a3.d.a
    public void clear() {
        this.f158e.clear();
        this.f154a = null;
        this.f155b = BitmapDescriptorFactory.HUE_RED;
    }

    public b d(d dVar, int i11) {
        this.f158e.e(dVar.o(i11, "ep"), 1.0f);
        this.f158e.e(dVar.o(i11, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i11) {
        this.f158e.e(iVar, i11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z11;
        i g11 = g(dVar);
        if (g11 == null) {
            z11 = true;
        } else {
            x(g11);
            z11 = false;
        }
        if (this.f158e.f() == 0) {
            this.f159f = true;
        }
        return z11;
    }

    i g(d dVar) {
        boolean u11;
        boolean u12;
        int f11 = this.f158e.f();
        i iVar = null;
        boolean z11 = false;
        boolean z12 = false;
        float f12 = 0.0f;
        float f13 = 0.0f;
        i iVar2 = null;
        for (int i11 = 0; i11 < f11; i11++) {
            float g11 = this.f158e.g(i11);
            i b11 = this.f158e.b(i11);
            if (b11.f209j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u12 = u(b11, dVar);
                } else if (f12 > g11) {
                    u12 = u(b11, dVar);
                } else if (!z11 && u(b11, dVar)) {
                    f12 = g11;
                    iVar = b11;
                    z11 = true;
                }
                z11 = u12;
                f12 = g11;
                iVar = b11;
            } else if (iVar == null && g11 < BitmapDescriptorFactory.HUE_RED) {
                if (iVar2 == null) {
                    u11 = u(b11, dVar);
                } else if (f13 > g11) {
                    u11 = u(b11, dVar);
                } else if (!z12 && u(b11, dVar)) {
                    f13 = g11;
                    iVar2 = b11;
                    z12 = true;
                }
                z12 = u11;
                f13 = g11;
                iVar2 = b11;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // a3.d.a
    public i getKey() {
        return this.f154a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i11, float f11, i iVar3, i iVar4, int i12) {
        if (iVar2 == iVar3) {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar4, 1.0f);
            this.f158e.e(iVar2, -2.0f);
            return this;
        }
        if (f11 == 0.5f) {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
            this.f158e.e(iVar3, -1.0f);
            this.f158e.e(iVar4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                this.f155b = (-i11) + i12;
            }
        } else if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            this.f158e.e(iVar, -1.0f);
            this.f158e.e(iVar2, 1.0f);
            this.f155b = i11;
        } else if (f11 >= 1.0f) {
            this.f158e.e(iVar4, -1.0f);
            this.f158e.e(iVar3, 1.0f);
            this.f155b = -i12;
        } else {
            float f12 = 1.0f - f11;
            this.f158e.e(iVar, f12 * 1.0f);
            this.f158e.e(iVar2, f12 * (-1.0f));
            this.f158e.e(iVar3, (-1.0f) * f11);
            this.f158e.e(iVar4, 1.0f * f11);
            if (i11 > 0 || i12 > 0) {
                this.f155b = ((-i11) * f12) + (i12 * f11);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i11) {
        this.f154a = iVar;
        float f11 = i11;
        iVar.f205f = f11;
        this.f155b = f11;
        this.f159f = true;
        return this;
    }

    @Override // a3.d.a
    public boolean isEmpty() {
        return this.f154a == null && this.f155b == BitmapDescriptorFactory.HUE_RED && this.f158e.f() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f11) {
        this.f158e.e(iVar, -1.0f);
        this.f158e.e(iVar2, f11);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f11) {
        this.f158e.e(iVar, -1.0f);
        this.f158e.e(iVar2, 1.0f);
        this.f158e.e(iVar3, f11);
        this.f158e.e(iVar4, -f11);
        return this;
    }

    public b l(float f11, float f12, float f13, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f155b = BitmapDescriptorFactory.HUE_RED;
        if (f12 == BitmapDescriptorFactory.HUE_RED || f11 == f13) {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
            this.f158e.e(iVar4, 1.0f);
            this.f158e.e(iVar3, -1.0f);
        } else if (f11 == BitmapDescriptorFactory.HUE_RED) {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
        } else if (f13 == BitmapDescriptorFactory.HUE_RED) {
            this.f158e.e(iVar3, 1.0f);
            this.f158e.e(iVar4, -1.0f);
        } else {
            float f14 = (f11 / f12) / (f13 / f12);
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
            this.f158e.e(iVar4, f14);
            this.f158e.e(iVar3, -f14);
        }
        return this;
    }

    public b m(i iVar, int i11) {
        if (i11 < 0) {
            this.f155b = i11 * (-1);
            this.f158e.e(iVar, 1.0f);
        } else {
            this.f155b = i11;
            this.f158e.e(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f155b = i11;
        }
        if (!z11) {
            this.f158e.e(iVar, -1.0f);
            this.f158e.e(iVar2, 1.0f);
        } else {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f155b = i11;
        }
        if (!z11) {
            this.f158e.e(iVar, -1.0f);
            this.f158e.e(iVar2, 1.0f);
            this.f158e.e(iVar3, 1.0f);
        } else {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
            this.f158e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f155b = i11;
        }
        if (!z11) {
            this.f158e.e(iVar, -1.0f);
            this.f158e.e(iVar2, 1.0f);
            this.f158e.e(iVar3, -1.0f);
        } else {
            this.f158e.e(iVar, 1.0f);
            this.f158e.e(iVar2, -1.0f);
            this.f158e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f11) {
        this.f158e.e(iVar3, 0.5f);
        this.f158e.e(iVar4, 0.5f);
        this.f158e.e(iVar, -0.5f);
        this.f158e.e(iVar2, -0.5f);
        this.f155b = -f11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f11 = this.f155b;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            this.f155b = f11 * (-1.0f);
            this.f158e.invert();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f154a;
        return iVar != null && (iVar.f209j == i.a.UNRESTRICTED || this.f155b >= BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f158e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f154a;
        if (iVar2 != null) {
            this.f158e.e(iVar2, -1.0f);
            this.f154a.f203d = -1;
            this.f154a = null;
        }
        float h11 = this.f158e.h(iVar, true) * (-1.0f);
        this.f154a = iVar;
        if (h11 == 1.0f) {
            return;
        }
        this.f155b /= h11;
        this.f158e.i(h11);
    }

    public void y() {
        this.f154a = null;
        this.f158e.clear();
        this.f155b = BitmapDescriptorFactory.HUE_RED;
        this.f159f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f158e = new a3.a(this, cVar);
    }
}
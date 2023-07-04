package f3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.e;
import g3.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends l {
    private int A0;
    protected b.InterfaceC0524b B0;
    private boolean C0;
    protected a3.d D0;
    int E0;
    int F0;
    public int G0;
    public int H0;
    c[] I0;
    c[] J0;
    private int K0;
    private boolean L0;
    private boolean M0;
    private WeakReference<d> N0;
    private WeakReference<d> O0;
    private WeakReference<d> P0;
    private WeakReference<d> Q0;
    HashSet<e> R0;
    public b.a S0;

    /* renamed from: y0  reason: collision with root package name */
    g3.b f25752y0;

    /* renamed from: z0  reason: collision with root package name */
    public g3.e f25753z0;

    public f() {
        this.f25752y0 = new g3.b(this);
        this.f25753z0 = new g3.e(this);
        this.B0 = null;
        this.C0 = false;
        this.D0 = new a3.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = 257;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new b.a();
    }

    private void A1(d dVar, a3.i iVar) {
        this.D0.h(this.D0.q(dVar), iVar, 0, 5);
    }

    private void B1(e eVar) {
        int i11 = this.H0 + 1;
        c[] cVarArr = this.I0;
        if (i11 >= cVarArr.length) {
            this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.I0[this.H0] = new c(eVar, 1, O1());
        this.H0++;
    }

    public static boolean R1(int i11, e eVar, b.InterfaceC0524b interfaceC0524b, b.a aVar, int i12) {
        int i13;
        int i14;
        if (interfaceC0524b == null) {
            return false;
        }
        if (eVar.V() != 8 && !(eVar instanceof g) && !(eVar instanceof a)) {
            aVar.f27490a = eVar.y();
            aVar.f27491b = eVar.T();
            aVar.f27492c = eVar.W();
            aVar.f27493d = eVar.v();
            aVar.f27498i = false;
            aVar.f27499j = i12;
            e.b bVar = aVar.f27490a;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z11 = bVar == bVar2;
            boolean z12 = aVar.f27491b == bVar2;
            boolean z13 = z11 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
            boolean z14 = z12 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
            if (z11 && eVar.a0(0) && eVar.f25742u == 0 && !z13) {
                aVar.f27490a = e.b.WRAP_CONTENT;
                if (z12 && eVar.f25744v == 0) {
                    aVar.f27490a = e.b.FIXED;
                }
                z11 = false;
            }
            if (z12 && eVar.a0(1) && eVar.f25744v == 0 && !z14) {
                aVar.f27491b = e.b.WRAP_CONTENT;
                if (z11 && eVar.f25742u == 0) {
                    aVar.f27491b = e.b.FIXED;
                }
                z12 = false;
            }
            if (eVar.n0()) {
                aVar.f27490a = e.b.FIXED;
                z11 = false;
            }
            if (eVar.o0()) {
                aVar.f27491b = e.b.FIXED;
                z12 = false;
            }
            if (z13) {
                if (eVar.f25746w[0] == 4) {
                    aVar.f27490a = e.b.FIXED;
                } else if (!z12) {
                    e.b bVar3 = aVar.f27491b;
                    e.b bVar4 = e.b.FIXED;
                    if (bVar3 == bVar4) {
                        i14 = aVar.f27493d;
                    } else {
                        aVar.f27490a = e.b.WRAP_CONTENT;
                        interfaceC0524b.b(eVar, aVar);
                        i14 = aVar.f27495f;
                    }
                    aVar.f27490a = bVar4;
                    aVar.f27492c = (int) (eVar.t() * i14);
                }
            }
            if (z14) {
                if (eVar.f25746w[1] == 4) {
                    aVar.f27491b = e.b.FIXED;
                } else if (!z11) {
                    e.b bVar5 = aVar.f27490a;
                    e.b bVar6 = e.b.FIXED;
                    if (bVar5 == bVar6) {
                        i13 = aVar.f27492c;
                    } else {
                        aVar.f27491b = e.b.WRAP_CONTENT;
                        interfaceC0524b.b(eVar, aVar);
                        i13 = aVar.f27494e;
                    }
                    aVar.f27491b = bVar6;
                    if (eVar.u() == -1) {
                        aVar.f27493d = (int) (i13 / eVar.t());
                    } else {
                        aVar.f27493d = (int) (eVar.t() * i13);
                    }
                }
            }
            interfaceC0524b.b(eVar, aVar);
            eVar.j1(aVar.f27494e);
            eVar.K0(aVar.f27495f);
            eVar.J0(aVar.f27497h);
            eVar.z0(aVar.f27496g);
            aVar.f27499j = b.a.f27487k;
            return aVar.f27498i;
        }
        aVar.f27494e = 0;
        aVar.f27495f = 0;
        return false;
    }

    private void T1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    private void w1(e eVar) {
        int i11 = this.G0 + 1;
        c[] cVarArr = this.J0;
        if (i11 >= cVarArr.length) {
            this.J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.J0[this.G0] = new c(eVar, 0, O1());
        this.G0++;
    }

    private void z1(d dVar, a3.i iVar) {
        this.D0.h(iVar, this.D0.q(dVar), 0, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(d dVar) {
        WeakReference<d> weakReference = this.P0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.P0.get().d()) {
            this.P0 = new WeakReference<>(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(d dVar) {
        WeakReference<d> weakReference = this.N0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.N0.get().d()) {
            this.N0 = new WeakReference<>(dVar);
        }
    }

    public boolean E1(boolean z11) {
        return this.f25753z0.f(z11);
    }

    public boolean F1(boolean z11) {
        return this.f25753z0.g(z11);
    }

    public boolean G1(boolean z11, int i11) {
        return this.f25753z0.h(z11, i11);
    }

    public void H1(a3.e eVar) {
        this.D0.v(eVar);
    }

    public b.InterfaceC0524b I1() {
        return this.B0;
    }

    public int J1() {
        return this.K0;
    }

    public a3.d K1() {
        return this.D0;
    }

    public void L1() {
        this.f25753z0.j();
    }

    public void M1() {
        this.f25753z0.k();
    }

    @Override // f3.e
    public void N(StringBuilder sb2) {
        sb2.append(this.f25726m + ":{\n");
        sb2.append("  actualWidth:" + this.Z);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f25703a0);
        sb2.append("\n");
        Iterator<e> it2 = q1().iterator();
        while (it2.hasNext()) {
            it2.next().N(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean N1() {
        return this.M0;
    }

    public boolean O1() {
        return this.C0;
    }

    public boolean P1() {
        return this.L0;
    }

    public long Q1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.E0 = i18;
        this.F0 = i19;
        return this.f25752y0.d(this, i11, i18, i19, i12, i13, i14, i15, i16, i17);
    }

    public boolean S1(int i11) {
        return (this.K0 & i11) == i11;
    }

    public void U1(b.InterfaceC0524b interfaceC0524b) {
        this.B0 = interfaceC0524b;
        this.f25753z0.n(interfaceC0524b);
    }

    public void V1(int i11) {
        this.K0 = i11;
        a3.d.f164r = S1(512);
    }

    public void W1(int i11) {
        this.A0 = i11;
    }

    public void X1(boolean z11) {
        this.C0 = z11;
    }

    public boolean Y1(a3.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean S1 = S1(64);
        p1(dVar, S1);
        int size = this.f25762x0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f25762x0.get(i11);
            eVar.p1(dVar, S1);
            if (eVar.c0()) {
                z11 = true;
            }
        }
        return z11;
    }

    public void Z1() {
        this.f25752y0.e(this);
    }

    @Override // f3.e
    public void o1(boolean z11, boolean z12) {
        super.o1(z11, z12);
        int size = this.f25762x0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f25762x0.get(i11).o1(z11, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // f3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r1() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.f.r1():void");
    }

    @Override // f3.l, f3.e
    public void t0() {
        this.D0.E();
        this.E0 = 0;
        this.F0 = 0;
        super.t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u1(e eVar, int i11) {
        if (i11 == 0) {
            w1(eVar);
        } else if (i11 == 1) {
            B1(eVar);
        }
    }

    public boolean v1(a3.d dVar) {
        boolean S1 = S1(64);
        g(dVar, S1);
        int size = this.f25762x0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f25762x0.get(i11);
            eVar.R0(0, false);
            eVar.R0(1, false);
            if (eVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = this.f25762x0.get(i12);
                if (eVar2 instanceof a) {
                    ((a) eVar2).x1();
                }
            }
        }
        this.R0.clear();
        for (int i13 = 0; i13 < size; i13++) {
            e eVar3 = this.f25762x0.get(i13);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.R0.add(eVar3);
                } else {
                    eVar3.g(dVar, S1);
                }
            }
        }
        while (this.R0.size() > 0) {
            int size2 = this.R0.size();
            Iterator<e> it2 = this.R0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                k kVar = (k) it2.next();
                if (kVar.t1(this.R0)) {
                    kVar.g(dVar, S1);
                    this.R0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.R0.size()) {
                Iterator<e> it3 = this.R0.iterator();
                while (it3.hasNext()) {
                    it3.next().g(dVar, S1);
                }
                this.R0.clear();
            }
        }
        if (a3.d.f164r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i14 = 0; i14 < size; i14++) {
                e eVar4 = this.f25762x0.get(i14);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it4 = hashSet.iterator();
            while (it4.hasNext()) {
                e next = it4.next();
                j.a(this, dVar, next);
                next.g(dVar, S1);
            }
        } else {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = this.f25762x0.get(i15);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.X;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.O0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.f1(e.b.FIXED);
                    }
                    eVar5.g(dVar, S1);
                    if (bVar == bVar3) {
                        eVar5.O0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.f1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, S1);
                    }
                }
            }
        }
        if (this.G0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.H0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void x1(d dVar) {
        WeakReference<d> weakReference = this.Q0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.Q0.get().d()) {
            this.Q0 = new WeakReference<>(dVar);
        }
    }

    public void y1(d dVar) {
        WeakReference<d> weakReference = this.O0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.O0.get().d()) {
            this.O0 = new WeakReference<>(dVar);
        }
    }

    public f(int i11, int i12) {
        super(i11, i12);
        this.f25752y0 = new g3.b(this);
        this.f25753z0 = new g3.e(this);
        this.B0 = null;
        this.C0 = false;
        this.D0 = new a3.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = 257;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new b.a();
    }
}
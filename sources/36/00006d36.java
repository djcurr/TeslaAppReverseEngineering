package f3;

import g3.o;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i extends e implements h {

    /* renamed from: x0  reason: collision with root package name */
    public e[] f25758x0 = new e[4];

    /* renamed from: y0  reason: collision with root package name */
    public int f25759y0 = 0;

    @Override // f3.h
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i11 = this.f25759y0 + 1;
        e[] eVarArr = this.f25758x0;
        if (i11 > eVarArr.length) {
            this.f25758x0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f25758x0;
        int i12 = this.f25759y0;
        eVarArr2[i12] = eVar;
        this.f25759y0 = i12 + 1;
    }

    @Override // f3.h
    public void b() {
        this.f25759y0 = 0;
        Arrays.fill(this.f25758x0, (Object) null);
    }

    @Override // f3.h
    public void c(f fVar) {
    }

    public void q1(ArrayList<o> arrayList, int i11, o oVar) {
        for (int i12 = 0; i12 < this.f25759y0; i12++) {
            oVar.a(this.f25758x0[i12]);
        }
        for (int i13 = 0; i13 < this.f25759y0; i13++) {
            g3.i.a(this.f25758x0[i13], i11, arrayList, oVar);
        }
    }

    public int r1(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < this.f25759y0; i14++) {
            e eVar = this.f25758x0[i14];
            if (i11 == 0 && (i13 = eVar.f25743u0) != -1) {
                return i13;
            }
            if (i11 == 1 && (i12 = eVar.f25745v0) != -1) {
                return i12;
            }
        }
        return -1;
    }
}
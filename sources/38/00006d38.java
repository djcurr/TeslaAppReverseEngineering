package f3;

import g3.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: z0  reason: collision with root package name */
    private boolean f25761z0 = false;

    public k() {
        new b.a();
    }

    @Override // f3.i, f3.h
    public void c(f fVar) {
        s1();
    }

    public void s1() {
        for (int i11 = 0; i11 < this.f25759y0; i11++) {
            e eVar = this.f25758x0[i11];
            if (eVar != null) {
                eVar.T0(true);
            }
        }
    }

    public boolean t1(HashSet<e> hashSet) {
        for (int i11 = 0; i11 < this.f25759y0; i11++) {
            if (hashSet.contains(this.f25758x0[i11])) {
                return true;
            }
        }
        return false;
    }

    public boolean u1() {
        return this.f25761z0;
    }
}
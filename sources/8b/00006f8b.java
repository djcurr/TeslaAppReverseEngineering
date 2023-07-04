package g3;

import g3.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f27522m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f27514e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f27514e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // g3.f
    public void d(int i11) {
        if (this.f27519j) {
            return;
        }
        this.f27519j = true;
        this.f27516g = i11;
        for (d dVar : this.f27520k) {
            dVar.a(dVar);
        }
    }
}
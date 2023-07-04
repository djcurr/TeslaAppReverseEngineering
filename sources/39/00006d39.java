package f3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends e {

    /* renamed from: x0  reason: collision with root package name */
    public ArrayList<e> f25762x0;

    public l() {
        this.f25762x0 = new ArrayList<>();
    }

    public void a(e eVar) {
        this.f25762x0.add(eVar);
        if (eVar.J() != null) {
            ((l) eVar.J()).s1(eVar);
        }
        eVar.b1(this);
    }

    public ArrayList<e> q1() {
        return this.f25762x0;
    }

    public void r1() {
        ArrayList<e> arrayList = this.f25762x0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f25762x0.get(i11);
            if (eVar instanceof l) {
                ((l) eVar).r1();
            }
        }
    }

    public void s1(e eVar) {
        this.f25762x0.remove(eVar);
        eVar.t0();
    }

    @Override // f3.e
    public void t0() {
        this.f25762x0.clear();
        super.t0();
    }

    public void t1() {
        this.f25762x0.clear();
    }

    @Override // f3.e
    public void v0(a3.c cVar) {
        super.v0(cVar);
        int size = this.f25762x0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f25762x0.get(i11).v0(cVar);
        }
    }

    public l(int i11, int i12) {
        super(i11, i12);
        this.f25762x0 = new ArrayList<>();
    }
}
package g3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f27500k;

    /* renamed from: l  reason: collision with root package name */
    private int f27501l;

    public c(f3.e eVar, int i11) {
        super(eVar);
        this.f27500k = new ArrayList<>();
        this.f27545f = i11;
        q();
    }

    private void q() {
        f3.e eVar;
        f3.e eVar2 = this.f27541b;
        f3.e K = eVar2.K(this.f27545f);
        while (true) {
            f3.e eVar3 = K;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            K = eVar2.K(this.f27545f);
        }
        this.f27541b = eVar;
        this.f27500k.add(eVar.M(this.f27545f));
        f3.e I = eVar.I(this.f27545f);
        while (I != null) {
            this.f27500k.add(I.M(this.f27545f));
            I = I.I(this.f27545f);
        }
        Iterator<p> it2 = this.f27500k.iterator();
        while (it2.hasNext()) {
            p next = it2.next();
            int i11 = this.f27545f;
            if (i11 == 0) {
                next.f27541b.f25704b = this;
            } else if (i11 == 1) {
                next.f27541b.f25706c = this;
            }
        }
        if ((this.f27545f == 0 && ((f3.f) this.f27541b.J()).O1()) && this.f27500k.size() > 1) {
            ArrayList<p> arrayList = this.f27500k;
            this.f27541b = arrayList.get(arrayList.size() - 1).f27541b;
        }
        this.f27501l = this.f27545f == 0 ? this.f27541b.x() : this.f27541b.S();
    }

    private f3.e r() {
        for (int i11 = 0; i11 < this.f27500k.size(); i11++) {
            p pVar = this.f27500k.get(i11);
            if (pVar.f27541b.V() != 8) {
                return pVar.f27541b;
            }
        }
        return null;
    }

    private f3.e s() {
        for (int size = this.f27500k.size() - 1; size >= 0; size--) {
            p pVar = this.f27500k.get(size);
            if (pVar.f27541b.V() != 8) {
                return pVar.f27541b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // g3.p, g3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(g3.d r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.c.a(g3.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void d() {
        Iterator<p> it2 = this.f27500k.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        int size = this.f27500k.size();
        if (size < 1) {
            return;
        }
        f3.e eVar = this.f27500k.get(0).f27541b;
        f3.e eVar2 = this.f27500k.get(size - 1).f27541b;
        if (this.f27545f == 0) {
            f3.d dVar = eVar.M;
            f3.d dVar2 = eVar2.O;
            f i11 = i(dVar, 0);
            int e11 = dVar.e();
            f3.e r11 = r();
            if (r11 != null) {
                e11 = r11.M.e();
            }
            if (i11 != null) {
                b(this.f27547h, i11, e11);
            }
            f i12 = i(dVar2, 0);
            int e12 = dVar2.e();
            f3.e s11 = s();
            if (s11 != null) {
                e12 = s11.O.e();
            }
            if (i12 != null) {
                b(this.f27548i, i12, -e12);
            }
        } else {
            f3.d dVar3 = eVar.N;
            f3.d dVar4 = eVar2.P;
            f i13 = i(dVar3, 1);
            int e13 = dVar3.e();
            f3.e r12 = r();
            if (r12 != null) {
                e13 = r12.N.e();
            }
            if (i13 != null) {
                b(this.f27547h, i13, e13);
            }
            f i14 = i(dVar4, 1);
            int e14 = dVar4.e();
            f3.e s12 = s();
            if (s12 != null) {
                e14 = s12.P.e();
            }
            if (i14 != null) {
                b(this.f27548i, i14, -e14);
            }
        }
        this.f27547h.f27510a = this;
        this.f27548i.f27510a = this;
    }

    @Override // g3.p
    public void e() {
        for (int i11 = 0; i11 < this.f27500k.size(); i11++) {
            this.f27500k.get(i11).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void f() {
        this.f27542c = null;
        Iterator<p> it2 = this.f27500k.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    @Override // g3.p
    public long j() {
        int size = this.f27500k.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = this.f27500k.get(i11);
            j11 = j11 + pVar.f27547h.f27515f + pVar.j() + pVar.f27548i.f27515f;
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public boolean m() {
        int size = this.f27500k.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.f27500k.get(i11).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f27545f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it2 = this.f27500k.iterator();
        while (it2.hasNext()) {
            sb2.append("<");
            sb2.append(it2.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
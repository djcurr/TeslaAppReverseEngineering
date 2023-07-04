package g3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: f  reason: collision with root package name */
    static int f27534f;

    /* renamed from: b  reason: collision with root package name */
    int f27536b;

    /* renamed from: c  reason: collision with root package name */
    int f27537c;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<f3.e> f27535a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f27538d = null;

    /* renamed from: e  reason: collision with root package name */
    private int f27539e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {
        public a(o oVar, f3.e eVar, a3.d dVar, int i11) {
            new WeakReference(eVar);
            dVar.y(eVar.M);
            dVar.y(eVar.N);
            dVar.y(eVar.O);
            dVar.y(eVar.P);
            dVar.y(eVar.Q);
        }
    }

    public o(int i11) {
        this.f27536b = -1;
        this.f27537c = 0;
        int i12 = f27534f;
        f27534f = i12 + 1;
        this.f27536b = i12;
        this.f27537c = i11;
    }

    private String e() {
        int i11 = this.f27537c;
        return i11 == 0 ? "Horizontal" : i11 == 1 ? "Vertical" : i11 == 2 ? "Both" : "Unknown";
    }

    private int j(a3.d dVar, ArrayList<f3.e> arrayList, int i11) {
        int y11;
        int y12;
        f3.f fVar = (f3.f) arrayList.get(0).J();
        dVar.E();
        fVar.g(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).g(dVar, false);
        }
        if (i11 == 0 && fVar.G0 > 0) {
            f3.b.b(fVar, dVar, arrayList, 0);
        }
        if (i11 == 1 && fVar.H0 > 0) {
            f3.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f27538d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f27538d.add(new a(this, arrayList.get(i13), dVar, i11));
        }
        if (i11 == 0) {
            y11 = dVar.y(fVar.M);
            y12 = dVar.y(fVar.O);
            dVar.E();
        } else {
            y11 = dVar.y(fVar.N);
            y12 = dVar.y(fVar.P);
            dVar.E();
        }
        return y12 - y11;
    }

    public boolean a(f3.e eVar) {
        if (this.f27535a.contains(eVar)) {
            return false;
        }
        this.f27535a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f27535a.size();
        if (this.f27539e != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                o oVar = arrayList.get(i11);
                if (this.f27539e == oVar.f27536b) {
                    g(this.f27537c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f27536b;
    }

    public int d() {
        return this.f27537c;
    }

    public int f(a3.d dVar, int i11) {
        if (this.f27535a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f27535a, i11);
    }

    public void g(int i11, o oVar) {
        Iterator<f3.e> it2 = this.f27535a.iterator();
        while (it2.hasNext()) {
            f3.e next = it2.next();
            oVar.a(next);
            if (i11 == 0) {
                next.f25743u0 = oVar.c();
            } else {
                next.f25745v0 = oVar.c();
            }
        }
        this.f27539e = oVar.f27536b;
    }

    public void h(boolean z11) {
    }

    public void i(int i11) {
        this.f27537c = i11;
    }

    public String toString() {
        Iterator<f3.e> it2;
        String str = e() + " [" + this.f27536b + "] <";
        while (this.f27535a.iterator().hasNext()) {
            str = str + " " + it2.next().r();
        }
        return str + " >";
    }
}
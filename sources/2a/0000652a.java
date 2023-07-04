package d3;

import f3.i;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f23545e = 0;

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<Object, d> f23546a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected HashMap<Object, c> f23547b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, ArrayList<String>> f23548c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final d3.a f23549d;

    /* loaded from: classes.dex */
    public enum a {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public e() {
        d3.a aVar = new d3.a(this);
        this.f23549d = aVar;
        this.f23546a.put(f23545e, aVar);
    }

    public void a(f3.f fVar) {
        c cVar;
        i G;
        i G2;
        fVar.t1();
        this.f23549d.p().d(this, fVar, 0);
        this.f23549d.n().d(this, fVar, 1);
        for (Object obj : this.f23547b.keySet()) {
            i G3 = this.f23547b.get(obj).G();
            if (G3 != null) {
                d dVar = this.f23546a.get(obj);
                if (dVar == null) {
                    dVar = b(obj);
                }
                dVar.b(G3);
            }
        }
        for (Object obj2 : this.f23546a.keySet()) {
            d dVar2 = this.f23546a.get(obj2);
            if (dVar2 != this.f23549d && (dVar2.d() instanceof c) && (G2 = ((c) dVar2.d()).G()) != null) {
                d dVar3 = this.f23546a.get(obj2);
                if (dVar3 == null) {
                    dVar3 = b(obj2);
                }
                dVar3.b(G2);
            }
        }
        for (Object obj3 : this.f23546a.keySet()) {
            d dVar4 = this.f23546a.get(obj3);
            if (dVar4 != this.f23549d) {
                f3.e a11 = dVar4.a();
                a11.B0(dVar4.getKey().toString());
                a11.b1(null);
                dVar4.d();
                fVar.a(a11);
            } else {
                dVar4.b(fVar);
            }
        }
        for (Object obj4 : this.f23547b.keySet()) {
            c cVar2 = this.f23547b.get(obj4);
            if (cVar2.G() != null) {
                Iterator<Object> it2 = cVar2.f23543i0.iterator();
                while (it2.hasNext()) {
                    cVar2.G().a(this.f23546a.get(it2.next()).a());
                }
                cVar2.apply();
            } else {
                cVar2.apply();
            }
        }
        for (Object obj5 : this.f23546a.keySet()) {
            d dVar5 = this.f23546a.get(obj5);
            if (dVar5 != this.f23549d && (dVar5.d() instanceof c) && (G = (cVar = (c) dVar5.d()).G()) != null) {
                Iterator<Object> it3 = cVar.f23543i0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    d dVar6 = this.f23546a.get(next);
                    if (dVar6 != null) {
                        G.a(dVar6.a());
                    } else if (next instanceof d) {
                        G.a(((d) next).a());
                    } else {
                        PrintStream printStream = System.out;
                        printStream.println("couldn't find reference for " + next);
                    }
                }
                dVar5.apply();
            }
        }
        for (Object obj6 : this.f23546a.keySet()) {
            d dVar7 = this.f23546a.get(obj6);
            dVar7.apply();
            f3.e a12 = dVar7.a();
            if (a12 != null && obj6 != null) {
                a12.f25726m = obj6.toString();
            }
        }
    }

    public d3.a b(Object obj) {
        d dVar = this.f23546a.get(obj);
        if (dVar == null) {
            dVar = d(obj);
            this.f23546a.put(obj, dVar);
            dVar.c(obj);
        }
        if (dVar instanceof d3.a) {
            return (d3.a) dVar;
        }
        return null;
    }

    public int c(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public d3.a d(Object obj) {
        return new d3.a(this);
    }

    public e e(b bVar) {
        return i(bVar);
    }

    public void f(Object obj, Object obj2) {
        d3.a b11 = b(obj);
        if (b11 instanceof d3.a) {
            b11.A(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d g(Object obj) {
        return this.f23546a.get(obj);
    }

    public void h() {
        this.f23547b.clear();
        this.f23548c.clear();
    }

    public e i(b bVar) {
        this.f23549d.y(bVar);
        return this;
    }

    public void j(String str, String str2) {
        ArrayList<String> arrayList;
        d3.a b11 = b(str);
        if (b11 instanceof d3.a) {
            b11.z(str2);
            if (!this.f23548c.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.f23548c.put(str2, arrayList);
            } else {
                arrayList = this.f23548c.get(str2);
            }
            arrayList.add(str);
        }
    }

    public e k(b bVar) {
        this.f23549d.B(bVar);
        return this;
    }

    public e l(b bVar) {
        return k(bVar);
    }
}
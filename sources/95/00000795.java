package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class x extends p {

    /* renamed from: b */
    private o.a<u, a> f5223b;

    /* renamed from: c */
    private p.c f5224c;

    /* renamed from: d */
    private final WeakReference<v> f5225d;

    /* renamed from: e */
    private int f5226e;

    /* renamed from: f */
    private boolean f5227f;

    /* renamed from: g */
    private boolean f5228g;

    /* renamed from: h */
    private ArrayList<p.c> f5229h;

    /* renamed from: i */
    private final boolean f5230i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        p.c f5231a;

        /* renamed from: b */
        s f5232b;

        a(u uVar, p.c cVar) {
            this.f5232b = a0.f(uVar);
            this.f5231a = cVar;
        }

        void a(v vVar, p.b bVar) {
            p.c targetState = bVar.getTargetState();
            this.f5231a = x.l(this.f5231a, targetState);
            this.f5232b.g(vVar, bVar);
            this.f5231a = targetState;
        }
    }

    public x(v vVar) {
        this(vVar, true);
    }

    private void d(v vVar) {
        Iterator<Map.Entry<u, a>> descendingIterator = this.f5223b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f5228g) {
            Map.Entry<u, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f5231a.compareTo(this.f5224c) > 0 && !this.f5228g && this.f5223b.contains(next.getKey())) {
                p.b downFrom = p.b.downFrom(value.f5231a);
                if (downFrom != null) {
                    o(downFrom.getTargetState());
                    value.a(vVar, downFrom);
                    n();
                } else {
                    throw new IllegalStateException("no event down from " + value.f5231a);
                }
            }
        }
    }

    private p.c e(u uVar) {
        Map.Entry<u, a> j11 = this.f5223b.j(uVar);
        p.c cVar = null;
        p.c cVar2 = j11 != null ? j11.getValue().f5231a : null;
        if (!this.f5229h.isEmpty()) {
            ArrayList<p.c> arrayList = this.f5229h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f5224c, cVar2), cVar);
    }

    public static x f(v vVar) {
        return new x(vVar, false);
    }

    private void g(String str) {
        if (!this.f5230i || n.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void h(v vVar) {
        o.b<u, a>.d d11 = this.f5223b.d();
        while (d11.hasNext() && !this.f5228g) {
            Map.Entry next = d11.next();
            a aVar = (a) next.getValue();
            while (aVar.f5231a.compareTo(this.f5224c) < 0 && !this.f5228g && this.f5223b.contains((u) next.getKey())) {
                o(aVar.f5231a);
                p.b upFrom = p.b.upFrom(aVar.f5231a);
                if (upFrom != null) {
                    aVar.a(vVar, upFrom);
                    n();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f5231a);
                }
            }
        }
    }

    private boolean j() {
        if (this.f5223b.size() == 0) {
            return true;
        }
        p.c cVar = this.f5223b.b().getValue().f5231a;
        p.c cVar2 = this.f5223b.e().getValue().f5231a;
        return cVar == cVar2 && this.f5224c == cVar2;
    }

    static p.c l(p.c cVar, p.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void m(p.c cVar) {
        if (this.f5224c == cVar) {
            return;
        }
        this.f5224c = cVar;
        if (!this.f5227f && this.f5226e == 0) {
            this.f5227f = true;
            q();
            this.f5227f = false;
            return;
        }
        this.f5228g = true;
    }

    private void n() {
        ArrayList<p.c> arrayList = this.f5229h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(p.c cVar) {
        this.f5229h.add(cVar);
    }

    private void q() {
        v vVar = this.f5225d.get();
        if (vVar != null) {
            while (!j()) {
                this.f5228g = false;
                if (this.f5224c.compareTo(this.f5223b.b().getValue().f5231a) < 0) {
                    d(vVar);
                }
                Map.Entry<u, a> e11 = this.f5223b.e();
                if (!this.f5228g && e11 != null && this.f5224c.compareTo(e11.getValue().f5231a) > 0) {
                    h(vVar);
                }
            }
            this.f5228g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.p
    public void a(u uVar) {
        v vVar;
        g("addObserver");
        p.c cVar = this.f5224c;
        p.c cVar2 = p.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = p.c.INITIALIZED;
        }
        a aVar = new a(uVar, cVar2);
        if (this.f5223b.h(uVar, aVar) == null && (vVar = this.f5225d.get()) != null) {
            boolean z11 = this.f5226e != 0 || this.f5227f;
            p.c e11 = e(uVar);
            this.f5226e++;
            while (aVar.f5231a.compareTo(e11) < 0 && this.f5223b.contains(uVar)) {
                o(aVar.f5231a);
                p.b upFrom = p.b.upFrom(aVar.f5231a);
                if (upFrom != null) {
                    aVar.a(vVar, upFrom);
                    n();
                    e11 = e(uVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f5231a);
                }
            }
            if (!z11) {
                q();
            }
            this.f5226e--;
        }
    }

    @Override // androidx.lifecycle.p
    public p.c b() {
        return this.f5224c;
    }

    @Override // androidx.lifecycle.p
    public void c(u uVar) {
        g("removeObserver");
        this.f5223b.i(uVar);
    }

    public void i(p.b bVar) {
        g("handleLifecycleEvent");
        m(bVar.getTargetState());
    }

    @Deprecated
    public void k(p.c cVar) {
        g("markState");
        p(cVar);
    }

    public void p(p.c cVar) {
        g("setCurrentState");
        m(cVar);
    }

    private x(v vVar, boolean z11) {
        this.f5223b = new o.a<>();
        this.f5226e = 0;
        this.f5227f = false;
        this.f5228g = false;
        this.f5229h = new ArrayList<>();
        this.f5225d = new WeakReference<>(vVar);
        this.f5224c = p.c.INITIALIZED;
        this.f5230i = z11;
    }
}
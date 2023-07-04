package h5;

import java.util.ArrayList;
import java.util.List;
import k5.p;

/* loaded from: classes.dex */
public abstract class c<T> implements g5.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f28888a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f28889b;

    /* renamed from: c  reason: collision with root package name */
    private i5.d<T> f28890c;

    /* renamed from: d  reason: collision with root package name */
    private a f28891d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(i5.d<T> dVar) {
        this.f28890c = dVar;
    }

    private void h(a aVar, T t11) {
        if (this.f28888a.isEmpty() || aVar == null) {
            return;
        }
        if (t11 != null && !c(t11)) {
            aVar.a(this.f28888a);
        } else {
            aVar.b(this.f28888a);
        }
    }

    @Override // g5.a
    public void a(T t11) {
        this.f28889b = t11;
        h(this.f28891d, t11);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t11);

    public boolean d(String str) {
        T t11 = this.f28889b;
        return t11 != null && c(t11) && this.f28888a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f28888a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f28888a.add(pVar.f34405a);
            }
        }
        if (this.f28888a.isEmpty()) {
            this.f28890c.c(this);
        } else {
            this.f28890c.a(this);
        }
        h(this.f28891d, this.f28889b);
    }

    public void f() {
        if (this.f28888a.isEmpty()) {
            return;
        }
        this.f28888a.clear();
        this.f28890c.c(this);
    }

    public void g(a aVar) {
        if (this.f28891d != aVar) {
            this.f28891d = aVar;
            h(aVar, this.f28889b);
        }
    }
}
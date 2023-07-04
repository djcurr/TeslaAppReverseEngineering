package c1;

import m1.h;

/* loaded from: classes.dex */
public class l1<T> implements m1.b0, m1.q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m1<T> f8614a;

    /* renamed from: b  reason: collision with root package name */
    private a<T> f8615b;

    /* loaded from: classes.dex */
    private static final class a<T> extends m1.c0 {

        /* renamed from: c  reason: collision with root package name */
        private T f8616c;

        public a(T t11) {
            this.f8616c = t11;
        }

        @Override // m1.c0
        public void a(m1.c0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            this.f8616c = ((a) value).f8616c;
        }

        @Override // m1.c0
        public m1.c0 b() {
            return new a(this.f8616c);
        }

        public final T g() {
            return this.f8616c;
        }

        public final void h(T t11) {
            this.f8616c = t11;
        }
    }

    public l1(T t11, m1<T> policy) {
        kotlin.jvm.internal.s.g(policy, "policy");
        this.f8614a = policy;
        this.f8615b = new a<>(t11);
    }

    @Override // m1.b0
    public m1.c0 b() {
        return this.f8615b;
    }

    @Override // m1.b0
    public m1.c0 c(m1.c0 previous, m1.c0 current, m1.c0 applied) {
        kotlin.jvm.internal.s.g(previous, "previous");
        kotlin.jvm.internal.s.g(current, "current");
        kotlin.jvm.internal.s.g(applied, "applied");
        a aVar = (a) previous;
        a aVar2 = (a) current;
        a aVar3 = (a) applied;
        if (d().b((T) aVar2.g(), (T) aVar3.g())) {
            return current;
        }
        T a11 = d().a((T) aVar.g(), (T) aVar2.g(), (T) aVar3.g());
        if (a11 != null) {
            m1.c0 b11 = aVar3.b();
            ((a) b11).h(a11);
            return b11;
        }
        return null;
    }

    @Override // m1.q
    public m1<T> d() {
        return this.f8614a;
    }

    @Override // m1.b0
    public void e(m1.c0 value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f8615b = (a) value;
    }

    @Override // c1.o0, c1.v1
    public T getValue() {
        return (T) ((a) m1.l.K(this.f8615b, this)).g();
    }

    @Override // c1.o0
    public void setValue(T t11) {
        m1.h a11;
        a<T> aVar = this.f8615b;
        h.a aVar2 = m1.h.f38186d;
        a aVar3 = (a) m1.l.x(aVar, aVar2.a());
        if (d().b((T) aVar3.g(), t11)) {
            return;
        }
        a<T> aVar4 = this.f8615b;
        m1.l.A();
        synchronized (m1.l.z()) {
            a11 = aVar2.a();
            ((a) m1.l.H(aVar4, this, a11, aVar3)).h(t11);
            vz.b0 b0Var = vz.b0.f54756a;
        }
        m1.l.F(a11, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) m1.l.x(this.f8615b, m1.h.f38186d.a())).g() + ")@" + hashCode();
    }
}
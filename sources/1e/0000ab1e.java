package pn;

import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.u;
import com.google.gson.v;

/* loaded from: classes2.dex */
public final class l<T> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q<T> f46745a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.gson.j<T> f46746b;

    /* renamed from: c  reason: collision with root package name */
    final com.google.gson.e f46747c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f46748d;

    /* renamed from: e  reason: collision with root package name */
    private final v f46749e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f46750f = new b();

    /* renamed from: g  reason: collision with root package name */
    private volatile u<T> f46751g;

    /* loaded from: classes2.dex */
    private final class b implements p, com.google.gson.i {
        private b() {
        }

        @Override // com.google.gson.p
        public com.google.gson.k a(Object obj) {
            return l.this.f46747c.x(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements v {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f46753a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f46754b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<?> f46755c;

        /* renamed from: d  reason: collision with root package name */
        private final q<?> f46756d;

        /* renamed from: e  reason: collision with root package name */
        private final com.google.gson.j<?> f46757e;

        c(Object obj, com.google.gson.reflect.a<?> aVar, boolean z11, Class<?> cls) {
            q<?> qVar = obj instanceof q ? (q) obj : null;
            this.f46756d = qVar;
            com.google.gson.j<?> jVar = obj instanceof com.google.gson.j ? (com.google.gson.j) obj : null;
            this.f46757e = jVar;
            on.a.a((qVar == null && jVar == null) ? false : true);
            this.f46753a = aVar;
            this.f46754b = z11;
            this.f46755c = cls;
        }

        @Override // com.google.gson.v
        public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            boolean isAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f46753a;
            if (aVar2 != null) {
                isAssignableFrom = aVar2.equals(aVar) || (this.f46754b && this.f46753a.getType() == aVar.getRawType());
            } else {
                isAssignableFrom = this.f46755c.isAssignableFrom(aVar.getRawType());
            }
            if (isAssignableFrom) {
                return new l(this.f46756d, this.f46757e, eVar, aVar, this);
            }
            return null;
        }
    }

    public l(q<T> qVar, com.google.gson.j<T> jVar, com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar, v vVar) {
        this.f46745a = qVar;
        this.f46746b = jVar;
        this.f46747c = eVar;
        this.f46748d = aVar;
        this.f46749e = vVar;
    }

    private u<T> e() {
        u<T> uVar = this.f46751g;
        if (uVar != null) {
            return uVar;
        }
        u<T> m11 = this.f46747c.m(this.f46749e, this.f46748d);
        this.f46751g = m11;
        return m11;
    }

    public static v f(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    @Override // com.google.gson.u
    public T b(tn.a aVar) {
        if (this.f46746b == null) {
            return e().b(aVar);
        }
        com.google.gson.k a11 = on.l.a(aVar);
        if (a11.i()) {
            return null;
        }
        return this.f46746b.deserialize(a11, this.f46748d.getType(), this.f46750f);
    }

    @Override // com.google.gson.u
    public void d(com.google.gson.stream.b bVar, T t11) {
        q<T> qVar = this.f46745a;
        if (qVar == null) {
            e().d(bVar, t11);
        } else if (t11 == null) {
            bVar.n0();
        } else {
            on.l.b(qVar.serialize(t11, this.f46748d.getType(), this.f46750f), bVar);
        }
    }
}
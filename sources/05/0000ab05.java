package pn;

import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    private final on.c f46695a;

    /* loaded from: classes2.dex */
    private static final class a<E> extends u<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final u<E> f46696a;

        /* renamed from: b  reason: collision with root package name */
        private final on.i<? extends Collection<E>> f46697b;

        public a(com.google.gson.e eVar, Type type, u<E> uVar, on.i<? extends Collection<E>> iVar) {
            this.f46696a = new m(eVar, uVar, type);
            this.f46697b = iVar;
        }

        @Override // com.google.gson.u
        /* renamed from: e */
        public Collection<E> b(tn.a aVar) {
            if (aVar.Q0() == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            Collection<E> construct = this.f46697b.construct();
            aVar.a();
            while (aVar.R()) {
                construct.add(this.f46696a.b(aVar));
            }
            aVar.p();
            return construct;
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public void d(com.google.gson.stream.b bVar, Collection<E> collection) {
            if (collection == null) {
                bVar.n0();
                return;
            }
            bVar.j();
            for (E e11 : collection) {
                this.f46696a.d(bVar, e11);
            }
            bVar.p();
        }
    }

    public b(on.c cVar) {
        this.f46695a = cVar;
    }

    @Override // com.google.gson.v
    public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (Collection.class.isAssignableFrom(rawType)) {
            Type h11 = on.b.h(type, rawType);
            return new a(eVar, h11, eVar.k(com.google.gson.reflect.a.get(h11)), this.f46695a.a(aVar));
        }
        return null;
    }
}
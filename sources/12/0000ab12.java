package pn;

import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.JsonSyntaxException;
import com.google.gson.o;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h implements v {

    /* renamed from: a  reason: collision with root package name */
    private final on.c f46715a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f46716b;

    /* loaded from: classes2.dex */
    private final class a<K, V> extends u<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final u<K> f46717a;

        /* renamed from: b  reason: collision with root package name */
        private final u<V> f46718b;

        /* renamed from: c  reason: collision with root package name */
        private final on.i<? extends Map<K, V>> f46719c;

        public a(com.google.gson.e eVar, Type type, u<K> uVar, Type type2, u<V> uVar2, on.i<? extends Map<K, V>> iVar) {
            this.f46717a = new m(eVar, uVar, type);
            this.f46718b = new m(eVar, uVar2, type2);
            this.f46719c = iVar;
        }

        private String e(com.google.gson.k kVar) {
            if (kVar.k()) {
                o d11 = kVar.d();
                if (d11.s()) {
                    return String.valueOf(d11.p());
                }
                if (d11.q()) {
                    return Boolean.toString(d11.m());
                }
                if (d11.t()) {
                    return d11.f();
                }
                throw new AssertionError();
            } else if (kVar.i()) {
                return Address.ADDRESS_NULL_PLACEHOLDER;
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.u
        /* renamed from: f */
        public Map<K, V> b(tn.a aVar) {
            com.google.gson.stream.a Q0 = aVar.Q0();
            if (Q0 == com.google.gson.stream.a.NULL) {
                aVar.G0();
                return null;
            }
            Map<K, V> construct = this.f46719c.construct();
            if (Q0 == com.google.gson.stream.a.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.R()) {
                    aVar.a();
                    K b11 = this.f46717a.b(aVar);
                    if (construct.put(b11, this.f46718b.b(aVar)) == null) {
                        aVar.p();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b11);
                    }
                }
                aVar.p();
            } else {
                aVar.g();
                while (aVar.R()) {
                    on.f.f42809a.a(aVar);
                    K b12 = this.f46717a.b(aVar);
                    if (construct.put(b12, this.f46718b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b12);
                    }
                }
                aVar.C();
            }
            return construct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.u
        /* renamed from: g */
        public void d(com.google.gson.stream.b bVar, Map<K, V> map) {
            if (map == null) {
                bVar.n0();
            } else if (!h.this.f46716b) {
                bVar.l();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.a0(String.valueOf(entry.getKey()));
                    this.f46718b.d(bVar, entry.getValue());
                }
                bVar.C();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i11 = 0;
                boolean z11 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    com.google.gson.k c11 = this.f46717a.c(entry2.getKey());
                    arrayList.add(c11);
                    arrayList2.add(entry2.getValue());
                    z11 |= c11.h() || c11.j();
                }
                if (z11) {
                    bVar.j();
                    int size = arrayList.size();
                    while (i11 < size) {
                        bVar.j();
                        on.l.b((com.google.gson.k) arrayList.get(i11), bVar);
                        this.f46718b.d(bVar, arrayList2.get(i11));
                        bVar.p();
                        i11++;
                    }
                    bVar.p();
                    return;
                }
                bVar.l();
                int size2 = arrayList.size();
                while (i11 < size2) {
                    bVar.a0(e((com.google.gson.k) arrayList.get(i11)));
                    this.f46718b.d(bVar, arrayList2.get(i11));
                    i11++;
                }
                bVar.C();
            }
        }
    }

    public h(on.c cVar, boolean z11) {
        this.f46715a = cVar;
        this.f46716b = z11;
    }

    private u<?> b(com.google.gson.e eVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return eVar.k(com.google.gson.reflect.a.get(type));
        }
        return n.f46766f;
    }

    @Override // com.google.gson.v
    public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        if (Map.class.isAssignableFrom(aVar.getRawType())) {
            Type[] j11 = on.b.j(type, on.b.k(type));
            return new a(eVar, j11[0], b(eVar, j11[0]), j11[1], eVar.k(com.google.gson.reflect.a.get(j11[1])), this.f46715a.a(aVar));
        }
        return null;
    }
}
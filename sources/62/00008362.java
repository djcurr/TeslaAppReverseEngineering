package lr;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import n00.h;
import n00.k;
import n00.l;
import n00.o;
import wz.g;
import wz.w;
import wz.x;

/* loaded from: classes2.dex */
public final class a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h<T> f37297a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C0707a<T, Object>> f37298b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C0707a<T, Object>> f37299c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f37300d;

    /* renamed from: lr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0707a<K, P> {

        /* renamed from: a  reason: collision with root package name */
        private final String f37301a;

        /* renamed from: b  reason: collision with root package name */
        private final String f37302b;

        /* renamed from: c  reason: collision with root package name */
        private final f<P> f37303c;

        /* renamed from: d  reason: collision with root package name */
        private final o<K, P> f37304d;

        /* renamed from: e  reason: collision with root package name */
        private final l f37305e;

        /* renamed from: f  reason: collision with root package name */
        private final int f37306f;

        /* JADX WARN: Multi-variable type inference failed */
        public C0707a(String name, String str, f<P> adapter, o<K, ? extends P> property, l lVar, int i11) {
            s.g(name, "name");
            s.g(adapter, "adapter");
            s.g(property, "property");
            this.f37301a = name;
            this.f37302b = str;
            this.f37303c = adapter;
            this.f37304d = property;
            this.f37305e = lVar;
            this.f37306f = i11;
        }

        public static /* synthetic */ C0707a b(C0707a c0707a, String str, String str2, f fVar, o oVar, l lVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = c0707a.f37301a;
            }
            if ((i12 & 2) != 0) {
                str2 = c0707a.f37302b;
            }
            String str3 = str2;
            f<P> fVar2 = fVar;
            if ((i12 & 4) != 0) {
                fVar2 = c0707a.f37303c;
            }
            f fVar3 = fVar2;
            o<K, P> oVar2 = oVar;
            if ((i12 & 8) != 0) {
                oVar2 = c0707a.f37304d;
            }
            o oVar3 = oVar2;
            if ((i12 & 16) != 0) {
                lVar = c0707a.f37305e;
            }
            l lVar2 = lVar;
            if ((i12 & 32) != 0) {
                i11 = c0707a.f37306f;
            }
            return c0707a.a(str, str3, fVar3, oVar3, lVar2, i11);
        }

        public final C0707a<K, P> a(String name, String str, f<P> adapter, o<K, ? extends P> property, l lVar, int i11) {
            s.g(name, "name");
            s.g(adapter, "adapter");
            s.g(property, "property");
            return new C0707a<>(name, str, adapter, property, lVar, i11);
        }

        public final P c(K k11) {
            return this.f37304d.get(k11);
        }

        public final f<P> d() {
            return this.f37303c;
        }

        public final String e() {
            return this.f37302b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C0707a) {
                    C0707a c0707a = (C0707a) obj;
                    return s.c(this.f37301a, c0707a.f37301a) && s.c(this.f37302b, c0707a.f37302b) && s.c(this.f37303c, c0707a.f37303c) && s.c(this.f37304d, c0707a.f37304d) && s.c(this.f37305e, c0707a.f37305e) && this.f37306f == c0707a.f37306f;
                }
                return false;
            }
            return true;
        }

        public final String f() {
            return this.f37301a;
        }

        public final o<K, P> g() {
            return this.f37304d;
        }

        public final int h() {
            return this.f37306f;
        }

        public int hashCode() {
            String str = this.f37301a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f37302b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            f<P> fVar = this.f37303c;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            o<K, P> oVar = this.f37304d;
            int hashCode4 = (hashCode3 + (oVar != null ? oVar.hashCode() : 0)) * 31;
            l lVar = this.f37305e;
            return ((hashCode4 + (lVar != null ? lVar.hashCode() : 0)) * 31) + this.f37306f;
        }

        public final void i(K k11, P p11) {
            Object obj;
            obj = c.f37310b;
            if (p11 != obj) {
                o<K, P> oVar = this.f37304d;
                Objects.requireNonNull(oVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                ((k) oVar).D(k11, p11);
            }
        }

        public String toString() {
            return "Binding(name=" + this.f37301a + ", jsonName=" + this.f37302b + ", adapter=" + this.f37303c + ", property=" + this.f37304d + ", parameter=" + this.f37305e + ", propertyIndex=" + this.f37306f + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends g<l, Object> {

        /* renamed from: a  reason: collision with root package name */
        private final List<l> f37307a;

        /* renamed from: b  reason: collision with root package name */
        private final Object[] f37308b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends l> parameterKeys, Object[] parameterValues) {
            s.g(parameterKeys, "parameterKeys");
            s.g(parameterValues, "parameterValues");
            this.f37307a = parameterKeys;
            this.f37308b = parameterValues;
        }

        @Override // wz.g
        public Set<Map.Entry<l, Object>> a() {
            int t11;
            Object obj;
            List<l> list = this.f37307a;
            t11 = x.t(list, 10);
            ArrayList arrayList = new ArrayList(t11);
            int i11 = 0;
            for (T t12 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.s();
                }
                arrayList.add(new AbstractMap.SimpleEntry((l) t12, this.f37308b[i11]));
                i11 = i12;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t13 : arrayList) {
                Object value = ((AbstractMap.SimpleEntry) t13).getValue();
                obj = c.f37310b;
                if (value != obj) {
                    linkedHashSet.add(t13);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof l) {
                return f((l) obj);
            }
            return false;
        }

        public boolean f(l key) {
            Object obj;
            s.g(key, "key");
            Object obj2 = this.f37308b[key.getIndex()];
            obj = c.f37310b;
            return obj2 != obj;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof l) {
                return h((l) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return obj instanceof l ? i((l) obj, obj2) : obj2;
        }

        public Object h(l key) {
            Object obj;
            s.g(key, "key");
            Object obj2 = this.f37308b[key.getIndex()];
            obj = c.f37310b;
            if (obj2 != obj) {
                return obj2;
            }
            return null;
        }

        public /* bridge */ Object i(l lVar, Object obj) {
            return super.getOrDefault(lVar, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: j */
        public Object put(l key, Object obj) {
            s.g(key, "key");
            return null;
        }

        public /* bridge */ Object k(l lVar) {
            return super.remove(lVar);
        }

        public /* bridge */ boolean m(l lVar, Object obj) {
            return super.remove(lVar, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof l) {
                return k((l) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof l) {
                return m((l) obj, obj2);
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(n00.h<? extends T> constructor, List<C0707a<T, Object>> allBindings, List<C0707a<T, Object>> nonTransientBindings, h.b options) {
        s.g(constructor, "constructor");
        s.g(allBindings, "allBindings");
        s.g(nonTransientBindings, "nonTransientBindings");
        s.g(options, "options");
        this.f37297a = constructor;
        this.f37298b = allBindings;
        this.f37299c = nonTransientBindings;
        this.f37300d = options;
    }

    @Override // com.squareup.moshi.f
    public T b(com.squareup.moshi.h reader) {
        T callBy;
        Object obj;
        Object obj2;
        Object obj3;
        s.g(reader, "reader");
        int size = this.f37297a.getParameters().size();
        int size2 = this.f37298b.size();
        Object[] objArr = new Object[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            obj3 = c.f37310b;
            objArr[i11] = obj3;
        }
        reader.g();
        while (reader.p()) {
            int G0 = reader.G0(this.f37300d);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else {
                C0707a<T, Object> c0707a = this.f37299c.get(G0);
                int h11 = c0707a.h();
                Object obj4 = objArr[h11];
                obj2 = c.f37310b;
                if (obj4 == obj2) {
                    objArr[h11] = c0707a.d().b(reader);
                    if (objArr[h11] == null && !c0707a.g().getReturnType().e()) {
                        JsonDataException v11 = kr.b.v(c0707a.g().getName(), c0707a.e(), reader);
                        s.f(v11, "Util.unexpectedNull(\n   …         reader\n        )");
                        throw v11;
                    }
                } else {
                    throw new JsonDataException("Multiple values for '" + c0707a.g().getName() + "' at " + reader.getPath());
                }
            }
        }
        reader.l();
        boolean z11 = this.f37298b.size() == size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj5 = objArr[i12];
            obj = c.f37310b;
            if (obj5 == obj) {
                if (this.f37297a.getParameters().get(i12).q()) {
                    z11 = false;
                } else {
                    if (!this.f37297a.getParameters().get(i12).getType().e()) {
                        String name = this.f37297a.getParameters().get(i12).getName();
                        C0707a<T, Object> c0707a2 = this.f37298b.get(i12);
                        JsonDataException m11 = kr.b.m(name, c0707a2 != null ? c0707a2.e() : null, reader);
                        s.f(m11, "Util.missingProperty(\n  …       reader\n          )");
                        throw m11;
                    }
                    objArr[i12] = null;
                }
            }
        }
        if (z11) {
            callBy = this.f37297a.call(Arrays.copyOf(objArr, size2));
        } else {
            callBy = this.f37297a.callBy(new b(this.f37297a.getParameters(), objArr));
        }
        int size3 = this.f37298b.size();
        while (size < size3) {
            C0707a<T, Object> c0707a3 = this.f37298b.get(size);
            s.e(c0707a3);
            c0707a3.i(callBy, objArr[size]);
            size++;
        }
        return callBy;
    }

    @Override // com.squareup.moshi.f
    public void j(m writer, T t11) {
        s.g(writer, "writer");
        Objects.requireNonNull(t11, "value == null");
        writer.j();
        for (C0707a<T, Object> c0707a : this.f37298b) {
            if (c0707a != null) {
                writer.L(c0707a.f());
                c0707a.d().j(writer, c0707a.c(t11));
            }
        }
        writer.C();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.f37297a.getReturnType() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
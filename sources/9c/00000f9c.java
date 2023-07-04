package c30;

import g30.d0;
import g30.d1;
import g30.e1;
import g30.f0;
import g30.n1;
import g30.o0;
import g30.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.p;
import n00.r;
import vz.u;
import wz.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class j {
    private static final b<? extends Object> a(i30.c cVar, List<? extends p> list, n00.d<Object> dVar, boolean z11) {
        ArrayList arrayList;
        int t11;
        int t12;
        if (z11) {
            t12 = x.t(list, 10);
            arrayList = new ArrayList(t12);
            for (p pVar : list) {
                arrayList.add(i.b(cVar, pVar));
            }
        } else {
            t11 = x.t(list, 10);
            arrayList = new ArrayList(t11);
            for (p pVar2 : list) {
                b<Object> c11 = i.c(cVar, pVar2);
                if (c11 == null) {
                    return null;
                }
                arrayList.add(c11);
            }
        }
        if (s.c(dVar, m0.b(Collection.class)) ? true : s.c(dVar, m0.b(List.class)) ? true : s.c(dVar, m0.b(List.class)) ? true : s.c(dVar, m0.b(ArrayList.class))) {
            return new g30.f((b) arrayList.get(0));
        }
        if (s.c(dVar, m0.b(HashSet.class))) {
            return new f0((b) arrayList.get(0));
        }
        if (s.c(dVar, m0.b(Set.class)) ? true : s.c(dVar, m0.b(Set.class)) ? true : s.c(dVar, m0.b(LinkedHashSet.class))) {
            return new q0((b) arrayList.get(0));
        }
        if (s.c(dVar, m0.b(HashMap.class))) {
            return new d0((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (s.c(dVar, m0.b(Map.class)) ? true : s.c(dVar, m0.b(Map.class)) ? true : s.c(dVar, m0.b(LinkedHashMap.class))) {
            return new o0((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (s.c(dVar, m0.b(Map.Entry.class))) {
            return d30.a.j((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (s.c(dVar, m0.b(vz.p.class))) {
            return d30.a.l((b) arrayList.get(0), (b) arrayList.get(1));
        }
        if (s.c(dVar, m0.b(u.class))) {
            return d30.a.n((b) arrayList.get(0), (b) arrayList.get(1), (b) arrayList.get(2));
        }
        if (d1.k(dVar)) {
            n00.f c12 = list.get(0).c();
            Objects.requireNonNull(c12, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return d30.a.a((n00.d) c12, (b) arrayList.get(0));
        }
        Object[] array = arrayList.toArray(new b[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        b[] bVarArr = (b[]) array;
        b<? extends Object> d11 = d1.d(dVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return d11 == null ? i.a(cVar, dVar, arrayList) : d11;
    }

    private static final <T> b<T> b(b<T> bVar, boolean z11) {
        return z11 ? d30.a.o(bVar) : bVar;
    }

    public static final <T> b<T> c(i30.c cVar, n00.d<T> kClass, List<? extends b<Object>> typeArgumentsSerializers) {
        s.g(cVar, "<this>");
        s.g(kClass, "kClass");
        s.g(typeArgumentsSerializers, "typeArgumentsSerializers");
        b<T> d11 = i.d(kClass);
        return d11 == null ? cVar.b(kClass, typeArgumentsSerializers) : d11;
    }

    public static final b<Object> d(i30.c cVar, p type) {
        s.g(cVar, "<this>");
        s.g(type, "type");
        b<Object> e11 = e(cVar, type, true);
        if (e11 != null) {
            return e11;
        }
        d1.l(e1.c(type));
        throw new KotlinNothingValueException();
    }

    private static final b<Object> e(i30.c cVar, p pVar, boolean z11) {
        int t11;
        b<? extends Object> a11;
        n00.d<Object> c11 = e1.c(pVar);
        boolean e11 = pVar.e();
        List<r> f11 = pVar.f();
        t11 = x.t(f11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (r rVar : f11) {
            p c12 = rVar.c();
            if (c12 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + pVar).toString());
            }
            arrayList.add(c12);
        }
        if (arrayList.isEmpty()) {
            a11 = i.d(c11);
            if (a11 == null) {
                a11 = i30.c.c(cVar, c11, null, 2, null);
            }
        } else {
            a11 = a(cVar, arrayList, c11, z11);
        }
        if (a11 == null) {
            a11 = null;
        }
        if (a11 != null) {
            return b(a11, e11);
        }
        return null;
    }

    public static final b<Object> f(i30.c cVar, p type) {
        s.g(cVar, "<this>");
        s.g(type, "type");
        return e(cVar, type, false);
    }

    public static final <T> b<T> g(n00.d<T> dVar) {
        s.g(dVar, "<this>");
        b<T> b11 = d1.b(dVar);
        return b11 == null ? n1.b(dVar) : b11;
    }
}
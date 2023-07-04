package io.realm;

import io.realm.a;
import io.realm.annotations.RealmModule;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.m;
import io.realm.v0;
import io.realm.x0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RealmModule
/* loaded from: classes5.dex */
class DefaultRealmModuleMediator extends io.realm.internal.n {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Class<? extends l0>> f31730a;

    static {
        HashSet hashSet = new HashSet(2);
        hashSet.add(ct.l.class);
        hashSet.add(ct.j.class);
        f31730a = Collections.unmodifiableSet(hashSet);
    }

    DefaultRealmModuleMediator() {
    }

    @Override // io.realm.internal.n
    public <E extends l0> E c(a0 a0Var, E e11, boolean z11, Map<l0, io.realm.internal.m> map, Set<o> set) {
        Class<?> superclass = e11 instanceof io.realm.internal.m ? e11.getClass().getSuperclass() : e11.getClass();
        if (superclass.equals(ct.l.class)) {
            return (E) superclass.cast(x0.l(a0Var, (x0.a) a0Var.L().e(ct.l.class), (ct.l) e11, z11, map, set));
        }
        if (superclass.equals(ct.j.class)) {
            return (E) superclass.cast(v0.p(a0Var, (v0.a) a0Var.L().e(ct.j.class), (ct.j) e11, z11, map, set));
        }
        throw io.realm.internal.n.i(superclass);
    }

    @Override // io.realm.internal.n
    public io.realm.internal.c d(Class<? extends l0> cls, OsSchemaInfo osSchemaInfo) {
        io.realm.internal.n.a(cls);
        if (cls.equals(ct.l.class)) {
            return x0.m(osSchemaInfo);
        }
        if (cls.equals(ct.j.class)) {
            return v0.q(osSchemaInfo);
        }
        throw io.realm.internal.n.i(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E e(E e11, int i11, Map<l0, m.a<l0>> map) {
        Class<? super Object> superclass = e11.getClass().getSuperclass();
        if (superclass.equals(ct.l.class)) {
            return (E) superclass.cast(x0.n((ct.l) e11, 0, i11, map));
        }
        if (superclass.equals(ct.j.class)) {
            return (E) superclass.cast(v0.r((ct.j) e11, 0, i11, map));
        }
        throw io.realm.internal.n.i(superclass);
    }

    @Override // io.realm.internal.n
    public Class<? extends l0> g(String str) {
        io.realm.internal.n.b(str);
        if (str.equals("RealmRawItem")) {
            return ct.l.class;
        }
        if (str.equals("RealmItem")) {
            return ct.j.class;
        }
        throw io.realm.internal.n.j(str);
    }

    @Override // io.realm.internal.n
    public Map<Class<? extends l0>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(ct.l.class, x0.p());
        hashMap.put(ct.j.class, v0.t());
        return hashMap;
    }

    @Override // io.realm.internal.n
    public Set<Class<? extends l0>> k() {
        return f31730a;
    }

    @Override // io.realm.internal.n
    public String m(Class<? extends l0> cls) {
        io.realm.internal.n.a(cls);
        if (cls.equals(ct.l.class)) {
            return "RealmRawItem";
        }
        if (cls.equals(ct.j.class)) {
            return "RealmItem";
        }
        throw io.realm.internal.n.i(cls);
    }

    @Override // io.realm.internal.n
    public boolean o(Class<? extends l0> cls) {
        return ct.l.class.isAssignableFrom(cls) || ct.j.class.isAssignableFrom(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> boolean p(Class<E> cls) {
        if (cls.equals(ct.l.class) || cls.equals(ct.j.class)) {
            return false;
        }
        throw io.realm.internal.n.i(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E q(Class<E> cls, Object obj, io.realm.internal.o oVar, io.realm.internal.c cVar, boolean z11, List<String> list) {
        a.d dVar = a.f31739i.get();
        try {
            dVar.g((a) obj, oVar, cVar, z11, list);
            io.realm.internal.n.a(cls);
            if (cls.equals(ct.l.class)) {
                return cls.cast(new x0());
            }
            if (cls.equals(ct.j.class)) {
                return cls.cast(new v0());
            }
            throw io.realm.internal.n.i(cls);
        } finally {
            dVar.a();
        }
    }

    @Override // io.realm.internal.n
    public boolean r() {
        return true;
    }
}
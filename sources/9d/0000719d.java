package gz;

import io.realm.a0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.m;
import io.realm.internal.n;
import io.realm.l0;
import io.realm.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class a extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends l0>, n> f28524a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Class<? extends l0>> f28525b = new HashMap();

    public a(n... nVarArr) {
        HashMap hashMap = new HashMap();
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                for (Class<? extends l0> cls : nVar.k()) {
                    String l11 = nVar.l(cls);
                    Class<? extends l0> cls2 = this.f28525b.get(l11);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, hashMap.get(cls2), nVar, l11));
                    }
                    hashMap.put(cls, nVar);
                    this.f28525b.put(l11, cls);
                }
            }
        }
        this.f28524a = Collections.unmodifiableMap(hashMap);
    }

    private n s(Class<? extends l0> cls) {
        n nVar = this.f28524a.get(cls);
        if (nVar != null) {
            return nVar;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    private n t(String str) {
        return s(this.f28525b.get(str));
    }

    @Override // io.realm.internal.n
    public <E extends l0> E c(a0 a0Var, E e11, boolean z11, Map<l0, m> map, Set<o> set) {
        return (E) s(Util.b(e11.getClass())).c(a0Var, e11, z11, map, set);
    }

    @Override // io.realm.internal.n
    public c d(Class<? extends l0> cls, OsSchemaInfo osSchemaInfo) {
        return s(cls).d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E e(E e11, int i11, Map<l0, m.a<l0>> map) {
        return (E) s(Util.b(e11.getClass())).e(e11, i11, map);
    }

    @Override // io.realm.internal.n
    protected <T extends l0> Class<T> g(String str) {
        return t(str).f(str);
    }

    @Override // io.realm.internal.n
    public Map<Class<? extends l0>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        for (n nVar : this.f28524a.values()) {
            hashMap.putAll(nVar.h());
        }
        return hashMap;
    }

    @Override // io.realm.internal.n
    public Set<Class<? extends l0>> k() {
        return this.f28524a.keySet();
    }

    @Override // io.realm.internal.n
    protected String m(Class<? extends l0> cls) {
        return s(cls).l(cls);
    }

    @Override // io.realm.internal.n
    protected boolean o(Class<? extends l0> cls) {
        return s(cls).n(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> boolean p(Class<E> cls) {
        return s(Util.b(cls)).p(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E q(Class<E> cls, Object obj, io.realm.internal.o oVar, c cVar, boolean z11, List<String> list) {
        return (E) s(cls).q(cls, obj, oVar, cVar, z11, list);
    }

    @Override // io.realm.internal.n
    public boolean r() {
        for (Map.Entry<Class<? extends l0>, n> entry : this.f28524a.entrySet()) {
            if (!entry.getValue().r()) {
                return false;
            }
        }
        return true;
    }
}
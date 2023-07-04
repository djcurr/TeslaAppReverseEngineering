package gz;

import io.realm.a0;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.m;
import io.realm.internal.n;
import io.realm.l0;
import io.realm.o;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class b extends n {

    /* renamed from: a  reason: collision with root package name */
    private final n f28526a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<? extends l0>> f28527b;

    public b(n nVar, Collection<Class<? extends l0>> collection, boolean z11) {
        this.f28526a = nVar;
        HashSet hashSet = new HashSet();
        if (nVar != null) {
            Set<Class<? extends l0>> k11 = nVar.k();
            if (!z11) {
                for (Class<? extends l0> cls : collection) {
                    if (k11.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class<? extends l0> cls2 : k11) {
                    if (!collection.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.f28527b = Collections.unmodifiableSet(hashSet);
    }

    private void s(Class<? extends l0> cls) {
        if (this.f28527b.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    @Override // io.realm.internal.n
    public <E extends l0> E c(a0 a0Var, E e11, boolean z11, Map<l0, m> map, Set<o> set) {
        s(Util.b(e11.getClass()));
        return (E) this.f28526a.c(a0Var, e11, z11, map, set);
    }

    @Override // io.realm.internal.n
    public c d(Class<? extends l0> cls, OsSchemaInfo osSchemaInfo) {
        s(cls);
        return this.f28526a.d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E e(E e11, int i11, Map<l0, m.a<l0>> map) {
        s(Util.b(e11.getClass()));
        return (E) this.f28526a.e(e11, i11, map);
    }

    @Override // io.realm.internal.n
    protected <T extends l0> Class<T> g(String str) {
        return this.f28526a.f(str);
    }

    @Override // io.realm.internal.n
    public Map<Class<? extends l0>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class<? extends l0>, OsObjectSchemaInfo> entry : this.f28526a.h().entrySet()) {
            if (this.f28527b.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    @Override // io.realm.internal.n
    public Set<Class<? extends l0>> k() {
        return this.f28527b;
    }

    @Override // io.realm.internal.n
    protected String m(Class<? extends l0> cls) {
        s(cls);
        return this.f28526a.l(cls);
    }

    @Override // io.realm.internal.n
    protected boolean o(Class<? extends l0> cls) {
        return this.f28526a.n(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> boolean p(Class<E> cls) {
        s(Util.b(cls));
        return this.f28526a.p(cls);
    }

    @Override // io.realm.internal.n
    public <E extends l0> E q(Class<E> cls, Object obj, io.realm.internal.o oVar, c cVar, boolean z11, List<String> list) {
        s(cls);
        return (E) this.f28526a.q(cls, obj, oVar, cVar, z11, list);
    }

    @Override // io.realm.internal.n
    public boolean r() {
        n nVar = this.f28526a;
        if (nVar == null) {
            return true;
        }
        return nVar.r();
    }
}
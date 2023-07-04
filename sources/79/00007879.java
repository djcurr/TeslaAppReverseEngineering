package io.realm.internal;

import io.realm.a0;
import io.realm.exceptions.RealmException;
import io.realm.internal.m;
import io.realm.l0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Class<? extends l0> cls) {
        Objects.requireNonNull(cls, "A class extending RealmObject must be provided");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException i(Class<? extends l0> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException j(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", str));
    }

    public abstract <E extends l0> E c(a0 a0Var, E e11, boolean z11, Map<l0, m> map, Set<io.realm.o> set);

    public abstract c d(Class<? extends l0> cls, OsSchemaInfo osSchemaInfo);

    public abstract <E extends l0> E e(E e11, int i11, Map<l0, m.a<l0>> map);

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return k().equals(((n) obj).k());
        }
        return false;
    }

    public final <T extends l0> Class<T> f(String str) {
        return g(str);
    }

    protected abstract <T extends l0> Class<T> g(String str);

    public abstract Map<Class<? extends l0>, OsObjectSchemaInfo> h();

    public int hashCode() {
        return k().hashCode();
    }

    public abstract Set<Class<? extends l0>> k();

    public final String l(Class<? extends l0> cls) {
        return m(Util.b(cls));
    }

    protected abstract String m(Class<? extends l0> cls);

    public boolean n(Class<? extends l0> cls) {
        return o(cls);
    }

    protected abstract boolean o(Class<? extends l0> cls);

    public abstract <E extends l0> boolean p(Class<E> cls);

    public abstract <E extends l0> E q(Class<E> cls, Object obj, o oVar, c cVar, boolean z11, List<String> list);

    public boolean r() {
        return false;
    }
}
package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Table> f31976a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends l0>, Table> f31977b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<? extends l0>, p0> f31978c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, p0> f31979d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private OsKeyPathMapping f31980e = null;

    /* renamed from: f  reason: collision with root package name */
    final a f31981f;

    /* renamed from: g  reason: collision with root package name */
    private final io.realm.internal.b f31982g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(a aVar, io.realm.internal.b bVar) {
        this.f31981f = aVar;
        this.f31982g = bVar;
    }

    private void a() {
        if (!k()) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    private boolean l(Class<? extends l0> cls, Class<? extends l0> cls2) {
        return cls.equals(cls2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(str2);
        }
    }

    public abstract p0 c(String str);

    public void d() {
        this.f31980e = new OsKeyPathMapping(this.f31981f.f31744e.getNativePtr());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final io.realm.internal.c e(Class<? extends l0> cls) {
        a();
        return this.f31982g.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final OsKeyPathMapping f() {
        return this.f31980e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0 g(Class<? extends l0> cls) {
        p0 p0Var = this.f31978c.get(cls);
        if (p0Var != null) {
            return p0Var;
        }
        Class<? extends l0> b11 = Util.b(cls);
        if (l(b11, cls)) {
            p0Var = this.f31978c.get(b11);
        }
        if (p0Var == null) {
            m mVar = new m(this.f31981f, this, i(cls), e(b11));
            this.f31978c.put(b11, mVar);
            p0Var = mVar;
        }
        if (l(b11, cls)) {
            this.f31978c.put(cls, p0Var);
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0 h(String str) {
        String q11 = Table.q(str);
        p0 p0Var = this.f31979d.get(q11);
        if (p0Var != null && p0Var.g().v() && p0Var.d().equals(str)) {
            return p0Var;
        }
        if (this.f31981f.R().hasTable(q11)) {
            a aVar = this.f31981f;
            m mVar = new m(aVar, this, aVar.R().getTable(q11));
            this.f31979d.put(q11, mVar);
            return mVar;
        }
        throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table i(Class<? extends l0> cls) {
        Table table = this.f31977b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends l0> b11 = Util.b(cls);
        if (l(b11, cls)) {
            table = this.f31977b.get(b11);
        }
        if (table == null) {
            table = this.f31981f.R().getTable(Table.q(this.f31981f.J().n().l(b11)));
            this.f31977b.put(b11, table);
        }
        if (l(b11, cls)) {
            this.f31977b.put(cls, table);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table j(String str) {
        String q11 = Table.q(str);
        Table table = this.f31976a.get(q11);
        if (table != null) {
            return table;
        }
        Table table2 = this.f31981f.R().getTable(q11);
        this.f31976a.put(q11, table2);
        return table2;
    }

    final boolean k() {
        return this.f31982g != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        io.realm.internal.b bVar = this.f31982g;
        if (bVar != null) {
            bVar.b();
        }
        this.f31976a.clear();
        this.f31977b.clear();
        this.f31978c.clear();
        this.f31979d.clear();
    }
}
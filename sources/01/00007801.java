package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;

/* loaded from: classes5.dex */
public class RealmQuery<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Table f31731a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31732b;

    /* renamed from: c  reason: collision with root package name */
    private final TableQuery f31733c;

    /* renamed from: d  reason: collision with root package name */
    private final p0 f31734d;

    /* renamed from: e  reason: collision with root package name */
    private Class<E> f31735e;

    /* renamed from: f  reason: collision with root package name */
    private String f31736f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31737g;

    private RealmQuery(a0 a0Var, Class<E> cls) {
        this.f31732b = a0Var;
        this.f31735e = cls;
        boolean z11 = !n(cls);
        this.f31737g = z11;
        if (!z11) {
            p0 g11 = a0Var.L().g(cls);
            this.f31734d = g11;
            Table g12 = g11.g();
            this.f31731a = g12;
            this.f31733c = g12.E();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends l0> RealmQuery<E> e(a0 a0Var, Class<E> cls) {
        return new RealmQuery<>(a0Var, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> RealmQuery<E> f(q0<E> q0Var) {
        Class<E> cls = q0Var.f31993b;
        if (cls == null) {
            return new RealmQuery<>((q0<j>) q0Var, q0Var.f31994c);
        }
        return new RealmQuery<>(q0Var, cls);
    }

    private q0<E> g(TableQuery tableQuery, boolean z11) {
        q0<E> q0Var;
        OsResults f11 = OsResults.f(this.f31732b.f31744e, tableQuery);
        if (o()) {
            q0Var = new q0<>(this.f31732b, f11, this.f31736f);
        } else {
            q0Var = new q0<>(this.f31732b, f11, this.f31735e);
        }
        if (z11) {
            q0Var.j();
        }
        return q0Var;
    }

    private static boolean n(Class<?> cls) {
        return l0.class.isAssignableFrom(cls);
    }

    private static native String nativeSerializeQuery(long j11);

    private boolean o() {
        return this.f31736f != null;
    }

    public RealmQuery<E> a() {
        this.f31732b.g();
        this.f31733c.a();
        return this;
    }

    public RealmQuery<E> b(String str, b0 b0Var, d dVar) {
        this.f31732b.g();
        if (dVar == d.SENSITIVE) {
            this.f31733c.c(this.f31732b.L().f(), str, b0Var);
        } else {
            this.f31733c.d(this.f31732b.L().f(), str, b0Var);
        }
        return this;
    }

    public RealmQuery<E> c(String str, String str2) {
        return d(str, str2, d.SENSITIVE);
    }

    public RealmQuery<E> d(String str, String str2, d dVar) {
        Util.a(str2, "value");
        this.f31732b.g();
        b(str, b0.b(str2), dVar);
        return this;
    }

    public RealmQuery<E> h(String str, b0 b0Var, d dVar) {
        this.f31732b.g();
        if (dVar == d.SENSITIVE) {
            this.f31733c.f(this.f31732b.L().f(), str, b0Var);
        } else {
            this.f31733c.g(this.f31732b.L().f(), str, b0Var);
        }
        return this;
    }

    public RealmQuery<E> i(String str, String str2) {
        return j(str, str2, d.SENSITIVE);
    }

    public RealmQuery<E> j(String str, String str2, d dVar) {
        this.f31732b.g();
        h(str, b0.b(str2), dVar);
        return this;
    }

    public q0<E> k() {
        this.f31732b.g();
        this.f31732b.a();
        return g(this.f31733c, true);
    }

    public RealmQuery<E> l(String str, String[] strArr) {
        return m(str, strArr, d.SENSITIVE);
    }

    public RealmQuery<E> m(String str, String[] strArr, d dVar) {
        this.f31732b.g();
        if (strArr != null && strArr.length != 0) {
            b0[] b0VarArr = new b0[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (strArr[i11] != null) {
                    b0VarArr[i11] = b0.b(strArr[i11]);
                } else {
                    b0VarArr[i11] = null;
                }
            }
            if (dVar == d.SENSITIVE) {
                this.f31733c.j(this.f31732b.L().f(), str, b0VarArr);
            } else {
                this.f31733c.k(this.f31732b.L().f(), str, b0VarArr);
            }
        } else {
            a();
        }
        return this;
    }

    public RealmQuery<E> p() {
        this.f31732b.g();
        this.f31733c.m();
        return this;
    }

    private RealmQuery(q0<E> q0Var, Class<E> cls) {
        a aVar = q0Var.f31992a;
        this.f31732b = aVar;
        this.f31735e = cls;
        boolean z11 = !n(cls);
        this.f31737g = z11;
        if (!z11) {
            this.f31734d = aVar.L().g(cls);
            this.f31731a = q0Var.f();
            this.f31733c = q0Var.e().s();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    private RealmQuery(q0<j> q0Var, String str) {
        a aVar = q0Var.f31992a;
        this.f31732b = aVar;
        this.f31736f = str;
        this.f31737g = false;
        p0 h11 = aVar.L().h(str);
        this.f31734d = h11;
        this.f31731a = h11.g();
        this.f31733c = q0Var.e().s();
    }
}
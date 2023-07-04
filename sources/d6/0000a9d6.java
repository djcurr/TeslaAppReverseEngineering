package p4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final z<Object> f45995a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f45996b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45997c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f45998d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private z<Object> f45999a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f46000b;

        /* renamed from: c  reason: collision with root package name */
        private Object f46001c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f46002d;

        public final g a() {
            z<Object> zVar = this.f45999a;
            if (zVar == null) {
                zVar = z.f46178c.a(this.f46001c);
            }
            return new g(zVar, this.f46000b, this.f46001c, this.f46002d);
        }

        public final a b(boolean z11) {
            this.f46000b = z11;
            return this;
        }

        public final <T> a c(z<T> type) {
            kotlin.jvm.internal.s.g(type, "type");
            this.f45999a = type;
            return this;
        }
    }

    public g(z<Object> type, boolean z11, Object obj, boolean z12) {
        kotlin.jvm.internal.s.g(type, "type");
        boolean z13 = false;
        if (!(type.c() || !z11)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p(type.b(), " does not allow nullable values").toString());
        }
        if ((!z11 && z12 && obj == null) ? z13 : true) {
            this.f45995a = type;
            this.f45996b = z11;
            this.f45998d = obj;
            this.f45997c = z12;
            return;
        }
        throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
    }

    public final z<Object> a() {
        return this.f45995a;
    }

    public final boolean b() {
        return this.f45997c;
    }

    public final boolean c() {
        return this.f45996b;
    }

    public final void d(String name, Bundle bundle) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(bundle, "bundle");
        if (this.f45997c) {
            this.f45995a.f(bundle, name, this.f45998d);
        }
    }

    public final boolean e(String name, Bundle bundle) {
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(bundle, "bundle");
        if (!this.f45996b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f45995a.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f45996b == gVar.f45996b && this.f45997c == gVar.f45997c && kotlin.jvm.internal.s.c(this.f45995a, gVar.f45995a)) {
            Object obj2 = this.f45998d;
            if (obj2 != null) {
                return kotlin.jvm.internal.s.c(obj2, gVar.f45998d);
            }
            return gVar.f45998d == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f45995a.hashCode() * 31) + (this.f45996b ? 1 : 0)) * 31) + (this.f45997c ? 1 : 0)) * 31;
        Object obj = this.f45998d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }
}
package io.grpc;

import expo.modules.interfaces.permissions.PermissionsResponse;
import io.grpc.a;
import io.grpc.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c<Map<String, ?>> f31498a = a.c.a("health-checking-config");

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f31499a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.a f31500b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[][] f31501c;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f31502a;

            /* renamed from: b  reason: collision with root package name */
            private io.grpc.a f31503b = io.grpc.a.f30500c;

            /* renamed from: c  reason: collision with root package name */
            private Object[][] f31504c = (Object[][]) Array.newInstance(Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T> a c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
                this.f31504c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public b b() {
                return new b(this.f31502a, this.f31503b, this.f31504c);
            }

            public a d(x xVar) {
                this.f31502a = Collections.singletonList(xVar);
                return this;
            }

            public a e(List<x> list) {
                com.google.common.base.u.e(!list.isEmpty(), "addrs is empty");
                this.f31502a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(io.grpc.a aVar) {
                this.f31503b = (io.grpc.a) com.google.common.base.u.p(aVar, "attrs");
                return this;
            }
        }

        public static a c() {
            return new a();
        }

        public List<x> a() {
            return this.f31499a;
        }

        public io.grpc.a b() {
            return this.f31500b;
        }

        public a d() {
            return c().e(this.f31499a).f(this.f31500b).c(this.f31501c);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("addrs", this.f31499a).d("attrs", this.f31500b).d("customOptions", Arrays.deepToString(this.f31501c)).toString();
        }

        private b(List<x> list, io.grpc.a aVar, Object[][] objArr) {
            this.f31499a = (List) com.google.common.base.u.p(list, "addresses are not set");
            this.f31500b = (io.grpc.a) com.google.common.base.u.p(aVar, "attrs");
            this.f31501c = (Object[][]) com.google.common.base.u.p(objArr, "customOptions");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c {
        public abstract m0 a(d dVar);
    }

    /* loaded from: classes5.dex */
    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public io.grpc.f b() {
            throw new UnsupportedOperationException();
        }

        public h1 c() {
            throw new UnsupportedOperationException();
        }

        public void d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e(p pVar, i iVar);
    }

    /* loaded from: classes5.dex */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        private static final e f31505e = new e(null, null, f1.f30562f, false);

        /* renamed from: a  reason: collision with root package name */
        private final h f31506a;

        /* renamed from: b  reason: collision with root package name */
        private final k.a f31507b;

        /* renamed from: c  reason: collision with root package name */
        private final f1 f31508c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f31509d;

        private e(h hVar, k.a aVar, f1 f1Var, boolean z11) {
            this.f31506a = hVar;
            this.f31507b = aVar;
            this.f31508c = (f1) com.google.common.base.u.p(f1Var, PermissionsResponse.STATUS_KEY);
            this.f31509d = z11;
        }

        public static e e(f1 f1Var) {
            com.google.common.base.u.e(!f1Var.p(), "drop status shouldn't be OK");
            return new e(null, null, f1Var, true);
        }

        public static e f(f1 f1Var) {
            com.google.common.base.u.e(!f1Var.p(), "error status shouldn't be OK");
            return new e(null, null, f1Var, false);
        }

        public static e g() {
            return f31505e;
        }

        public static e h(h hVar) {
            return i(hVar, null);
        }

        public static e i(h hVar, k.a aVar) {
            return new e((h) com.google.common.base.u.p(hVar, "subchannel"), aVar, f1.f30562f, false);
        }

        public f1 a() {
            return this.f31508c;
        }

        public k.a b() {
            return this.f31507b;
        }

        public h c() {
            return this.f31506a;
        }

        public boolean d() {
            return this.f31509d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return com.google.common.base.q.a(this.f31506a, eVar.f31506a) && com.google.common.base.q.a(this.f31508c, eVar.f31508c) && com.google.common.base.q.a(this.f31507b, eVar.f31507b) && this.f31509d == eVar.f31509d;
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f31506a, this.f31508c, this.f31507b, Boolean.valueOf(this.f31509d));
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("subchannel", this.f31506a).d("streamTracerFactory", this.f31507b).d(PermissionsResponse.STATUS_KEY, this.f31508c).e("drop", this.f31509d).toString();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class f {
        public abstract io.grpc.c a();

        public abstract r0 b();

        public abstract s0<?, ?> c();
    }

    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f31510a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.a f31511b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f31512c;

        /* loaded from: classes5.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f31513a;

            /* renamed from: b  reason: collision with root package name */
            private io.grpc.a f31514b = io.grpc.a.f30500c;

            /* renamed from: c  reason: collision with root package name */
            private Object f31515c;

            a() {
            }

            public g a() {
                return new g(this.f31513a, this.f31514b, this.f31515c);
            }

            public a b(List<x> list) {
                this.f31513a = list;
                return this;
            }

            public a c(io.grpc.a aVar) {
                this.f31514b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f31515c = obj;
                return this;
            }
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f31510a;
        }

        public io.grpc.a b() {
            return this.f31511b;
        }

        public Object c() {
            return this.f31512c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                return com.google.common.base.q.a(this.f31510a, gVar.f31510a) && com.google.common.base.q.a(this.f31511b, gVar.f31511b) && com.google.common.base.q.a(this.f31512c, gVar.f31512c);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f31510a, this.f31511b, this.f31512c);
        }

        public String toString() {
            return com.google.common.base.o.c(this).d("addresses", this.f31510a).d("attributes", this.f31511b).d("loadBalancingPolicyConfig", this.f31512c).toString();
        }

        private g(List<x> list, io.grpc.a aVar, Object obj) {
            this.f31510a = Collections.unmodifiableList(new ArrayList((Collection) com.google.common.base.u.p(list, "addresses")));
            this.f31511b = (io.grpc.a) com.google.common.base.u.p(aVar, "attributes");
            this.f31512c = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class h {
        public final x a() {
            List<x> b11 = b();
            com.google.common.base.u.x(b11.size() == 1, "%s does not have exactly one group", b11);
            return b11.get(0);
        }

        public List<x> b() {
            throw new UnsupportedOperationException();
        }

        public abstract io.grpc.a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class i {
        public abstract e a(f fVar);
    }

    /* loaded from: classes5.dex */
    public interface j {
        void a(q qVar);
    }

    public boolean a() {
        return false;
    }

    public abstract void b(f1 f1Var);

    public abstract void c(g gVar);

    public abstract void d();
}
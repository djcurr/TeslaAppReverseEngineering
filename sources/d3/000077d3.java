package io.grpc;

import io.grpc.e1;
import io.grpc.t0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f31672e = Logger.getLogger(v0.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private static v0 f31673f;

    /* renamed from: a  reason: collision with root package name */
    private final t0.d f31674a = new b();

    /* renamed from: b  reason: collision with root package name */
    private String f31675b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<u0> f31676c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private com.google.common.collect.t<String, u0> f31677d = com.google.common.collect.t.l();

    /* loaded from: classes5.dex */
    private final class b extends t0.d {
        private b() {
        }

        @Override // io.grpc.t0.d
        public String a() {
            String str;
            synchronized (v0.this) {
                str = v0.this.f31675b;
            }
            return str;
        }

        @Override // io.grpc.t0.d
        public t0 b(URI uri, t0.b bVar) {
            u0 u0Var = v0.this.f().get(uri.getScheme());
            if (u0Var == null) {
                return null;
            }
            return u0Var.b(uri, bVar);
        }
    }

    /* loaded from: classes5.dex */
    private static final class c implements e1.b<u0> {
        private c() {
        }

        @Override // io.grpc.e1.b
        /* renamed from: c */
        public int b(u0 u0Var) {
            return u0Var.e();
        }

        @Override // io.grpc.e1.b
        /* renamed from: d */
        public boolean a(u0 u0Var) {
            return u0Var.d();
        }
    }

    private synchronized void b(u0 u0Var) {
        com.google.common.base.u.e(u0Var.d(), "isAvailable() returned false");
        this.f31676c.add(u0Var);
    }

    public static synchronized v0 d() {
        v0 v0Var;
        synchronized (v0.class) {
            if (f31673f == null) {
                List<u0> e11 = e1.e(u0.class, e(), u0.class.getClassLoader(), new c());
                if (e11.isEmpty()) {
                    f31672e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f31673f = new v0();
                for (u0 u0Var : e11) {
                    Logger logger = f31672e;
                    logger.fine("Service loader found " + u0Var);
                    if (u0Var.d()) {
                        f31673f.b(u0Var);
                    }
                }
                f31673f.g();
            }
            v0Var = f31673f;
        }
        return v0Var;
    }

    static List<Class<?>> e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.internal.d0.class);
        } catch (ClassNotFoundException e11) {
            f31672e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        HashMap hashMap = new HashMap();
        int i11 = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<u0> it2 = this.f31676c.iterator();
        while (it2.hasNext()) {
            u0 next = it2.next();
            String c11 = next.c();
            u0 u0Var = (u0) hashMap.get(c11);
            if (u0Var == null || u0Var.e() < next.e()) {
                hashMap.put(c11, next);
            }
            if (i11 < next.e()) {
                i11 = next.e();
                str = next.c();
            }
        }
        this.f31677d = com.google.common.collect.t.c(hashMap);
        this.f31675b = str;
    }

    public t0.d c() {
        return this.f31674a;
    }

    synchronized Map<String, u0> f() {
        return this.f31677d;
    }
}
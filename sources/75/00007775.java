package io.grpc;

import io.grpc.e1;
import io.grpc.internal.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: d  reason: collision with root package name */
    private static o0 f31520d;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<n0> f31522a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, n0> f31523b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f31519c = Logger.getLogger(o0.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final Iterable<Class<?>> f31521e = c();

    /* loaded from: classes5.dex */
    private static final class a implements e1.b<n0> {
        a() {
        }

        @Override // io.grpc.e1.b
        /* renamed from: c */
        public int b(n0 n0Var) {
            return n0Var.c();
        }

        @Override // io.grpc.e1.b
        /* renamed from: d */
        public boolean a(n0 n0Var) {
            return n0Var.d();
        }
    }

    private synchronized void a(n0 n0Var) {
        com.google.common.base.u.e(n0Var.d(), "isAvailable() returned false");
        this.f31522a.add(n0Var);
    }

    public static synchronized o0 b() {
        o0 o0Var;
        synchronized (o0.class) {
            if (f31520d == null) {
                List<n0> e11 = e1.e(n0.class, f31521e, n0.class.getClassLoader(), new a());
                f31520d = new o0();
                for (n0 n0Var : e11) {
                    Logger logger = f31519c;
                    logger.fine("Service loader found " + n0Var);
                    if (n0Var.d()) {
                        f31520d.a(n0Var);
                    }
                }
                f31520d.e();
            }
            o0Var = f31520d;
        }
        return o0Var;
    }

    static List<Class<?>> c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i11 = r1.f31204b;
            arrayList.add(r1.class);
        } catch (ClassNotFoundException e11) {
            f31519c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e11);
        }
        try {
            int i12 = rx.b.f49734b;
            arrayList.add(rx.b.class);
        } catch (ClassNotFoundException e12) {
            f31519c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        this.f31523b.clear();
        Iterator<n0> it2 = this.f31522a.iterator();
        while (it2.hasNext()) {
            n0 next = it2.next();
            String b11 = next.b();
            n0 n0Var = this.f31523b.get(b11);
            if (n0Var == null || n0Var.c() < next.c()) {
                this.f31523b.put(b11, next);
            }
        }
    }

    public synchronized n0 d(String str) {
        return this.f31523b.get(com.google.common.base.u.p(str, "policy"));
    }
}
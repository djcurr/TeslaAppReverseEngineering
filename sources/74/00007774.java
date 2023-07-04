package io.grpc;

import io.grpc.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final o f31517b = new o(new l.a(), l.b.f31488a);

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, n> f31518a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f31518a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f31517b;
    }

    public n b(String str) {
        return this.f31518a.get(str);
    }
}
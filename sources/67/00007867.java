package io.realm.internal;

import io.realm.l0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends l0>, c> f31919a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final n f31920b;

    /* renamed from: c  reason: collision with root package name */
    private final OsSchemaInfo f31921c;

    public b(n nVar, OsSchemaInfo osSchemaInfo) {
        new HashMap();
        this.f31920b = nVar;
        this.f31921c = osSchemaInfo;
    }

    public c a(Class<? extends l0> cls) {
        c cVar = this.f31919a.get(cls);
        if (cVar == null) {
            c d11 = this.f31920b.d(cls, this.f31921c);
            this.f31919a.put(cls, d11);
            return d11;
        }
        return cVar;
    }

    public void b() {
        for (Map.Entry<Class<? extends l0>, c> entry : this.f31919a.entrySet()) {
            entry.getValue().c(this.f31920b.d(entry.getKey(), this.f31921c));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnIndices[");
        boolean z11 = false;
        for (Map.Entry<Class<? extends l0>, c> entry : this.f31919a.entrySet()) {
            if (z11) {
                sb2.append(",");
            }
            sb2.append(entry.getKey().getSimpleName());
            sb2.append("->");
            sb2.append(entry.getValue());
            z11 = true;
        }
        sb2.append("]");
        return sb2.toString();
    }
}
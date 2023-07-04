package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class v0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f31247a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f31247a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f31247a.isEmpty();
    }

    public final void e(T t11, boolean z11) {
        int size = this.f31247a.size();
        if (z11) {
            this.f31247a.add(t11);
            if (size == 0) {
                b();
            }
        } else if (this.f31247a.remove(t11) && size == 1) {
            c();
        }
    }
}
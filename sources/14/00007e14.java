package kj;

import ak.g0;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<g0> f34810a = new SparseArray<>();

    public g0 a(int i11) {
        g0 g0Var = this.f34810a.get(i11);
        if (g0Var == null) {
            g0 g0Var2 = new g0(Long.MAX_VALUE);
            this.f34810a.put(i11, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    public void b() {
        this.f34810a.clear();
    }
}
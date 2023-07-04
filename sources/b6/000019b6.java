package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<c0> f12329a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f12330b = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    private final yf.e f12331c = new yf.e();

    public void a(c0 c0Var) {
        this.f12331c.a();
        this.f12329a.put(c0Var.L(), c0Var);
    }

    public void b(c0 c0Var) {
        this.f12331c.a();
        int L = c0Var.L();
        this.f12329a.put(L, c0Var);
        this.f12330b.put(L, true);
    }

    public c0 c(int i11) {
        this.f12331c.a();
        return this.f12329a.get(i11);
    }

    public int d() {
        this.f12331c.a();
        return this.f12330b.size();
    }

    public int e(int i11) {
        this.f12331c.a();
        return this.f12330b.keyAt(i11);
    }

    public boolean f(int i11) {
        this.f12331c.a();
        return this.f12330b.get(i11);
    }

    public void g(int i11) {
        this.f12331c.a();
        if (!this.f12330b.get(i11)) {
            this.f12329a.remove(i11);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove root node " + i11 + " without using removeRootNode!");
    }

    public void h(int i11) {
        this.f12331c.a();
        if (i11 == -1) {
            return;
        }
        if (this.f12330b.get(i11)) {
            this.f12329a.remove(i11);
            this.f12330b.delete(i11);
            return;
        }
        throw new IllegalViewOperationException("View with tag " + i11 + " is not registered as a root view");
    }
}
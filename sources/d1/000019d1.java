package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f12371a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f12372b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f12373c = new SparseBooleanArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f12374a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12375b;

        a(c0 c0Var, int i11) {
            this.f12374a = c0Var;
            this.f12375b = i11;
        }
    }

    public n(y0 y0Var, k0 k0Var) {
        this.f12371a = y0Var;
        this.f12372b = k0Var;
    }

    private void a(c0 c0Var, c0 c0Var2, int i11) {
        wf.a.a(c0Var2.S() != l.PARENT);
        for (int i12 = 0; i12 < c0Var2.b(); i12++) {
            c0 a11 = c0Var2.a(i12);
            wf.a.a(a11.Z() == null);
            int l11 = c0Var.l();
            if (a11.S() == l.NONE) {
                d(c0Var, a11, i11);
            } else {
                b(c0Var, a11, i11);
            }
            i11 += c0Var.l() - l11;
        }
    }

    private void b(c0 c0Var, c0 c0Var2, int i11) {
        c0Var.n(c0Var2, i11);
        this.f12371a.H(c0Var.L(), null, new z0[]{new z0(c0Var2.L(), i11)}, null);
        if (c0Var2.S() != l.PARENT) {
            a(c0Var, c0Var2, i11 + 1);
        }
    }

    private void c(c0 c0Var, c0 c0Var2, int i11) {
        int k11 = c0Var.k(c0Var.a(i11));
        if (c0Var.S() != l.PARENT) {
            a s11 = s(c0Var, k11);
            if (s11 == null) {
                return;
            }
            c0 c0Var3 = s11.f12374a;
            k11 = s11.f12375b;
            c0Var = c0Var3;
        }
        if (c0Var2.S() != l.NONE) {
            b(c0Var, c0Var2, k11);
        } else {
            d(c0Var, c0Var2, k11);
        }
    }

    private void d(c0 c0Var, c0 c0Var2, int i11) {
        a(c0Var, c0Var2, i11);
    }

    private void e(c0 c0Var) {
        int L = c0Var.L();
        if (this.f12373c.get(L)) {
            return;
        }
        this.f12373c.put(L, true);
        int y11 = c0Var.y();
        int r11 = c0Var.r();
        for (c0 parent = c0Var.getParent(); parent != null && parent.S() != l.PARENT; parent = parent.getParent()) {
            if (!parent.O()) {
                y11 += Math.round(parent.A());
                r11 += Math.round(parent.x());
            }
        }
        f(c0Var, y11, r11);
    }

    private void f(c0 c0Var, int i11, int i12) {
        if (c0Var.S() != l.NONE && c0Var.Z() != null) {
            this.f12371a.R(c0Var.Y().L(), c0Var.L(), i11, i12, c0Var.Q(), c0Var.F());
            return;
        }
        for (int i13 = 0; i13 < c0Var.b(); i13++) {
            c0 a11 = c0Var.a(i13);
            int L = a11.L();
            if (!this.f12373c.get(L)) {
                this.f12373c.put(L, true);
                f(a11, a11.y() + i11, a11.r() + i12);
            }
        }
    }

    public static void j(c0 c0Var) {
        c0Var.M();
    }

    private static boolean n(e0 e0Var) {
        if (e0Var == null) {
            return true;
        }
        if (!e0Var.g("collapsable") || e0Var.b("collapsable", true)) {
            ReadableMapKeySetIterator keySetIterator = e0Var.f12246a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                if (!g1.a(e0Var.f12246a, keySetIterator.nextKey())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void q(c0 c0Var, boolean z11) {
        if (c0Var.S() != l.PARENT) {
            for (int b11 = c0Var.b() - 1; b11 >= 0; b11--) {
                q(c0Var.a(b11), z11);
            }
        }
        c0 Z = c0Var.Z();
        if (Z != null) {
            int m11 = Z.m(c0Var);
            Z.z(m11);
            this.f12371a.H(Z.L(), new int[]{m11}, null, z11 ? new int[]{c0Var.L()} : null);
        }
    }

    private void r(c0 c0Var, e0 e0Var) {
        c0 parent = c0Var.getParent();
        if (parent == null) {
            c0Var.D(false);
            return;
        }
        int V = parent.V(c0Var);
        parent.G(V);
        q(c0Var, false);
        c0Var.D(false);
        this.f12371a.B(c0Var.R(), c0Var.L(), c0Var.u(), e0Var);
        parent.t(c0Var, V);
        c(parent, c0Var, V);
        for (int i11 = 0; i11 < c0Var.b(); i11++) {
            c(c0Var, c0Var.a(i11), i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(c0Var.L());
        sb2.append(" - rootTag: ");
        sb2.append(c0Var.T());
        sb2.append(" - hasProps: ");
        sb2.append(e0Var != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f12373c.size());
        nd.a.o("NativeViewHierarchyOptimizer", sb2.toString());
        wf.a.a(this.f12373c.size() == 0);
        e(c0Var);
        for (int i12 = 0; i12 < c0Var.b(); i12++) {
            e(c0Var.a(i12));
        }
        this.f12373c.clear();
    }

    private a s(c0 c0Var, int i11) {
        while (c0Var.S() != l.PARENT) {
            c0 parent = c0Var.getParent();
            if (parent == null) {
                return null;
            }
            i11 = i11 + (c0Var.S() == l.LEAF ? 1 : 0) + parent.k(c0Var);
            c0Var = parent;
        }
        return new a(c0Var, i11);
    }

    public void g(c0 c0Var, n0 n0Var, e0 e0Var) {
        c0Var.D(c0Var.u().equals(ReactViewManager.REACT_CLASS) && n(e0Var));
        if (c0Var.S() != l.NONE) {
            this.f12371a.B(n0Var, c0Var.L(), c0Var.u(), e0Var);
        }
    }

    public void h(c0 c0Var) {
        if (c0Var.a0()) {
            r(c0Var, null);
        }
    }

    public void i(c0 c0Var, int[] iArr, int[] iArr2, z0[] z0VarArr, int[] iArr3) {
        boolean z11;
        for (int i11 : iArr2) {
            int i12 = 0;
            while (true) {
                if (i12 >= iArr3.length) {
                    z11 = false;
                    break;
                } else if (iArr3[i12] == i11) {
                    z11 = true;
                    break;
                } else {
                    i12++;
                }
            }
            q(this.f12372b.c(i11), z11);
        }
        for (z0 z0Var : z0VarArr) {
            c(c0Var, this.f12372b.c(z0Var.f12509a), z0Var.f12510b);
        }
    }

    public void k(c0 c0Var, ReadableArray readableArray) {
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            c(c0Var, this.f12372b.c(readableArray.getInt(i11)), i11);
        }
    }

    public void l(c0 c0Var) {
        e(c0Var);
    }

    public void m(c0 c0Var, String str, e0 e0Var) {
        if (c0Var.a0() && !n(e0Var)) {
            r(c0Var, e0Var);
        } else if (c0Var.a0()) {
        } else {
            this.f12371a.S(c0Var.L(), str, e0Var);
        }
    }

    public void o() {
        this.f12373c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(c0 c0Var) {
        this.f12373c.clear();
    }
}
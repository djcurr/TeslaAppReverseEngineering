package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes3.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    protected Object f12389a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.facebook.react.uimanager.events.d f12390b;

    /* renamed from: c  reason: collision with root package name */
    protected final ReactApplicationContext f12391c;

    /* renamed from: d  reason: collision with root package name */
    protected final k0 f12392d;

    /* renamed from: e  reason: collision with root package name */
    private final d1 f12393e;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f12394f;

    /* renamed from: g  reason: collision with root package name */
    private final n f12395g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f12396h;

    /* renamed from: i  reason: collision with root package name */
    private long f12397i;

    /* renamed from: j  reason: collision with root package name */
    protected b f12398j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f12399k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f12400a;

        a(c0 c0Var) {
            this.f12400a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.f12392d.b(this.f12400a);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(c0 c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(ReactApplicationContext reactApplicationContext, d1 d1Var, com.facebook.react.uimanager.events.d dVar, int i11) {
        this(reactApplicationContext, d1Var, new y0(reactApplicationContext, new m(d1Var), i11), dVar);
    }

    private void A(int i11, int[] iArr) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 != null) {
            c0 parent = c11.getParent();
            if (parent != null) {
                B(c11, parent, iArr);
                return;
            }
            throw new IllegalViewOperationException("View with tag " + i11 + " doesn't have a parent!");
        }
        throw new IllegalViewOperationException("No native view for tag " + i11 + " exists!");
    }

    private void B(c0 c0Var, c0 c0Var2, int[] iArr) {
        int i11;
        int i12;
        if (c0Var == c0Var2 || c0Var.O()) {
            i11 = 0;
            i12 = 0;
        } else {
            i11 = Math.round(c0Var.A());
            i12 = Math.round(c0Var.x());
            for (c0 parent = c0Var.getParent(); parent != c0Var2; parent = parent.getParent()) {
                wf.a.c(parent);
                c(parent);
                i11 += Math.round(parent.A());
                i12 += Math.round(parent.x());
            }
            c(c0Var2);
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = c0Var.Q();
        iArr[3] = c0Var.F();
    }

    private void C(c0 c0Var) {
        if (c0Var.h()) {
            for (int i11 = 0; i11 < c0Var.b(); i11++) {
                C(c0Var.a(i11));
            }
            c0Var.X(this.f12395g);
        }
    }

    private void N(c0 c0Var) {
        n.j(c0Var);
        this.f12392d.g(c0Var.L());
        for (int b11 = c0Var.b() - 1; b11 >= 0; b11--) {
            N(c0Var.a(b11));
        }
        c0Var.j();
    }

    private void c(c0 c0Var) {
        ViewManager viewManager = (ViewManager) wf.a.c(this.f12393e.a(c0Var.u()));
        if (viewManager instanceof g) {
            g gVar = (g) viewManager;
            if (gVar == null || !gVar.needsCustomLayoutForChildren()) {
                return;
            }
            throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + c0Var.u() + "). Use measure instead.");
        }
        throw new IllegalViewOperationException("Trying to use view " + c0Var.u() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    private void d(int i11, String str) {
        if (this.f12392d.c(i11) != null) {
            return;
        }
        throw new IllegalViewOperationException("Unable to execute operation " + str + " on view with tag: " + i11 + ", since the view does not exists");
    }

    private void o() {
        if (this.f12394f.W()) {
            n(-1);
        }
    }

    private void y(int i11, int i12, int[] iArr) {
        c0 c11 = this.f12392d.c(i11);
        c0 c12 = this.f12392d.c(i12);
        if (c11 != null && c12 != null) {
            if (c11 != c12) {
                for (c0 parent = c11.getParent(); parent != c12; parent = parent.getParent()) {
                    if (parent == null) {
                        throw new IllegalViewOperationException("Tag " + i12 + " is not an ancestor of tag " + i11);
                    }
                }
            }
            B(c11, c12, iArr);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tag ");
        if (c11 != null) {
            i11 = i12;
        }
        sb2.append(i11);
        sb2.append(" does not exist");
        throw new IllegalViewOperationException(sb2.toString());
    }

    public void D() {
        this.f12399k = false;
    }

    public void E() {
    }

    public void F() {
        this.f12394f.X();
    }

    public void G() {
        this.f12394f.a0();
    }

    public void H(q0 q0Var) {
        this.f12394f.Y(q0Var);
    }

    public void I() {
        this.f12394f.Z();
    }

    public <T extends View> void J(T t11, int i11, n0 n0Var) {
        synchronized (this.f12389a) {
            c0 h11 = h();
            h11.w(i11);
            h11.p(n0Var);
            n0Var.runOnNativeModulesQueueThread(new a(h11));
            this.f12394f.x(i11, t11);
        }
    }

    public void K(int i11) {
        synchronized (this.f12389a) {
            this.f12392d.h(i11);
        }
    }

    public void L(int i11) {
        K(i11);
        this.f12394f.K(i11);
    }

    protected final void M(c0 c0Var) {
        N(c0Var);
        c0Var.dispose();
    }

    public void O(int i11) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i12 = 0; i12 < c11.b(); i12++) {
                createArray.pushInt(i12);
            }
            u(i11, null, null, null, null, createArray);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove subviews of an unknown view tag: " + i11);
    }

    public void P(int i11, int i12) {
        if (!this.f12392d.f(i11) && !this.f12392d.f(i12)) {
            c0 c11 = this.f12392d.c(i11);
            if (c11 != null) {
                c0 parent = c11.getParent();
                if (parent != null) {
                    int V = parent.V(c11);
                    if (V >= 0) {
                        WritableArray createArray = Arguments.createArray();
                        createArray.pushInt(i12);
                        WritableArray createArray2 = Arguments.createArray();
                        createArray2.pushInt(V);
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushInt(V);
                        u(parent.L(), null, null, createArray, createArray2, createArray3);
                        return;
                    }
                    throw new IllegalStateException("Didn't find child tag in parent");
                }
                throw new IllegalViewOperationException("Node is not attached to a parent: " + i11);
            }
            throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i11);
        }
        throw new IllegalViewOperationException("Trying to add or replace a root tag!");
    }

    public int Q(int i11) {
        if (this.f12392d.f(i11)) {
            return i11;
        }
        c0 R = R(i11);
        if (R != null) {
            return R.T();
        }
        nd.a.G("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i11);
        return 0;
    }

    public final c0 R(int i11) {
        return this.f12392d.c(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewManager S(String str) {
        return this.f12393e.c(str);
    }

    public void T(int i11, int i12) {
        this.f12394f.L(i11, i12);
    }

    public void U(int i11, ReadableArray readableArray) {
        if (this.f12399k) {
            synchronized (this.f12389a) {
                c0 c11 = this.f12392d.c(i11);
                for (int i12 = 0; i12 < readableArray.size(); i12++) {
                    c0 c12 = this.f12392d.c(readableArray.getInt(i12));
                    if (c12 != null) {
                        c11.t(c12, i12);
                    } else {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i12));
                    }
                }
                this.f12395g.k(c11, readableArray);
            }
        }
    }

    public void V(int i11, boolean z11) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 == null) {
            return;
        }
        while (c11.S() == l.NONE) {
            c11 = c11.getParent();
        }
        this.f12394f.M(c11.L(), i11, z11);
    }

    public void W(boolean z11) {
        this.f12394f.N(z11);
    }

    public void X(pg.a aVar) {
        this.f12394f.b0(aVar);
    }

    public void Y(int i11, Object obj) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 == null) {
            nd.a.G("ReactNative", "Attempt to set local data for view with unknown tag: " + i11);
            return;
        }
        c11.s(obj);
        o();
    }

    public void Z(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
        d(i11, "showPopupMenu");
        this.f12394f.O(i11, readableArray, callback, callback2);
    }

    public void a(q0 q0Var) {
        this.f12394f.P(q0Var);
    }

    public void a0(int i11, e0 e0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f12394f.U().updateProperties(i11, e0Var);
    }

    protected void b(c0 c0Var, float f11, float f12) {
        if (c0Var.h()) {
            Iterable<? extends c0> K = c0Var.K();
            if (K != null) {
                for (c0 c0Var2 : K) {
                    b(c0Var2, c0Var.A() + f11, c0Var.x() + f12);
                }
            }
            int L = c0Var.L();
            if (!this.f12392d.f(L) && c0Var.i(f11, f12, this.f12394f, this.f12395g) && c0Var.U()) {
                this.f12390b.g(o.c(-1, L, c0Var.y(), c0Var.r(), c0Var.Q(), c0Var.F()));
            }
            c0Var.c();
            this.f12395g.p(c0Var);
        }
    }

    public void b0(int i11, int i12, int i13) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 == null) {
            nd.a.G("ReactNative", "Tried to update size of non-existent tag: " + i11);
            return;
        }
        c11.P(i12);
        c11.d(i13);
        o();
    }

    public void c0(int i11, int i12, int i13) {
        c0 c11 = this.f12392d.c(i11);
        if (c11 == null) {
            nd.a.G("ReactNative", "Tried to update non-existent root tag: " + i11);
            return;
        }
        d0(c11, i12, i13);
    }

    public void d0(c0 c0Var, int i11, int i12) {
        c0Var.e(i11, i12);
    }

    protected void e(c0 c0Var) {
        zg.a.a(0L, "cssRoot.calculateLayout").a("rootTag", c0Var.L()).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = c0Var.getWidthMeasureSpec().intValue();
            int intValue2 = c0Var.getHeightMeasureSpec().intValue();
            float f11 = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f11 = View.MeasureSpec.getSize(intValue2);
            }
            c0Var.W(size, f11);
        } finally {
            com.facebook.systrace.a.g(0L);
            this.f12397i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    public void e0(int i11, String str, ReadableMap readableMap) {
        if (this.f12399k) {
            if (this.f12393e.a(str) != null) {
                c0 c11 = this.f12392d.c(i11);
                if (c11 == null) {
                    throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i11);
                } else if (readableMap != null) {
                    e0 e0Var = new e0(readableMap);
                    c11.E(e0Var);
                    t(c11, str, e0Var);
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalViewOperationException("Got unknown view type: " + str);
        }
    }

    public void f() {
        this.f12394f.z();
    }

    protected void f0() {
        com.facebook.systrace.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i11 = 0; i11 < this.f12392d.d(); i11++) {
            try {
                c0 c11 = this.f12392d.c(this.f12392d.e(i11));
                if (c11.getWidthMeasureSpec() != null && c11.getHeightMeasureSpec() != null) {
                    zg.a.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", c11.L()).c();
                    C(c11);
                    com.facebook.systrace.a.g(0L);
                    e(c11);
                    zg.a.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", c11.L()).c();
                    b(c11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    com.facebook.systrace.a.g(0L);
                    b bVar = this.f12398j;
                    if (bVar != null) {
                        this.f12394f.G(c11, bVar);
                    }
                }
            } finally {
                com.facebook.systrace.a.g(0L);
            }
        }
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f12394f.A(readableMap, callback);
    }

    @Deprecated
    public void g0(int i11, int i12, Callback callback) {
        c0 c11 = this.f12392d.c(i11);
        c0 c12 = this.f12392d.c(i12);
        if (c11 == null || c12 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(c11.C(c12)));
        }
    }

    protected c0 h() {
        d0 d0Var = new d0();
        if (jg.a.d().g(this.f12391c)) {
            d0Var.f(com.facebook.yoga.h.RTL);
        }
        d0Var.I("Root");
        return d0Var;
    }

    protected c0 i(String str) {
        return this.f12393e.a(str).createShadowNodeInstance(this.f12391c);
    }

    public void j(int i11, String str, int i12, ReadableMap readableMap) {
        if (this.f12399k) {
            synchronized (this.f12389a) {
                c0 i13 = i(str);
                c0 c11 = this.f12392d.c(i12);
                wf.a.d(c11, "Root node with tag " + i12 + " doesn't exist");
                i13.w(i11);
                i13.I(str);
                i13.o(c11.L());
                i13.p(c11.R());
                this.f12392d.a(i13);
                e0 e0Var = null;
                if (readableMap != null) {
                    e0Var = new e0(readableMap);
                    i13.E(e0Var);
                }
                s(i13, i12, e0Var);
            }
        }
    }

    public void k() {
        this.f12394f.C();
    }

    @Deprecated
    public void l(int i11, int i12, ReadableArray readableArray) {
        d(i11, "dispatchViewManagerCommand: " + i12);
        this.f12394f.D(i11, i12, readableArray);
    }

    public void m(int i11, String str, ReadableArray readableArray) {
        d(i11, "dispatchViewManagerCommand: " + str);
        this.f12394f.E(i11, str, readableArray);
    }

    public void n(int i11) {
        zg.a.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i11).c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            f0();
            this.f12395g.o();
            this.f12394f.y(i11, uptimeMillis, this.f12397i);
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    public void p(int i11, float f11, float f12, Callback callback) {
        this.f12394f.F(i11, f11, f12, callback);
    }

    public Map<String, Long> q() {
        return this.f12394f.V();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0 r() {
        return this.f12394f;
    }

    protected void s(c0 c0Var, int i11, e0 e0Var) {
        if (c0Var.O()) {
            return;
        }
        this.f12395g.g(c0Var, c0Var.R(), e0Var);
    }

    protected void t(c0 c0Var, String str, e0 e0Var) {
        if (c0Var.O()) {
            return;
        }
        this.f12395g.m(c0Var, str, e0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r25 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r11 != r25.size()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        throw new com.facebook.react.uimanager.IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(int r21, com.facebook.react.bridge.ReadableArray r22, com.facebook.react.bridge.ReadableArray r23, com.facebook.react.bridge.ReadableArray r24, com.facebook.react.bridge.ReadableArray r25, com.facebook.react.bridge.ReadableArray r26) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.r0.u(int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    public void v(int i11, Callback callback) {
        if (this.f12399k) {
            this.f12394f.I(i11, callback);
        }
    }

    public void w(int i11, Callback callback) {
        if (this.f12399k) {
            this.f12394f.J(i11, callback);
        }
    }

    public void x(int i11, int i12, Callback callback, Callback callback2) {
        if (this.f12399k) {
            try {
                y(i11, i12, this.f12396h);
                callback2.invoke(Float.valueOf(p.a(this.f12396h[0])), Float.valueOf(p.a(this.f12396h[1])), Float.valueOf(p.a(this.f12396h[2])), Float.valueOf(p.a(this.f12396h[3])));
            } catch (IllegalViewOperationException e11) {
                callback.invoke(e11.getMessage());
            }
        }
    }

    public void z(int i11, Callback callback, Callback callback2) {
        if (this.f12399k) {
            try {
                A(i11, this.f12396h);
                callback2.invoke(Float.valueOf(p.a(this.f12396h[0])), Float.valueOf(p.a(this.f12396h[1])), Float.valueOf(p.a(this.f12396h[2])), Float.valueOf(p.a(this.f12396h[3])));
            } catch (IllegalViewOperationException e11) {
                callback.invoke(e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r0(ReactApplicationContext reactApplicationContext, d1 d1Var, y0 y0Var, com.facebook.react.uimanager.events.d dVar) {
        this.f12389a = new Object();
        k0 k0Var = new k0();
        this.f12392d = k0Var;
        this.f12396h = new int[4];
        this.f12397i = 0L;
        this.f12399k = true;
        this.f12391c = reactApplicationContext;
        this.f12393e = d1Var;
        this.f12394f = y0Var;
        this.f12395g = new n(y0Var, k0Var);
        this.f12390b = dVar;
    }
}
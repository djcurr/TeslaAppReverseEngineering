package b4;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.a0;
import b4.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import w3.d;
import w3.e;

/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: k  reason: collision with root package name */
    private static final Rect f7367k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l  reason: collision with root package name */
    private static final b.a<w3.c> f7368l = new C0145a();

    /* renamed from: m  reason: collision with root package name */
    private static final b.InterfaceC0146b<h<w3.c>, w3.c> f7369m = new b();

    /* renamed from: e  reason: collision with root package name */
    private final AccessibilityManager f7374e;

    /* renamed from: f  reason: collision with root package name */
    private final View f7375f;

    /* renamed from: g  reason: collision with root package name */
    private c f7376g;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f7370a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f7371b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f7372c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final int[] f7373d = new int[2];

    /* renamed from: h  reason: collision with root package name */
    int f7377h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    int f7378i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private int f7379j = Integer.MIN_VALUE;

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0145a implements b.a<w3.c> {
        C0145a() {
        }

        @Override // b4.b.a
        /* renamed from: b */
        public void a(w3.c cVar, Rect rect) {
            cVar.m(rect);
        }
    }

    /* loaded from: classes.dex */
    class b implements b.InterfaceC0146b<h<w3.c>, w3.c> {
        b() {
        }

        @Override // b4.b.InterfaceC0146b
        /* renamed from: c */
        public w3.c a(h<w3.c> hVar, int i11) {
            return hVar.q(i11);
        }

        @Override // b4.b.InterfaceC0146b
        /* renamed from: d */
        public int b(h<w3.c> hVar) {
            return hVar.p();
        }
    }

    /* loaded from: classes.dex */
    private class c extends d {
        c() {
        }

        @Override // w3.d
        public w3.c b(int i11) {
            return w3.c.R(a.this.u(i11));
        }

        @Override // w3.d
        public w3.c d(int i11) {
            int i12 = i11 == 2 ? a.this.f7377h : a.this.f7378i;
            if (i12 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i12);
        }

        @Override // w3.d
        public boolean f(int i11, int i12, Bundle bundle) {
            return a.this.C(i11, i12, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f7375f = view;
            this.f7374e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (a0.D(view) == 0) {
                a0.G0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean D(int i11, int i12, Bundle bundle) {
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 64) {
                    if (i12 != 128) {
                        return w(i11, i12, bundle);
                    }
                    return a(i11);
                }
                return F(i11);
            }
            return b(i11);
        }
        return G(i11);
    }

    private boolean E(int i11, Bundle bundle) {
        return a0.l0(this.f7375f, i11, bundle);
    }

    private boolean F(int i11) {
        int i12;
        if (this.f7374e.isEnabled() && this.f7374e.isTouchExplorationEnabled() && (i12 = this.f7377h) != i11) {
            if (i12 != Integer.MIN_VALUE) {
                a(i12);
            }
            this.f7377h = i11;
            this.f7375f.invalidate();
            H(i11, 32768);
            return true;
        }
        return false;
    }

    private void I(int i11) {
        int i12 = this.f7379j;
        if (i12 == i11) {
            return;
        }
        this.f7379j = i11;
        H(i11, 128);
        H(i12, 256);
    }

    private boolean a(int i11) {
        if (this.f7377h == i11) {
            this.f7377h = Integer.MIN_VALUE;
            this.f7375f.invalidate();
            H(i11, 65536);
            return true;
        }
        return false;
    }

    private boolean c() {
        int i11 = this.f7378i;
        return i11 != Integer.MIN_VALUE && w(i11, 16, null);
    }

    private AccessibilityEvent d(int i11, int i12) {
        if (i11 != -1) {
            return e(i11, i12);
        }
        return f(i12);
    }

    private AccessibilityEvent e(int i11, int i12) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        w3.c u11 = u(i11);
        obtain.getText().add(u11.y());
        obtain.setContentDescription(u11.r());
        obtain.setScrollable(u11.L());
        obtain.setPassword(u11.K());
        obtain.setEnabled(u11.G());
        obtain.setChecked(u11.E());
        y(i11, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(u11.p());
        e.c(obtain, this.f7375f, i11);
        obtain.setPackageName(this.f7375f.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent f(int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        this.f7375f.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private w3.c g(int i11) {
        w3.c P = w3.c.P();
        P.k0(true);
        P.m0(true);
        P.c0("android.view.View");
        Rect rect = f7367k;
        P.Y(rect);
        P.Z(rect);
        P.x0(this.f7375f);
        A(i11, P);
        if (P.y() == null && P.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        P.m(this.f7371b);
        if (!this.f7371b.equals(rect)) {
            int k11 = P.k();
            if ((k11 & 64) == 0) {
                if ((k11 & 128) == 0) {
                    P.v0(this.f7375f.getContext().getPackageName());
                    P.H0(this.f7375f, i11);
                    if (this.f7377h == i11) {
                        P.W(true);
                        P.a(128);
                    } else {
                        P.W(false);
                        P.a(64);
                    }
                    boolean z11 = this.f7378i == i11;
                    if (z11) {
                        P.a(2);
                    } else if (P.H()) {
                        P.a(1);
                    }
                    P.n0(z11);
                    this.f7375f.getLocationOnScreen(this.f7373d);
                    P.n(this.f7370a);
                    if (this.f7370a.equals(rect)) {
                        P.m(this.f7370a);
                        if (P.f55449b != -1) {
                            w3.c P2 = w3.c.P();
                            for (int i12 = P.f55449b; i12 != -1; i12 = P2.f55449b) {
                                P2.y0(this.f7375f, -1);
                                P2.Y(f7367k);
                                A(i12, P2);
                                P2.m(this.f7371b);
                                Rect rect2 = this.f7370a;
                                Rect rect3 = this.f7371b;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            P2.T();
                        }
                        this.f7370a.offset(this.f7373d[0] - this.f7375f.getScrollX(), this.f7373d[1] - this.f7375f.getScrollY());
                    }
                    if (this.f7375f.getLocalVisibleRect(this.f7372c)) {
                        this.f7372c.offset(this.f7373d[0] - this.f7375f.getScrollX(), this.f7373d[1] - this.f7375f.getScrollY());
                        if (this.f7370a.intersect(this.f7372c)) {
                            P.Z(this.f7370a);
                            if (r(this.f7370a)) {
                                P.N0(true);
                            }
                        }
                    }
                    return P;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private w3.c h() {
        w3.c Q = w3.c.Q(this.f7375f);
        a0.j0(this.f7375f, Q);
        ArrayList arrayList = new ArrayList();
        p(arrayList);
        if (Q.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Q.d(this.f7375f, ((Integer) arrayList.get(i11)).intValue());
        }
        return Q;
    }

    private h<w3.c> l() {
        ArrayList arrayList = new ArrayList();
        p(arrayList);
        h<w3.c> hVar = new h<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            hVar.l(arrayList.get(i11).intValue(), g(arrayList.get(i11).intValue()));
        }
        return hVar;
    }

    private void m(int i11, Rect rect) {
        u(i11).m(rect);
    }

    private static Rect q(View view, int i11, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i11 == 17) {
            rect.set(width, 0, width, height);
        } else if (i11 == 33) {
            rect.set(0, height, width, height);
        } else if (i11 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i11 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean r(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f7375f.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f7375f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int s(int i11) {
        if (i11 != 19) {
            if (i11 != 21) {
                if (i11 != 22) {
                    return com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean t(int i11, Rect rect) {
        w3.c cVar;
        h<w3.c> l11 = l();
        int i12 = this.f7378i;
        w3.c g11 = i12 == Integer.MIN_VALUE ? null : l11.g(i12);
        if (i11 == 1 || i11 == 2) {
            cVar = (w3.c) b4.b.d(l11, f7369m, f7368l, g11, i11, a0.F(this.f7375f) == 1, false);
        } else if (i11 != 17 && i11 != 33 && i11 != 66 && i11 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i13 = this.f7378i;
            if (i13 != Integer.MIN_VALUE) {
                m(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                q(this.f7375f, i11, rect2);
            }
            cVar = (w3.c) b4.b.c(l11, f7369m, f7368l, g11, rect2, i11);
        }
        return G(cVar != null ? l11.k(l11.j(cVar)) : Integer.MIN_VALUE);
    }

    protected abstract void A(int i11, w3.c cVar);

    protected abstract void B(int i11, boolean z11);

    boolean C(int i11, int i12, Bundle bundle) {
        if (i11 != -1) {
            return D(i11, i12, bundle);
        }
        return E(i12, bundle);
    }

    public final boolean G(int i11) {
        int i12;
        if ((this.f7375f.isFocused() || this.f7375f.requestFocus()) && (i12 = this.f7378i) != i11) {
            if (i12 != Integer.MIN_VALUE) {
                b(i12);
            }
            if (i11 == Integer.MIN_VALUE) {
                return false;
            }
            this.f7378i = i11;
            B(i11, true);
            H(i11, 8);
            return true;
        }
        return false;
    }

    public final boolean H(int i11, int i12) {
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.f7374e.isEnabled() || (parent = this.f7375f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f7375f, d(i11, i12));
    }

    public final boolean b(int i11) {
        if (this.f7378i != i11) {
            return false;
        }
        this.f7378i = Integer.MIN_VALUE;
        B(i11, false);
        H(i11, 8);
        return true;
    }

    @Override // androidx.core.view.a
    public d getAccessibilityNodeProvider(View view) {
        if (this.f7376g == null) {
            this.f7376g = new c();
        }
        return this.f7376g;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.f7374e.isEnabled() && this.f7374e.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f7379j != Integer.MIN_VALUE) {
                    I(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int o11 = o(motionEvent.getX(), motionEvent.getY());
            I(o11);
            return o11 != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean j(KeyEvent keyEvent) {
        int i11 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int s11 = s(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i11 < repeatCount && t(s11, null)) {
                                    i11++;
                                    z11 = true;
                                }
                                return z11;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    c();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return t(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return t(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int k() {
        return this.f7377h;
    }

    public final int n() {
        return this.f7378i;
    }

    protected abstract int o(float f11, float f12);

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        x(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        z(cVar);
    }

    protected abstract void p(List<Integer> list);

    w3.c u(int i11) {
        if (i11 == -1) {
            return h();
        }
        return g(i11);
    }

    public final void v(boolean z11, int i11, Rect rect) {
        int i12 = this.f7378i;
        if (i12 != Integer.MIN_VALUE) {
            b(i12);
        }
        if (z11) {
            t(i11, rect);
        }
    }

    protected abstract boolean w(int i11, int i12, Bundle bundle);

    protected void x(AccessibilityEvent accessibilityEvent) {
    }

    protected void y(int i11, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void z(w3.c cVar);
}
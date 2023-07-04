package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j0;
import androidx.core.view.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: z  reason: collision with root package name */
    private static final int f1467z = g.g.f27153m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1468b;

    /* renamed from: c  reason: collision with root package name */
    private final e f1469c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1470d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1471e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1472f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1473g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1474h;

    /* renamed from: i  reason: collision with root package name */
    final j0 f1475i;

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1478l;

    /* renamed from: m  reason: collision with root package name */
    private View f1479m;

    /* renamed from: n  reason: collision with root package name */
    View f1480n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f1481o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f1482p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1483q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1484t;

    /* renamed from: w  reason: collision with root package name */
    private int f1485w;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1487y;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1476j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1477k = new b();

    /* renamed from: x  reason: collision with root package name */
    private int f1486x = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.b() || l.this.f1475i.A()) {
                return;
            }
            View view = l.this.f1480n;
            if (view != null && view.isShown()) {
                l.this.f1475i.show();
            } else {
                l.this.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1482p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1482p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1482p.removeGlobalOnLayoutListener(lVar.f1476j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i11, int i12, boolean z11) {
        this.f1468b = context;
        this.f1469c = eVar;
        this.f1471e = z11;
        this.f1470d = new d(eVar, LayoutInflater.from(context), z11, f1467z);
        this.f1473g = i11;
        this.f1474h = i12;
        Resources resources = context.getResources();
        this.f1472f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f27077d));
        this.f1479m = view;
        this.f1475i = new j0(context, null, i11, i12);
        eVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f1483q || (view = this.f1479m) == null) {
            return false;
        }
        this.f1480n = view;
        this.f1475i.J(this);
        this.f1475i.K(this);
        this.f1475i.I(true);
        View view2 = this.f1480n;
        boolean z11 = this.f1482p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1482p = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1476j);
        }
        view2.addOnAttachStateChangeListener(this.f1477k);
        this.f1475i.C(view2);
        this.f1475i.F(this.f1486x);
        if (!this.f1484t) {
            this.f1485w = h.m(this.f1470d, null, this.f1468b, this.f1472f);
            this.f1484t = true;
        }
        this.f1475i.E(this.f1485w);
        this.f1475i.H(2);
        this.f1475i.G(l());
        this.f1475i.show();
        ListView o11 = this.f1475i.o();
        o11.setOnKeyListener(this);
        if (this.f1487y && this.f1469c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1468b).inflate(g.g.f27152l, (ViewGroup) o11, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1469c.x());
            }
            frameLayout.setEnabled(false);
            o11.addHeaderView(frameLayout, null, false);
        }
        this.f1475i.m(this.f1470d);
        this.f1475i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z11) {
        if (eVar != this.f1469c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1481o;
        if (aVar != null) {
            aVar.a(eVar, z11);
        }
    }

    @Override // m.e
    public boolean b() {
        return !this.f1483q && this.f1475i.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1481o = aVar;
    }

    @Override // m.e
    public void dismiss() {
        if (b()) {
            this.f1475i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1468b, mVar, this.f1480n, this.f1471e, this.f1473g, this.f1474h);
            iVar.j(this.f1481o);
            iVar.g(h.w(mVar));
            iVar.i(this.f1478l);
            this.f1478l = null;
            this.f1469c.e(false);
            int c11 = this.f1475i.c();
            int l11 = this.f1475i.l();
            if ((Gravity.getAbsoluteGravity(this.f1486x, a0.F(this.f1479m)) & 7) == 5) {
                c11 += this.f1479m.getWidth();
            }
            if (iVar.n(c11, l11)) {
                j.a aVar = this.f1481o;
                if (aVar != null) {
                    aVar.b(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z11) {
        this.f1484t = false;
        d dVar = this.f1470d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        this.f1479m = view;
    }

    @Override // m.e
    public ListView o() {
        return this.f1475i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1483q = true;
        this.f1469c.close();
        ViewTreeObserver viewTreeObserver = this.f1482p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1482p = this.f1480n.getViewTreeObserver();
            }
            this.f1482p.removeGlobalOnLayoutListener(this.f1476j);
            this.f1482p = null;
        }
        this.f1480n.removeOnAttachStateChangeListener(this.f1477k);
        PopupWindow.OnDismissListener onDismissListener = this.f1478l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i11 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z11) {
        this.f1470d.d(z11);
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i11) {
        this.f1486x = i11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i11) {
        this.f1475i.e(i11);
    }

    @Override // m.e
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1478l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z11) {
        this.f1487y = z11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i11) {
        this.f1475i.i(i11);
    }
}
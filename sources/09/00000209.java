package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.n0;
import androidx.core.view.a0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.b;

/* loaded from: classes.dex */
public class p extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final j0 A;

    /* renamed from: a  reason: collision with root package name */
    Context f1274a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1275b;

    /* renamed from: c  reason: collision with root package name */
    ActionBarOverlayLayout f1276c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f1277d;

    /* renamed from: e  reason: collision with root package name */
    b0 f1278e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f1279f;

    /* renamed from: g  reason: collision with root package name */
    View f1280g;

    /* renamed from: h  reason: collision with root package name */
    n0 f1281h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1282i;

    /* renamed from: j  reason: collision with root package name */
    d f1283j;

    /* renamed from: k  reason: collision with root package name */
    l.b f1284k;

    /* renamed from: l  reason: collision with root package name */
    b.a f1285l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1286m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<a.b> f1287n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1288o;

    /* renamed from: p  reason: collision with root package name */
    private int f1289p;

    /* renamed from: q  reason: collision with root package name */
    boolean f1290q;

    /* renamed from: r  reason: collision with root package name */
    boolean f1291r;

    /* renamed from: s  reason: collision with root package name */
    boolean f1292s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1293t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1294u;

    /* renamed from: v  reason: collision with root package name */
    l.h f1295v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1296w;

    /* renamed from: x  reason: collision with root package name */
    boolean f1297x;

    /* renamed from: y  reason: collision with root package name */
    final h0 f1298y;

    /* renamed from: z  reason: collision with root package name */
    final h0 f1299z;

    /* loaded from: classes.dex */
    class a extends i0 {
        a() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            View view2;
            p pVar = p.this;
            if (pVar.f1290q && (view2 = pVar.f1280g) != null) {
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                p.this.f1277d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            p.this.f1277d.setVisibility(8);
            p.this.f1277d.setTransitioning(false);
            p pVar2 = p.this;
            pVar2.f1295v = null;
            pVar2.H();
            ActionBarOverlayLayout actionBarOverlayLayout = p.this.f1276c;
            if (actionBarOverlayLayout != null) {
                a0.t0(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends i0 {
        b() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            p pVar = p.this;
            pVar.f1295v = null;
            pVar.f1277d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements j0 {
        c() {
        }

        @Override // androidx.core.view.j0
        public void a(View view) {
            ((View) p.this.f1277d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends l.b implements e.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f1303c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f1304d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f1305e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f1306f;

        public d(Context context, b.a aVar) {
            this.f1303c = context;
            this.f1305e = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f1304d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f1305e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f1305e == null) {
                return;
            }
            k();
            p.this.f1279f.l();
        }

        @Override // l.b
        public void c() {
            p pVar = p.this;
            if (pVar.f1283j != this) {
                return;
            }
            if (!p.G(pVar.f1291r, pVar.f1292s, false)) {
                p pVar2 = p.this;
                pVar2.f1284k = this;
                pVar2.f1285l = this.f1305e;
            } else {
                this.f1305e.d(this);
            }
            this.f1305e = null;
            p.this.F(false);
            p.this.f1279f.g();
            p.this.f1278e.n().sendAccessibilityEvent(32);
            p pVar3 = p.this;
            pVar3.f1276c.setHideOnContentScrollEnabled(pVar3.f1297x);
            p.this.f1283j = null;
        }

        @Override // l.b
        public View d() {
            WeakReference<View> weakReference = this.f1306f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // l.b
        public Menu e() {
            return this.f1304d;
        }

        @Override // l.b
        public MenuInflater f() {
            return new l.g(this.f1303c);
        }

        @Override // l.b
        public CharSequence g() {
            return p.this.f1279f.getSubtitle();
        }

        @Override // l.b
        public CharSequence i() {
            return p.this.f1279f.getTitle();
        }

        @Override // l.b
        public void k() {
            if (p.this.f1283j != this) {
                return;
            }
            this.f1304d.d0();
            try {
                this.f1305e.c(this, this.f1304d);
            } finally {
                this.f1304d.c0();
            }
        }

        @Override // l.b
        public boolean l() {
            return p.this.f1279f.j();
        }

        @Override // l.b
        public void m(View view) {
            p.this.f1279f.setCustomView(view);
            this.f1306f = new WeakReference<>(view);
        }

        @Override // l.b
        public void n(int i11) {
            o(p.this.f1274a.getResources().getString(i11));
        }

        @Override // l.b
        public void o(CharSequence charSequence) {
            p.this.f1279f.setSubtitle(charSequence);
        }

        @Override // l.b
        public void q(int i11) {
            r(p.this.f1274a.getResources().getString(i11));
        }

        @Override // l.b
        public void r(CharSequence charSequence) {
            p.this.f1279f.setTitle(charSequence);
        }

        @Override // l.b
        public void s(boolean z11) {
            super.s(z11);
            p.this.f1279f.setTitleOptional(z11);
        }

        public boolean t() {
            this.f1304d.d0();
            try {
                return this.f1305e.b(this, this.f1304d);
            } finally {
                this.f1304d.c0();
            }
        }
    }

    public p(Activity activity, boolean z11) {
        new ArrayList();
        this.f1287n = new ArrayList<>();
        this.f1289p = 0;
        this.f1290q = true;
        this.f1294u = true;
        this.f1298y = new a();
        this.f1299z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        N(decorView);
        if (z11) {
            return;
        }
        this.f1280g = decorView.findViewById(16908290);
    }

    static boolean G(boolean z11, boolean z12, boolean z13) {
        if (z13) {
            return true;
        }
        return (z11 || z12) ? false : true;
    }

    private b0 K(View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : Address.ADDRESS_NULL_PLACEHOLDER);
        throw new IllegalStateException(sb2.toString());
    }

    private void M() {
        if (this.f1293t) {
            this.f1293t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1276c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            V(false);
        }
    }

    private void N(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(g.f.f27130p);
        this.f1276c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1278e = K(view.findViewById(g.f.f27115a));
        this.f1279f = (ActionBarContextView) view.findViewById(g.f.f27120f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(g.f.f27117c);
        this.f1277d = actionBarContainer;
        b0 b0Var = this.f1278e;
        if (b0Var != null && this.f1279f != null && actionBarContainer != null) {
            this.f1274a = b0Var.getContext();
            boolean z11 = (this.f1278e.v() & 4) != 0;
            if (z11) {
                this.f1282i = true;
            }
            l.a b11 = l.a.b(this.f1274a);
            S(b11.a() || z11);
            Q(b11.g());
            TypedArray obtainStyledAttributes = this.f1274a.obtainStyledAttributes(null, g.j.f27179a, g.a.f27041c, 0);
            if (obtainStyledAttributes.getBoolean(g.j.f27229k, false)) {
                R(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g.j.f27219i, 0);
            if (dimensionPixelSize != 0) {
                P(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(p.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void Q(boolean z11) {
        this.f1288o = z11;
        if (!z11) {
            this.f1278e.s(null);
            this.f1277d.setTabContainer(this.f1281h);
        } else {
            this.f1277d.setTabContainer(null);
            this.f1278e.s(this.f1281h);
        }
        boolean z12 = true;
        boolean z13 = L() == 2;
        n0 n0Var = this.f1281h;
        if (n0Var != null) {
            if (z13) {
                n0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1276c;
                if (actionBarOverlayLayout != null) {
                    a0.t0(actionBarOverlayLayout);
                }
            } else {
                n0Var.setVisibility(8);
            }
        }
        this.f1278e.q(!this.f1288o && z13);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1276c;
        if (this.f1288o || !z13) {
            z12 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z12);
    }

    private boolean T() {
        return a0.a0(this.f1277d);
    }

    private void U() {
        if (this.f1293t) {
            return;
        }
        this.f1293t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1276c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        V(false);
    }

    private void V(boolean z11) {
        if (G(this.f1291r, this.f1292s, this.f1293t)) {
            if (this.f1294u) {
                return;
            }
            this.f1294u = true;
            J(z11);
        } else if (this.f1294u) {
            this.f1294u = false;
            I(z11);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z11) {
        l.h hVar;
        this.f1296w = z11;
        if (z11 || (hVar = this.f1295v) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void B(int i11) {
        C(this.f1274a.getString(i11));
    }

    @Override // androidx.appcompat.app.a
    public void C(CharSequence charSequence) {
        this.f1278e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f1278e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public l.b E(b.a aVar) {
        d dVar = this.f1283j;
        if (dVar != null) {
            dVar.c();
        }
        this.f1276c.setHideOnContentScrollEnabled(false);
        this.f1279f.k();
        d dVar2 = new d(this.f1279f.getContext(), aVar);
        if (dVar2.t()) {
            this.f1283j = dVar2;
            dVar2.k();
            this.f1279f.h(dVar2);
            F(true);
            this.f1279f.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void F(boolean z11) {
        g0 m11;
        g0 f11;
        if (z11) {
            U();
        } else {
            M();
        }
        if (!T()) {
            if (z11) {
                this.f1278e.setVisibility(4);
                this.f1279f.setVisibility(0);
                return;
            }
            this.f1278e.setVisibility(0);
            this.f1279f.setVisibility(8);
            return;
        }
        if (z11) {
            f11 = this.f1278e.m(4, 100L);
            m11 = this.f1279f.f(0, 200L);
        } else {
            m11 = this.f1278e.m(0, 200L);
            f11 = this.f1279f.f(8, 100L);
        }
        l.h hVar = new l.h();
        hVar.d(f11, m11);
        hVar.h();
    }

    void H() {
        b.a aVar = this.f1285l;
        if (aVar != null) {
            aVar.d(this.f1284k);
            this.f1284k = null;
            this.f1285l = null;
        }
    }

    public void I(boolean z11) {
        View view;
        int[] iArr;
        l.h hVar = this.f1295v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f1289p == 0 && (this.f1296w || z11)) {
            this.f1277d.setAlpha(1.0f);
            this.f1277d.setTransitioning(true);
            l.h hVar2 = new l.h();
            float f11 = -this.f1277d.getHeight();
            if (z11) {
                this.f1277d.getLocationInWindow(new int[]{0, 0});
                f11 -= iArr[1];
            }
            g0 k11 = a0.e(this.f1277d).k(f11);
            k11.i(this.A);
            hVar2.c(k11);
            if (this.f1290q && (view = this.f1280g) != null) {
                hVar2.c(a0.e(view).k(f11));
            }
            hVar2.f(B);
            hVar2.e(250L);
            hVar2.g(this.f1298y);
            this.f1295v = hVar2;
            hVar2.h();
            return;
        }
        this.f1298y.b(null);
    }

    public void J(boolean z11) {
        View view;
        View view2;
        int[] iArr;
        l.h hVar = this.f1295v;
        if (hVar != null) {
            hVar.a();
        }
        this.f1277d.setVisibility(0);
        if (this.f1289p == 0 && (this.f1296w || z11)) {
            this.f1277d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f11 = -this.f1277d.getHeight();
            if (z11) {
                this.f1277d.getLocationInWindow(new int[]{0, 0});
                f11 -= iArr[1];
            }
            this.f1277d.setTranslationY(f11);
            l.h hVar2 = new l.h();
            g0 k11 = a0.e(this.f1277d).k(BitmapDescriptorFactory.HUE_RED);
            k11.i(this.A);
            hVar2.c(k11);
            if (this.f1290q && (view2 = this.f1280g) != null) {
                view2.setTranslationY(f11);
                hVar2.c(a0.e(this.f1280g).k(BitmapDescriptorFactory.HUE_RED));
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.f1299z);
            this.f1295v = hVar2;
            hVar2.h();
        } else {
            this.f1277d.setAlpha(1.0f);
            this.f1277d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.f1290q && (view = this.f1280g) != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            this.f1299z.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1276c;
        if (actionBarOverlayLayout != null) {
            a0.t0(actionBarOverlayLayout);
        }
    }

    public int L() {
        return this.f1278e.l();
    }

    public void O(int i11, int i12) {
        int v11 = this.f1278e.v();
        if ((i12 & 4) != 0) {
            this.f1282i = true;
        }
        this.f1278e.j((i11 & i12) | ((~i12) & v11));
    }

    public void P(float f11) {
        a0.D0(this.f1277d, f11);
    }

    public void R(boolean z11) {
        if (z11 && !this.f1276c.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1297x = z11;
        this.f1276c.setHideOnContentScrollEnabled(z11);
    }

    public void S(boolean z11) {
        this.f1278e.o(z11);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f1292s) {
            this.f1292s = false;
            V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b(int i11) {
        this.f1289p = i11;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z11) {
        this.f1290q = z11;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f1292s) {
            return;
        }
        this.f1292s = true;
        V(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        l.h hVar = this.f1295v;
        if (hVar != null) {
            hVar.a();
            this.f1295v = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        b0 b0Var = this.f1278e;
        if (b0Var == null || !b0Var.i()) {
            return false;
        }
        this.f1278e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z11) {
        if (z11 == this.f1286m) {
            return;
        }
        this.f1286m = z11;
        int size = this.f1287n.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f1287n.get(i11).a(z11);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f1278e.v();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f1275b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1274a.getTheme().resolveAttribute(g.a.f27045g, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f1275b = new ContextThemeWrapper(this.f1274a, i11);
            } else {
                this.f1275b = this.f1274a;
            }
        }
        return this.f1275b;
    }

    @Override // androidx.appcompat.app.a
    public void l() {
        if (this.f1291r) {
            return;
        }
        this.f1291r = true;
        V(false);
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        Q(l.a.b(this.f1274a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i11, KeyEvent keyEvent) {
        Menu e11;
        d dVar = this.f1283j;
        if (dVar == null || (e11 = dVar.e()) == null) {
            return false;
        }
        e11.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e11.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f1277d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(View view, a.C0035a c0035a) {
        view.setLayoutParams(c0035a);
        this.f1278e.w(view);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z11) {
        if (this.f1282i) {
            return;
        }
        v(z11);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z11) {
        O(z11 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z11) {
        O(z11 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void x(boolean z11) {
        O(z11 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void y(boolean z11) {
        O(z11 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void z(Drawable drawable) {
        this.f1278e.y(drawable);
    }

    public p(Dialog dialog) {
        new ArrayList();
        this.f1287n = new ArrayList<>();
        this.f1289p = 0;
        this.f1290q = true;
        this.f1294u = true;
        this.f1298y = new a();
        this.f1299z = new b();
        this.A = new c();
        N(dialog.getWindow().getDecorView());
    }
}
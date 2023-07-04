package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class v0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1953a;

    /* renamed from: b  reason: collision with root package name */
    private int f1954b;

    /* renamed from: c  reason: collision with root package name */
    private View f1955c;

    /* renamed from: d  reason: collision with root package name */
    private View f1956d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1957e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1958f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1959g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1960h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1961i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1962j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1963k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1964l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1965m;

    /* renamed from: n  reason: collision with root package name */
    private c f1966n;

    /* renamed from: o  reason: collision with root package name */
    private int f1967o;

    /* renamed from: p  reason: collision with root package name */
    private int f1968p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1969q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final m.a f1970a;

        a() {
            this.f1970a = new m.a(v0.this.f1953a.getContext(), 0, 16908332, 0, 0, v0.this.f1961i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0 v0Var = v0.this;
            Window.Callback callback = v0Var.f1964l;
            if (callback == null || !v0Var.f1965m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1970a);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1972a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1973b;

        b(int i11) {
            this.f1973b = i11;
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void a(View view) {
            this.f1972a = true;
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            if (this.f1972a) {
                return;
            }
            v0.this.f1953a.setVisibility(this.f1973b);
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            v0.this.f1953a.setVisibility(0);
        }
    }

    public v0(Toolbar toolbar, boolean z11) {
        this(toolbar, z11, g.h.f27161a, g.e.f27102n);
    }

    private void F(CharSequence charSequence) {
        this.f1961i = charSequence;
        if ((this.f1954b & 8) != 0) {
            this.f1953a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1954b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1963k)) {
                this.f1953a.setNavigationContentDescription(this.f1968p);
            } else {
                this.f1953a.setNavigationContentDescription(this.f1963k);
            }
        }
    }

    private void H() {
        if ((this.f1954b & 4) != 0) {
            Toolbar toolbar = this.f1953a;
            Drawable drawable = this.f1959g;
            if (drawable == null) {
                drawable = this.f1969q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1953a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i11 = this.f1954b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) != 0) {
            drawable = this.f1958f;
            if (drawable == null) {
                drawable = this.f1957e;
            }
        } else {
            drawable = this.f1957e;
        }
        this.f1953a.setLogo(drawable);
    }

    private int z() {
        if (this.f1953a.getNavigationIcon() != null) {
            this.f1969q = this.f1953a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(int i11) {
        if (i11 == this.f1968p) {
            return;
        }
        this.f1968p = i11;
        if (TextUtils.isEmpty(this.f1953a.getNavigationContentDescription())) {
            C(this.f1968p);
        }
    }

    public void B(Drawable drawable) {
        this.f1958f = drawable;
        I();
    }

    public void C(int i11) {
        D(i11 == 0 ? null : getContext().getString(i11));
    }

    public void D(CharSequence charSequence) {
        this.f1963k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f1962j = charSequence;
        if ((this.f1954b & 8) != 0) {
            this.f1953a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public void a(Drawable drawable) {
        androidx.core.view.a0.z0(this.f1953a, drawable);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean b() {
        return this.f1953a.d();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean c() {
        return this.f1953a.w();
    }

    @Override // androidx.appcompat.widget.b0
    public void collapseActionView() {
        this.f1953a.e();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean d() {
        return this.f1953a.O();
    }

    @Override // androidx.appcompat.widget.b0
    public void e(Menu menu, j.a aVar) {
        if (this.f1966n == null) {
            c cVar = new c(this.f1953a.getContext());
            this.f1966n = cVar;
            cVar.p(g.f.f27121g);
        }
        this.f1966n.d(aVar);
        this.f1953a.I((androidx.appcompat.view.menu.e) menu, this.f1966n);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean f() {
        return this.f1953a.A();
    }

    @Override // androidx.appcompat.widget.b0
    public void g() {
        this.f1965m = true;
    }

    @Override // androidx.appcompat.widget.b0
    public Context getContext() {
        return this.f1953a.getContext();
    }

    @Override // androidx.appcompat.widget.b0
    public CharSequence getTitle() {
        return this.f1953a.getTitle();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean h() {
        return this.f1953a.z();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean i() {
        return this.f1953a.v();
    }

    @Override // androidx.appcompat.widget.b0
    public void j(int i11) {
        View view;
        int i12 = this.f1954b ^ i11;
        this.f1954b = i11;
        if (i12 != 0) {
            if ((i12 & 4) != 0) {
                if ((i11 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i12 & 3) != 0) {
                I();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    this.f1953a.setTitle(this.f1961i);
                    this.f1953a.setSubtitle(this.f1962j);
                } else {
                    this.f1953a.setTitle((CharSequence) null);
                    this.f1953a.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) == 0 || (view = this.f1956d) == null) {
                return;
            }
            if ((i11 & 16) != 0) {
                this.f1953a.addView(view);
            } else {
                this.f1953a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.b0
    public Menu k() {
        return this.f1953a.getMenu();
    }

    @Override // androidx.appcompat.widget.b0
    public int l() {
        return this.f1967o;
    }

    @Override // androidx.appcompat.widget.b0
    public androidx.core.view.g0 m(int i11, long j11) {
        return androidx.core.view.a0.e(this.f1953a).a(i11 == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED).d(j11).f(new b(i11));
    }

    @Override // androidx.appcompat.widget.b0
    public ViewGroup n() {
        return this.f1953a;
    }

    @Override // androidx.appcompat.widget.b0
    public void o(boolean z11) {
    }

    @Override // androidx.appcompat.widget.b0
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b0
    public void q(boolean z11) {
        this.f1953a.setCollapsible(z11);
    }

    @Override // androidx.appcompat.widget.b0
    public void r() {
        this.f1953a.f();
    }

    @Override // androidx.appcompat.widget.b0
    public void s(n0 n0Var) {
        View view = this.f1955c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1953a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1955c);
            }
        }
        this.f1955c = n0Var;
        if (n0Var == null || this.f1967o != 2) {
            return;
        }
        this.f1953a.addView(n0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1955c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f1141a = 8388691;
        n0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.b0
    public void setIcon(int i11) {
        setIcon(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    @Override // androidx.appcompat.widget.b0
    public void setTitle(CharSequence charSequence) {
        this.f1960h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.b0
    public void setVisibility(int i11) {
        this.f1953a.setVisibility(i11);
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        this.f1964l = callback;
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1960h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.b0
    public void t(int i11) {
        B(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    @Override // androidx.appcompat.widget.b0
    public void u(j.a aVar, e.a aVar2) {
        this.f1953a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.b0
    public int v() {
        return this.f1954b;
    }

    @Override // androidx.appcompat.widget.b0
    public void w(View view) {
        View view2 = this.f1956d;
        if (view2 != null && (this.f1954b & 16) != 0) {
            this.f1953a.removeView(view2);
        }
        this.f1956d = view;
        if (view == null || (this.f1954b & 16) == 0) {
            return;
        }
        this.f1953a.addView(view);
    }

    @Override // androidx.appcompat.widget.b0
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.b0
    public void y(Drawable drawable) {
        this.f1959g = drawable;
        H();
    }

    public v0(Toolbar toolbar, boolean z11, int i11, int i12) {
        Drawable drawable;
        this.f1967o = 0;
        this.f1968p = 0;
        this.f1953a = toolbar;
        this.f1961i = toolbar.getTitle();
        this.f1962j = toolbar.getSubtitle();
        this.f1960h = this.f1961i != null;
        this.f1959g = toolbar.getNavigationIcon();
        u0 v11 = u0.v(toolbar.getContext(), null, g.j.f27179a, g.a.f27041c, 0);
        this.f1969q = v11.g(g.j.f27234l);
        if (z11) {
            CharSequence p11 = v11.p(g.j.f27264r);
            if (!TextUtils.isEmpty(p11)) {
                setTitle(p11);
            }
            CharSequence p12 = v11.p(g.j.f27254p);
            if (!TextUtils.isEmpty(p12)) {
                E(p12);
            }
            Drawable g11 = v11.g(g.j.f27244n);
            if (g11 != null) {
                B(g11);
            }
            Drawable g12 = v11.g(g.j.f27239m);
            if (g12 != null) {
                setIcon(g12);
            }
            if (this.f1959g == null && (drawable = this.f1969q) != null) {
                y(drawable);
            }
            j(v11.k(g.j.f27214h, 0));
            int n11 = v11.n(g.j.f27209g, 0);
            if (n11 != 0) {
                w(LayoutInflater.from(this.f1953a.getContext()).inflate(n11, (ViewGroup) this.f1953a, false));
                j(this.f1954b | 16);
            }
            int m11 = v11.m(g.j.f27224j, 0);
            if (m11 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1953a.getLayoutParams();
                layoutParams.height = m11;
                this.f1953a.setLayoutParams(layoutParams);
            }
            int e11 = v11.e(g.j.f27204f, -1);
            int e12 = v11.e(g.j.f27199e, -1);
            if (e11 >= 0 || e12 >= 0) {
                this.f1953a.H(Math.max(e11, 0), Math.max(e12, 0));
            }
            int n12 = v11.n(g.j.f27269s, 0);
            if (n12 != 0) {
                Toolbar toolbar2 = this.f1953a;
                toolbar2.L(toolbar2.getContext(), n12);
            }
            int n13 = v11.n(g.j.f27259q, 0);
            if (n13 != 0) {
                Toolbar toolbar3 = this.f1953a;
                toolbar3.K(toolbar3.getContext(), n13);
            }
            int n14 = v11.n(g.j.f27249o, 0);
            if (n14 != 0) {
                this.f1953a.setPopupTheme(n14);
            }
        } else {
            this.f1954b = z();
        }
        v11.w();
        A(i11);
        this.f1963k = this.f1953a.getNavigationContentDescription();
        this.f1953a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.b0
    public void setIcon(Drawable drawable) {
        this.f1957e = drawable;
        I();
    }
}
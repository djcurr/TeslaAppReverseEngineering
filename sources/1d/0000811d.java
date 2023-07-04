package l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.b;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f35941c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f35942d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f35943e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f35944f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f35945g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f35946h;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z11) {
        this.f35941c = context;
        this.f35942d = actionBarContextView;
        this.f35943e = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f35946h = S;
        S.R(this);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f35943e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f35942d.l();
    }

    @Override // l.b
    public void c() {
        if (this.f35945g) {
            return;
        }
        this.f35945g = true;
        this.f35942d.sendAccessibilityEvent(32);
        this.f35943e.d(this);
    }

    @Override // l.b
    public View d() {
        WeakReference<View> weakReference = this.f35944f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // l.b
    public Menu e() {
        return this.f35946h;
    }

    @Override // l.b
    public MenuInflater f() {
        return new g(this.f35942d.getContext());
    }

    @Override // l.b
    public CharSequence g() {
        return this.f35942d.getSubtitle();
    }

    @Override // l.b
    public CharSequence i() {
        return this.f35942d.getTitle();
    }

    @Override // l.b
    public void k() {
        this.f35943e.c(this, this.f35946h);
    }

    @Override // l.b
    public boolean l() {
        return this.f35942d.j();
    }

    @Override // l.b
    public void m(View view) {
        this.f35942d.setCustomView(view);
        this.f35944f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // l.b
    public void n(int i11) {
        o(this.f35941c.getString(i11));
    }

    @Override // l.b
    public void o(CharSequence charSequence) {
        this.f35942d.setSubtitle(charSequence);
    }

    @Override // l.b
    public void q(int i11) {
        r(this.f35941c.getString(i11));
    }

    @Override // l.b
    public void r(CharSequence charSequence) {
        this.f35942d.setTitle(charSequence);
    }

    @Override // l.b
    public void s(boolean z11) {
        super.s(z11);
        this.f35942d.setTitleOptional(z11);
    }
}
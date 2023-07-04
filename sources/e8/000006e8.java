package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final m<?> f4891a;

    private k(m<?> mVar) {
        this.f4891a = mVar;
    }

    public static k b(m<?> mVar) {
        return new k((m) v3.h.g(mVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        m<?> mVar = this.f4891a;
        mVar.f4895d.k(mVar, mVar, fragment);
    }

    public void c() {
        this.f4891a.f4895d.w();
    }

    public void d(Configuration configuration) {
        this.f4891a.f4895d.y(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f4891a.f4895d.z(menuItem);
    }

    public void f() {
        this.f4891a.f4895d.A();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f4891a.f4895d.B(menu, menuInflater);
    }

    public void h() {
        this.f4891a.f4895d.C();
    }

    public void i() {
        this.f4891a.f4895d.E();
    }

    public void j(boolean z11) {
        this.f4891a.f4895d.F(z11);
    }

    public boolean k(MenuItem menuItem) {
        return this.f4891a.f4895d.I(menuItem);
    }

    public void l(Menu menu) {
        this.f4891a.f4895d.J(menu);
    }

    public void m() {
        this.f4891a.f4895d.L();
    }

    public void n(boolean z11) {
        this.f4891a.f4895d.M(z11);
    }

    public boolean o(Menu menu) {
        return this.f4891a.f4895d.N(menu);
    }

    public void p() {
        this.f4891a.f4895d.P();
    }

    public void q() {
        this.f4891a.f4895d.Q();
    }

    public void r() {
        this.f4891a.f4895d.S();
    }

    public boolean s() {
        return this.f4891a.f4895d.Z(true);
    }

    public q t() {
        return this.f4891a.f4895d;
    }

    public void u() {
        this.f4891a.f4895d.S0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4891a.f4895d.u0().onCreateView(view, str, context, attributeSet);
    }
}
package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private Object f35934a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35935b;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f35934a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f35935b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i11);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f35934a = obj;
    }

    public abstract void q(int i11);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z11) {
        this.f35935b = z11;
    }
}
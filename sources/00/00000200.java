package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.v0;
import androidx.core.view.a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
class m extends androidx.appcompat.app.a {

    /* renamed from: a  reason: collision with root package name */
    b0 f1250a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1251b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f1252c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1253d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1254e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f1255f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f1256g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f1257h;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.H();
        }
    }

    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return m.this.f1252c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1260a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (this.f1260a) {
                return;
            }
            this.f1260a = true;
            m.this.f1250a.r();
            Window.Callback callback = m.this.f1252c;
            if (callback != null) {
                callback.onPanelClosed(108, eVar);
            }
            this.f1260a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = m.this.f1252c;
            if (callback != null) {
                callback.onMenuOpened(108, eVar);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            m mVar = m.this;
            if (mVar.f1252c != null) {
                if (mVar.f1250a.f()) {
                    m.this.f1252c.onPanelClosed(108, eVar);
                } else if (m.this.f1252c.onPreparePanel(0, null, eVar)) {
                    m.this.f1252c.onMenuOpened(108, eVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class e extends l.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // l.i, android.view.Window.Callback
        public View onCreatePanelView(int i11) {
            if (i11 == 0) {
                return new View(m.this.f1250a.getContext());
            }
            return super.onCreatePanelView(i11);
        }

        @Override // l.i, android.view.Window.Callback
        public boolean onPreparePanel(int i11, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (onPreparePanel) {
                m mVar = m.this;
                if (!mVar.f1251b) {
                    mVar.f1250a.g();
                    m.this.f1251b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1257h = bVar;
        this.f1250a = new v0(toolbar, false);
        e eVar = new e(callback);
        this.f1252c = eVar;
        this.f1250a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f1250a.setWindowTitle(charSequence);
    }

    private Menu F() {
        if (!this.f1253d) {
            this.f1250a.u(new c(), new d());
            this.f1253d = true;
        }
        return this.f1250a.k();
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z11) {
    }

    @Override // androidx.appcompat.app.a
    public void B(int i11) {
        b0 b0Var = this.f1250a;
        b0Var.setTitle(i11 != 0 ? b0Var.getContext().getText(i11) : null);
    }

    @Override // androidx.appcompat.app.a
    public void C(CharSequence charSequence) {
        this.f1250a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f1250a.setWindowTitle(charSequence);
    }

    public Window.Callback G() {
        return this.f1252c;
    }

    void H() {
        Menu F = F();
        androidx.appcompat.view.menu.e eVar = F instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) F : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            F.clear();
            if (!this.f1252c.onCreatePanelMenu(0, F) || !this.f1252c.onPreparePanel(0, null, F)) {
                F.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    public void I(int i11, int i12) {
        this.f1250a.j((i11 & i12) | ((~i12) & this.f1250a.v()));
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f1250a.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (this.f1250a.i()) {
            this.f1250a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z11) {
        if (z11 == this.f1254e) {
            return;
        }
        this.f1254e = z11;
        int size = this.f1255f.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f1255f.get(i11).a(z11);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f1250a.v();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f1250a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void l() {
        this.f1250a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        this.f1250a.n().removeCallbacks(this.f1256g);
        a0.o0(this.f1250a.n(), this.f1256g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        super.n(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void o() {
        this.f1250a.n().removeCallbacks(this.f1256g);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i11, KeyEvent keyEvent) {
        Menu F = F();
        if (F != null) {
            F.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return F.performShortcut(i11, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean r() {
        return this.f1250a.d();
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f1250a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(View view, a.C0035a c0035a) {
        if (view != null) {
            view.setLayoutParams(c0035a);
        }
        this.f1250a.w(view);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z11) {
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z11) {
        I(z11 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z11) {
        I(z11 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void x(boolean z11) {
        I(z11 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void y(boolean z11) {
        I(z11 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void z(Drawable drawable) {
        this.f1250a.y(drawable);
    }
}